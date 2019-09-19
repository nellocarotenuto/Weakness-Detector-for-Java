import os
import src.processing.tokenizer as tokenizer

from collections import Counter

RAW_DATA_DIR = "../../data/raw"


def bag_of_words_total():
    # r=root, d=directories, f = files
    bag_of_words = Counter({})
    for r, d, f in os.walk(RAW_DATA_DIR):
        for file in f:
            if '.java' in file:
                try:
                    file_words = tokenizer.tokenize(os.path.join(r, file))
                except:
                    print(os.path.join(r, file))

                file_bag_of_words = Counter(file_words)
                bag_of_words += file_bag_of_words

    bag_of_words_dict = {}
    bag_of_words_dict = bag_of_words
    return bag_of_words_dict

def bag_of_words_per_file(r, file):
    # r=root, d=directories, f = files
    bag_of_words = Counter({})

    try:
        file_words = tokenizer.tokenize(os.path.join(r, file))
    except:
        print(os.path.join(r, file))

    file_bag_of_words = Counter(file_words)
    bag_of_words += file_bag_of_words

    return bag_of_words