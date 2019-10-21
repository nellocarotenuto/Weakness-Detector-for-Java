# Weakness Detector for Java

A machine learning-based weakness detector for Java projects developed in the context of Data Science &amp; Machine
Learning course at the University of Salerno.

## Objectives

Software vulnerabilities are the biggest threat to digital security nowdays and anti-viruses only detect them once the
damage has been done. This project is an attempt to automatically detect new vulnerabilities applying regression
techniques over Java sources in order to predict software vulnerabilities (at file level) and prevent them to ship with
software releases.

## Dataset building

The dataset is built over a number of open source Java projects, mainly made by the 
[Apache Software Foundation](https://www.apache.org/) as well as over a few, intentionally vulnerable applications. The
full list of projects used to build the dataset and its relative stats are presented in the dedicated
[notebook](/notebook/eda/dataset_distribution.ipynb).

The idea behind feature extraction is to build the Abstract Syntax Tree over the sources and count the number of
many different node types which the AST is made of. This choice is made to preserve information about identifier types
as this is not possible when using a bag of words approach, for example.

A static analyzer is used to apply labels to the data extracted. The choice is [Spotbugs](https://spotbugs.github.io/)
with its [Find Security Bugs](https://find-sec-bugs.github.io/) plugin. Every project to be analyzed was built as-is at
first and then the analyzed to generate reports to be consumed by a [dedicated module](/src/preparation/labeler.py).

The number of files analyzed is slightly over 40 thousands but a strong class imbalance pops up as the number of safe
samples is well over the number of weak ones. This problem is solved with a massive undersampling, resulting in a
balanced dataset of almost 7 thousands samples which is split in a 80%/20% fashion for training and testing purposes.

## Model building

A [few combinations](/notebook/modeling/log_reg.ipynb) of data scalers and feature selectors are taken in consideration
for the selection of the best model when it comes to generalizing.

Scaling the data with MinMax and Standard scalers is considered as well as reducing the number of features with PCA and
Random Forest feature importance. The choice of the pipeline as well as hyperparameters tuning is made by grid searching
a space of 660 different combinations of steps/parameters and validated though a 5-fold cross validation.

## Model evaluation

In the end, the model that performs better when it comes to generalizing to unseen data is the simplest one as the steps
of data scaling and dimensionality reduction yield [negative effects](/notebook/evaluation/log_reg.ipynb) over the
default Linear Regressor built in the [proof of concept](/notebook/poc/ast_metrics.ipynb).

The best model shows a 73% accuracy, 72% F1-score and 73% ROC-AUC which, even though are far from ideal, are remarkable
results for a simple feasibility study like this. Fine tuning the simple regression model and building a bigger dataset
could improve the performance and yield even more interesting results.
