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
from sklearn.pipeline import Pipeline
from sklearn.preprocessing import StandardScaler
from sklearn.preprocessing import MinMaxScaler


MODELS_DIR = "../../model"
N_JOBS = 1
RANDOM_STATE = 7


def build_log_reg_models():
    """
        Builds various models grid searching a number of scalers, feature selectors and logistic regression parameters.
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

            if scaler is not None:
                steps.append(("scaler", scaler))

                if type(scaler) is MinMaxScaler:
                    classifier_name += "minmax-"
                elif type(scaler) is StandardScaler:
                    classifier_name += "standard-"
            else:
                classifier_name += "no_scaler-"

            if selector is not None:
                if type(selector) is PCA:
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
            else:
                classifier_name += "no_selector-"

            steps.append(("classifier", LogisticRegression()))
            classifier_name += "classifier"

            pipeline = Pipeline(steps=steps)

            with warnings.catch_warnings():
                warnings.simplefilter(action="ignore", category=UserWarning)

                classifier = GridSearchCV(pipeline, param_grid=log_reg_param_grid, cv=10)
                classifier.fit(train_data, train_labels)

            dump(classifier, f"{MODELS_DIR}/{classifier_name}.joblib")

