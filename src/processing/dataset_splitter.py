from src.processing import metrics_extractor


RANDOM_STATE = 7
TARGET_LABEL = "IS_WEAK"


__train_data = None
__train_labels = None
__test_data = None
__test_labels = None


def __init_train_test_sets():
    """
        Inits the training and test sets.
    """
    metrics = metrics_extractor.load_features()

    # Select rows
    weak_files = metrics.loc[metrics[TARGET_LABEL] == 1].sample(frac=1, random_state=RANDOM_STATE)
    safe_files = metrics.loc[metrics[TARGET_LABEL] == 0].sample(n=weak_files.shape[0], random_state=RANDOM_STATE)

    # Reset indexes
    weak_files.reset_index(drop=True, inplace=True)
    safe_files.reset_index(drop=True, inplace=True)

    # Compute the 80% of each subset
    number_of_rows = int(weak_files.shape[0] * 0.8)

    # Compute train and test sets for weak files
    weak_files_train_data = weak_files.loc[0:number_of_rows, :].drop(TARGET_LABEL, axis=1)
    weak_files_train_labels = weak_files.loc[0:number_of_rows, TARGET_LABEL]
    weak_files_test_data = weak_files.loc[number_of_rows:, :].drop(TARGET_LABEL, axis=1)
    weak_files_test_labels = weak_files.loc[number_of_rows:, TARGET_LABEL]

    # Compute train and test sets for safe files
    safe_files_train_data = safe_files.loc[0:number_of_rows:, :].drop(TARGET_LABEL, axis=1)
    safe_files_train_labels = safe_files.loc[0:number_of_rows, TARGET_LABEL]
    safe_files_test_data = safe_files.loc[number_of_rows:, :].drop(TARGET_LABEL, axis=1)
    safe_files_test_labels = safe_files.loc[number_of_rows:, TARGET_LABEL]

    global __train_data
    global __test_data
    global __train_labels
    global __test_labels

    # Compute global train and test sets
    __train_data = weak_files_train_data.append(safe_files_train_data)
    __test_data = weak_files_test_data.append(safe_files_test_data)
    __train_labels = weak_files_train_labels.append(safe_files_train_labels)
    __test_labels = weak_files_test_labels.append(safe_files_test_labels)

    # Shuffle the datasets and reset the indexes
    __train_data = __train_data.sample(frac=1, random_state=RANDOM_STATE).reset_index(drop=True)
    __test_data = __test_data.sample(frac=1, random_state=RANDOM_STATE).reset_index(drop=True)
    __train_labels = __train_labels.sample(frac=1, random_state=RANDOM_STATE).reset_index(drop=True)
    __test_labels = __test_labels.sample(frac=1, random_state=RANDOM_STATE).reset_index(drop=True)

