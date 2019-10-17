from src.processing.dataset_splitter import __test_data as test_data
from src.processing.dataset_splitter import __test_labels as test_labels

from sklearn.metrics import accuracy_score
from sklearn.metrics import auc
from sklearn.metrics import fbeta_score
from sklearn.metrics import precision_recall_curve
from sklearn.metrics import precision_score
from sklearn.metrics import recall_score
from sklearn.metrics import roc_curve

N_JOBS = -1
RANDOM_STATE = 7


def evaluate_model(classifier, average="micro"):
    """
        Evaluates a predictor on the test set and computes the desired metrics.

        :param classifier: The predictor to be evaluated
        :type classifier: Predictor

        :param average: The method to compute average, default is micro
        :type average: str

        :return: The metrics computed for the model
        :rtype: dict
    """
    scores = {}

    predictions = classifier.predict(test_data)

    scores["accuracy"] = accuracy_score(test_labels, predictions)
    scores["precision"] = precision_score(test_labels, predictions, average=average)
    scores["recall"] = recall_score(test_labels, predictions, average=average)

    scores["f1"] = fbeta_score(test_labels, predictions, beta=1, average=average)
    scores["f2"] = fbeta_score(test_labels, predictions, beta=2, average=average)

    fpr, tpr, roc_thresholds = roc_curve(test_labels, predictions)
    roc_auc = auc(fpr, tpr)

    scores["roc"] = {
        "fpr": fpr,
        "tpr": tpr,
        "thresholds": roc_thresholds,
        "auc": roc_auc
    }

    precision, recall, pr_thresholds = precision_recall_curve(test_labels, predictions)
    pr_auc = auc(recall, precision)

    scores["pr"] = {
        "precision": precision,
        "recall": recall,
        "thresholds": pr_thresholds,
        "auc": pr_auc
    }

    return scores

