import os
import fnmatch

from lxml import etree


SPOTBUGS_REPORT_NAME = "spotbugsXml.xml"
SPOTBUGS_CATEGORIES = ["BAD_PRACTICE", "CORRECTNESS", "MALICIOUS_CODE", "MT_CORRECTNESS", "SECURITY"]
RAW_DATA_DIR = "../../data/raw"

__weak_files_list = None


def is_weak(file):
    """
        Checks whether a file is marked as vulnerable or not.

        :param file: The path (starting at ../../data/raw/) of the file to check
        :type file: str

        :return: True if the file is marked as vulnerable, False otherwise
        :rtype: bool
    """
    global __weak_files_list

    if file in __weak_files_list:
        return True
    else:
        return False


def __init_weak_files_list():
    """
        Initializes the weak files list at module level in order to avoid loading it every time.
    """
    global __weak_files_list

    if __weak_files_list is None:
        __weak_files_list = __list_weak_files()


def __list_weak_files():
    """
        This function evaluates the XML reports on our data and returns the list of vulnerable files inside the dataset.

        :return: The list of vulnerable files
        :rtype: list of str
    """
    weak_files = []

    raw_data_path = os.path.abspath(RAW_DATA_DIR)

    for path, dirs, files in os.walk(raw_data_path):
        # Search for XML reports in raw data directory
        for filename in fnmatch.filter(files, SPOTBUGS_REPORT_NAME):
            filepath = os.path.join(path, filename)

            # Parse XML tree to get BugCollection and then paths of source directory and bug instances
            bug_collection = etree.parse(filepath)
            project = bug_collection.find("Project")
            src_dirs = project.findall("SrcDir")
            bug_instances = bug_collection.findall("BugInstance")

            for bug_instance in bug_instances:
                # Get only bugs of selected categories
                category = bug_instance.get("category")

                if category in SPOTBUGS_CATEGORIES:
                    source_path = bug_instance.find("Class").find("SourceLine").get("sourcepath")

                    if isinstance(source_path, str):
                        # Case in which the report specifies the source file of the bugged class
                        source_file = source_path
                    else:
                        # Case in which the report only specifies the class name and the source file has to be derived
                        class_name = bug_instance.find("Class").find("SourceLine").get("classname").replace(".", "/")
                        dollar_index = class_name.find("$")

                        # Remove references to inner classes
                        class_name = class_name[0:dollar_index] if dollar_index > 0 else class_name
                        source_file = class_name + ".java"

                    for src_dir in src_dirs:
                        # Test the existence of the file for every source directory specified
                        file = RAW_DATA_DIR + "/" + src_dir.text + "/" + source_file

                        if os.path.exists(file) and file not in weak_files:
                            # Add the file to the list of vulnerable ones only if it wasn't added before
                            weak_files.append(file.replace("/./", "/"))
                            break

    return weak_files

