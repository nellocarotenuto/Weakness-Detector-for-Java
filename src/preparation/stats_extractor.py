import os
import fnmatch

import libs.javalang.tokenizer as tokenizer
import src.preparation.labeler as labeler


RAW_DATA_DIR = "../../data/raw"

__project_files = {}
__files_count = {"safe": 0, "weak": 0}
__lines_count = {"safe": 0, "weak": 0}
__tokens_count = {"safe": 0, "weak": 0}


def __count_file_lines(file):
    """
        Counts the total number of rows and tokens in a file.

        :param file: The file to evaluate
        :type file: str

        :raises FileNotFoundError: If the file parser parameter doesn't exist

        :return: The number of rows and the number of tokens in the file specified as parameter
        :rtype: int, int
    """

    num_lines = 0
    num_tokens = 0

    source = ""

    with open(file, 'r') as f:
        for line in f:
            num_lines += 1
            source += line

    tokens = list(tokenizer.tokenize(source))
    num_tokens = len(tokens)

    return num_lines, num_tokens


def count_files():
    """
        Returns the dictionary containing the weak and safe file number.

        :return: The number of files safe and weak
        :rtype: dict
    """

    return __files_count


def count_lines():
    """
        Returns the dictionary containing the weak and safe numbers of line.

        :return: The number of lines safe and weak
        :rtype: dict
    """

    return __lines_count


def count_tokens():
    """
        Returns the dictionary containing the weak and safe tokens number.

        :return: The number of tokens safe and weak
        :rtype: dict
    """

    return __tokens_count


def count_project_files():
    """
    Returns the dictionary containing the weak and total number of files for every project.

    :return:  The total number of files and number of weak file for every project
    :rtype: dict
    """

    return __project_files


def __extract_stats():
    """
        This function counts the number of safe and weak files, lines of code and tokens in a file.
        It also counts the total and weak files for every project analyzed.
    """

    global __project_files
    global __files_count
    global __lines_count
    global __tokens_count

    projects = os.listdir(RAW_DATA_DIR)

    for project in projects:
        num_files_project = {"total_files": 0, "weak_files": 0}
        for path, dirs, files in os.walk(RAW_DATA_DIR + "/" + project):
            # Search for .java files in raw data directory
            for filename in fnmatch.filter(files, "*.java"):
                filepath = os.path.normpath(f"{path}/{filename}")

                num_files_project["total_files"] += 1

                if labeler.is_weak(filepath):
                    num_files_project["weak_files"] += 1

                    __files_count["weak"] += 1
                    lines_weak, tokens_weak = __count_file_lines(filepath)
                    __lines_count["weak"] += lines_weak
                    __tokens_count["weak"] += tokens_weak
                else:
                    __files_count["safe"] += 1
                    lines_safe, tokens_safe = __count_file_lines(filepath)
                    __lines_count["safe"] += lines_safe
                    __tokens_count["safe"] += tokens_safe

        __project_files[project] = num_files_project

