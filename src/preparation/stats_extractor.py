import os
import fnmatch
import re

import src.preparation.labeler as labeler


RAW_DATA_DIR = "../../data/raw"


def __count_file_lines(file):
    """
        Counts the total number of rows in a file.

        :param file: The file to evaluate
        :type file: str

        :raises FileNotFoundError: If the file parser parameter doesn't exist

        :return: The number of rows in the file specified as parameter
        :rtype: int
    """

    num_lines = 0
    with open(file, 'r') as f:
        for line in f:
            num_lines += 1

    return num_lines


def __count_file_tokens(file):
    """
        Counts the total number of token in a file.

        :param file: The file to evaluate
        :type file: str

        :raises FileNotFoundError: If the file parser parameter doesn't exist

        :return: The number of token in file specified as parameter
        :rtype: int
    """

    delimiters = "; |;|, |\.|: |{|{ |}|} |[|[ |]|] |\(|\( |\)|\) |\?|!|<|>|\+|=|&|^|%|-|~|:|/|\(|\*|\n|\"| "
    with open(file, 'r') as f:
        f = f.read()
        result = re.split(delimiters, f)
        result = list(filter(None, result))

    return len(result)


def count_files():
    """
        Counts the total number of Java file.

        :return: The number of files safe and weak
        :rtype: int, int
    """

    raw_data_path = os.path.relpath(RAW_DATA_DIR)
    weak_files = 0
    safe_files = 0

    for path, dirs, files in os.walk(raw_data_path):
        # Search for .java files in raw data directory
        for filename in fnmatch.filter(files, "*.java"):
            filepath = os.path.join(path, filename)
            if labeler.is_weak(filepath):
                weak_files += 1
            else:
                safe_files += 1

    return safe_files, weak_files


def count_lines():
    """
        Counts the total number of lines safe and weak.

        :return: The number of lines safe and weak
        :rtype: int, int
    """

    raw_data_path = os.path.relpath(RAW_DATA_DIR)
    weak_lines = 0
    safe_lines = 0

    for path, dirs, files in os.walk(raw_data_path):
        # Search for .java files in raw data directory
        for filename in fnmatch.filter(files, "*.java"):
            filepath = os.path.join(path, filename)
            if labeler.is_weak(filepath):
                weak_lines += __count_file_lines(filepath)
            else:
                safe_lines += __count_file_lines(filepath)

    return safe_lines, weak_lines


def count_tokens():
    """
        Counts the total number of tokens safe and weak.

        :return: The number of tokens safe and weak
        :rtype: int, int
    """

    raw_data_path = os.path.relpath(RAW_DATA_DIR)
    weak_tokens = 0
    safe_tokens = 0

    for path, dirs, files in os.walk(raw_data_path):
        # Search for .java files in raw data directory
        for filename in fnmatch.filter(files, "*.java"):
            filepath = os.path.join(path, filename)
            if labeler.is_weak(filepath):
                weak_tokens += __count_file_tokens(filepath)
            else:
                safe_tokens += __count_file_tokens(filepath)

    return safe_tokens, weak_tokens
