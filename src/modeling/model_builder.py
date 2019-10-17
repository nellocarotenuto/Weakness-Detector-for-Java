import os
import warnings

from src.processing.dataset_splitter import __train_data as train_data
from src.processing.dataset_splitter import __train_labels as train_labels

from joblib import dump

from numpy import logspace

from sklearn.decomposition import PCA
from sklearn.ensemble import RandomForestRegressor
from sklearn.feature_selection import SelectFromModel
from sklearn.linear_model import LogisticRegression
from sklearn.model_selection import GridSearchCV
from sklearn.model_selection import ParameterGrid
from sklearn.pipeline import Pipeline
from sklearn.preprocessing import StandardScaler
from sklearn.preprocessing import MinMaxScaler


CV_FOLDS = 5
MODELS_DIR = "../../model"
N_JOBS = -1
RANDOM_STATE = 7


def build_log_reg_models():
    """
        Builds various models grid searching a number of scalers, feature selectors and logistic regression parameters.

        A model for each combination is built as a result of a cross validation process and stored into models directory
        for future usage.
    """
    if not os.path.exists(MODELS_DIR):
        os.mkdir(MODELS_DIR)

    scalers = [None, MinMaxScaler(), StandardScaler()]
    selectors = [None, PCA(), RandomForestRegressor()]

    for scaler in scalers:
        for selector in selectors:
            log_reg_param_grid = [
                {
                    "classifier__solver": ["liblinear"],
                    "classifier__penalty": ["l1", "l2"],
                    "classifier__C": logspace(-1, 3, 5, endpoint=True),
                    "classifier__random_state": [RANDOM_STATE],
                    "classifier__max_iter": [1000],
                    "classifier__n_jobs": [N_JOBS]
                },
                {
                    "classifier__solver": ["lbfgs"],
                    "classifier__penalty": ["none", "l2"],
                    "classifier__C": logspace(-1, 3, 5, endpoint=True),
                    "classifier__random_state": [RANDOM_STATE],
                    "classifier__max_iter": [1000],
                    "classifier__n_jobs": [N_JOBS]
                }
            ]

            classifier_name = ""
            steps = []

            if scaler is None:
                classifier_name += "no_scaler-"
            else:
                steps.append(("scaler", scaler))

                if type(scaler) is MinMaxScaler:
                    classifier_name += "minmax-"
                elif type(scaler) is StandardScaler:
                    classifier_name += "standard-"

            if selector is None:
                classifier_name += "no_selector-"
            else:
                if type(selector) is PCA:

                    for param_grid in log_reg_param_grid:
                        param_grid["selector__n_components"] = [0.95]

                    steps.append(("selector", selector))
                    classifier_name += "pca-"
                elif type(selector) is RandomForestRegressor:

                    for param_grid in log_reg_param_grid:
                        param_grid["selector__estimator__n_estimators"] = [10, 100, 1000]
                        param_grid["selector__estimator__random_state"] = [RANDOM_STATE]
                        param_grid["selector__estimator__n_jobs"] = [N_JOBS]
                        param_grid["selector__threshold"] = [0.01, 0.025, 0.05]

                    steps.append(("selector", SelectFromModel(selector)))
                    classifier_name += "rf-"

            steps.append(("classifier", LogisticRegression()))
            classifier_name += "classifier"
            print("Classifier:", classifier_name)

            pipeline = Pipeline(steps=steps)

            number_of_combinations = len(ParameterGrid(log_reg_param_grid))
            print("Combinations to evaluate:", number_of_combinations)

            classifier = GridSearchCV(pipeline, param_grid=log_reg_param_grid, n_jobs=N_JOBS, cv=CV_FOLDS, verbose=1)

            with warnings.catch_warnings():
                warnings.simplefilter(action="ignore", category=UserWarning)
                classifier.fit(train_data, train_labels)

            dump(classifier, f"{MODELS_DIR}/{classifier_name}.joblib")
            print("Dump generated")
            print()

