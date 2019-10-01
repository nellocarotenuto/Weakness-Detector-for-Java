import csv
import fnmatch
import os
import pandas

from collections import Counter
from numpy import int16

import src.preparation.labeler as labeler
import src.processing.analyzer as analyzer


RAW_DATA_DIR = "../../data/raw/"
PROCESSED_DATA_DIR = "../../data/processed/metircs"

CSV_DIR = "csv"
PKL_DIR = "pkl"

HEADER = "__header"
METRICS = "__metrics"


def load_features():
    # Read the full data frame from pickle if generated
    if os.path.exists(f"{PROCESSED_DATA_DIR}/{PKL_DIR}/{METRICS}.pkl"):
        return pandas.read_pickle(f"{PROCESSED_DATA_DIR}/{PKL_DIR}/{METRICS}.pkl")

    projects = [project for project in os.listdir(RAW_DATA_DIR)]

    # Create the needed directories if they don't exist
    if not os.path.exists(PROCESSED_DATA_DIR):
        os.mkdir(PROCESSED_DATA_DIR)
        os.mkdir(f"{PROCESSED_DATA_DIR}/{CSV_DIR}")
        os.mkdir(f"{PROCESSED_DATA_DIR}/{PKL_DIR}")

    # Generate the CSV files for each project they haven't been generated yet
    for project in projects:
        if not os.path.exists(f"{PROCESSED_DATA_DIR}/{CSV_DIR}/{project}.csv"):
            __generate_csv(project)

    # Generate pickles to speed up loading times
    for project in projects:
        if not os.path.exists(f"{PROCESSED_DATA_DIR}/{PKL_DIR}/{project}.pkl"):
            data_frame = pandas.read_csv(f"{PROCESSED_DATA_DIR}/{CSV_DIR}/{project}.csv", dtype=int16)
            data_frame.to_pickle(f"{PROCESSED_DATA_DIR}/{PKL_DIR}/{project}.pkl")

    project_data_frames = {}

    for pkl_file in os.listdir(f"{PROCESSED_DATA_DIR}/{PKL_DIR}"):
        project_name = pkl_file[0:pkl_file.find(".pkl")]
        project_data_frames[project_name] = pandas.read_pickle(f"{PROCESSED_DATA_DIR}/{PKL_DIR}/{pkl_file}")

    data_frames_to_concat = list(project_data_frames.values())

    metrics = pandas.concat(data_frames_to_concat, ignore_index=True, sort=False).astype(int16)
    metrics.to_pickle(f"{PROCESSED_DATA_DIR}/{PKL_DIR}/{METRICS}.pkl")

    return metrics


def __generate_csv_header():
    """
        Generates a CSV header which contains all the different tokens found in the whole dataset.
    """

    common_header = set()

    for path, dirs, files in os.walk(RAW_DATA_DIR):

        # Search for .java files in raw data directory
        for filename in fnmatch.filter(files, "*.java"):
            filepath = os.path.relpath(os.path.join(path, filename))
            file_words = __compute_file_metrics(filepath)
            common_header.update(list(file_words.keys()))

    with open(f"{PROCESSED_DATA_DIR}/{CSV_DIR}/{HEADER}.csv", newline='', mode='w') as csv_file:
        writer = csv.writer(csv_file, delimiter=',')
        writer.writerow(list(common_header))


def __generate_csv(project):
    """
        Generates a bag of words from the raw data sources and stores it into a CSV for each subdirectory found in
        the raw dataset.

        :param project: The name of the project to analyze
        :type project: str
    """

    file_metrics_map = {}
    total_metrics = Counter()

    for path, dirs, files in os.walk(f"{RAW_DATA_DIR}/{project}"):

        # Search for .java files in raw data directory
        for filename in fnmatch.filter(files, "*.java"):
            filepath = os.path.relpath(os.path.join(path, filename))

            file_metrics = __compute_file_metrics(filepath)

            file_metrics_map[f"{path}/{filename}"] = file_metrics

            total_metrics.update(file_metrics)

    with open(f"{PROCESSED_DATA_DIR}/{CSV_DIR}/{project}.csv", newline='', mode='w') as csv_file:
        writer = csv.DictWriter(csv_file, delimiter=',', fieldnames=list(total_metrics.keys()), restval=0)
        writer.writeheader()

        for file in file_metrics_map.keys():
            writer.writerow(file_metrics_map[file])


def __compute_file_metrics(filepath):
    """
        Generates a counter of metrics for the specified file.

        :param filepath: The path of the file for which to compute the metrics
        :type filepath: str

        :return: The metrics count in file
        :rtype: Counter
    """

    # Tokenize the file and convert the Counter to DataFrame
    file_metrics = analyzer.analyze(filepath)

    # Index on file names
    # file_metrics["RAW_FILE_PATH"] = filepath
    # file_metrics.set_index("RAW_FILE_PATH", drop=True, inplace=True)

    # Apply security labels
    file_metrics["IS_WEAK"] = 1 if labeler.is_weak(filepath) else 0

    return file_metrics


print(load_features().shape)