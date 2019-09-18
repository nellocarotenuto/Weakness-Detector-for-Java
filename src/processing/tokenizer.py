import javalang


# Define classes to be mapped to a generic, type-bound identifier
STR_TYPES = [
             javalang.tokenizer.Character,
             javalang.tokenizer.String
            ]
INT_TYPES = [
             javalang.tokenizer.BinaryInteger,
             javalang.tokenizer.DecimalInteger,
             javalang.tokenizer.HexInteger,
             javalang.tokenizer.Integer,
             javalang.tokenizer.OctalInteger,
            ]
FLT_TYPES = [
             javalang.tokenizer.DecimalFloatingPoint,
             javalang.tokenizer.FloatingPoint,
             javalang.tokenizer.HexFloatingPoint
            ]

# Define generic, type-bound identifiers
STR_LITERAL = "STR_LITERAL"
INT_LITERAL = "INT_LITERAL"
FLT_LITERAL = "FLT_LITERAL"

# Define classes to be ignored when parsing
excluded_token_types = [
                        javalang.tokenizer.Operator,
                        javalang.tokenizer.Separator
                       ]


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
            if type(token) in STR_TYPES:
                tokens.append(STR_LITERAL)
            elif type(token) in INT_TYPES:
                tokens.append(INT_LITERAL)
            elif type(token) in FLT_TYPES:
                tokens.append(FLT_LITERAL)
            else:
                tokens.append(token.value)

    return tokens

