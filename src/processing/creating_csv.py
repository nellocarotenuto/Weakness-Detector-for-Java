import os

PROCESSED_DATA_DIR = "../../data/processed"
RAW_DATA_DIR = "../../data/raw"

import src.processing.bag_of_words as bow
import src.preparation.labeler as labeler


def create_lables():
    print("Creating lables...\n")
    output = open(PROCESSED_DATA_DIR + '/output.csv', 'w')
    labels = bow.bag_of_words_total()

    for word in labels.keys():
        output.write(word + ',')

    output.write('IS_WEAK')
    output.write('\n')
    output.close()

    return labels


def compute_values(vocabulary):
    print("Generating values...\n")
    output = open(PROCESSED_DATA_DIR + '/output.csv', 'a')
    for r, d, f in os.walk(RAW_DATA_DIR):
        print(d)
        for file in f:
            if '.java' in file:
                bag_of_words = bow.bag_of_words_per_file(r, file)
                vocabulary.update(bag_of_words.elements())
                for value in vocabulary.values():
                    output.write('{},'.format(value))

                filepath = os.path.join(r, file)
                if labeler.is_weak(filepath):
                    output.write('True')
                else:
                    output.write('False')

                output.write('\n')

                vocabulary = reset_vocabulary(vocabulary)

    print('\n')
    output.close()


def reset_vocabulary(vocabulary):
    for x in vocabulary:
        vocabulary[x] = 0
    return vocabulary


voc = create_lables()
voc = reset_vocabulary(voc)
compute_values(voc)
