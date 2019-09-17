import javalang


STR_LITERAL = "STR_LITERAL"
INT_LITERAL = "INT_LITERAL"
FLT_LITERAL = "FLT_LITERAL"

excluded_token_types = [javalang.tokenizer.Operator, javalang.tokenizer.Separator]


def tokenize(file):
    """
        Performs tokenization of the file at a specific path.
        This function maps String, Integer and Float literals to constants.

        :param file: The path of the file to be tokenized
        :type file: str

        :return: The list of tokens of the file passed as parameter
        :rtype: list of str
    """
    tokens = []

    with open(file, 'r') as source:
        source = source.read()

    parsed_tokens = list(javalang.tokenizer.tokenize(source))

    for token in parsed_tokens:
        if type(token) not in excluded_token_types:
            if type(token) is javalang.tokenizer.String:
                tokens.append(STR_LITERAL)
            elif type(token) is javalang.tokenizer.DecimalInteger:
                tokens.append(INT_LITERAL)
            elif type(token) is javalang.tokenizer.DecimalFloatingPoint:
                tokens.append(FLT_LITERAL)
            else:
                tokens.append(token.value)

    return tokens

