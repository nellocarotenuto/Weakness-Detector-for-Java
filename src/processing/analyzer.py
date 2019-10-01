from collections import Counter

import libs.javalang.tree as ast
import libs.javalang.parse as parser

# Package declarations
PACKAGE_DECLARATIONS = "PACKAGE_DECLARATIONS"

# Import statements
IMPORT_STATEMENTS = "IMPORT_STATEMENTS"
STATIC_IMPORT_STATEMENTS = "STATIC_IMPORT_STATEMENTS"

# Types declarations
CLASS_DECLARATIONS = "CLASS_DECLARATIONS"
INTERFACE_DECLARATIONS = "INTERFACE_DECLARATIONS"
ENUM_DECLARATIONS = "ENUM_DECLARATIONS"
ANNOTATION_DECLARATIONS = "ANNOTATION_DECLARATIONS"
PUBLIC_TYPE_DECLARATIONS = "PUBLIC_TYPE_DECLARATIONS"
PRIVATE_TYPE_DECLARATIONS = "PRIVATE_TYPE_DECLARATIONS"
PROTECTED_TYPE_DECLARATIONS = "PROTECTED_TYPE_DECLARATIONS"
STATIC_TYPE_DECLARATIONS = "STATIC_TYPE_DECLARATIONS"
ABSTRACT_TYPE_DECLARATIONS = "ABSTRACT_TYPE_DECLARATIONS"
SUBTYPE_DECLARATIONS = "SUBTYPE_DECLARATIONS"
INTERFACES_IMPLEMENTED = "INTERFACES_IMPLEMENTED"
FINAL_TYPE_DECLARATIONS = "FINAL_TYPE_DECLARATIONS"
PARAMETRIZED_TYPE_DECLARATIONS = "PARAMETRIZED_TYPE_DECLARATIONS"
ANNOTATION_METHODS = "ANNOTATION_METHODS"
METHOD_DECLARATIONS = "METHOD_DECLARATIONS"
PUBLIC_METHOD_DECLARATIONS = "PUBLIC_METHOD_DECLARATIONS"
PRIVATE_METHOD_DECLARATIONS = "PRIVATE_METHOD_DECLARATIONS"
PROTECTED_METHOD_DECLARATIONS = "PROTECTED_METHOD_DECLARATIONS"
STATIC_METHOD_DECLARATIONS = "STATIC_METHOD_DECLARATIONS"
EXCEPTION_METHOD_DECLARATIONS = "EXCEPTION_METHODS_DECLARATIONS"
FIELD_DECLARATIONS = "FIELD_DECLARATIONS"
CONSTRUCTOR_DECLARATIONS = "CONSTRUCTOR_DECLARATIONS"
CONSTANT_DECLARATIONS = "CONSTANT_DECLARATIONS"

# Statements
STATEMENTS = "STATEMENTS"
EXPRESSION_STATEMENTS = "EXPRESSION_STATEMENTS"
IF_STATEMENTS = "IF_STATEMENTS"
WHILE_STATEMENTS = "WHILE_STATEMENTS"
DO_STATEMENTS = "DO_STATEMENTS"
FOR_STATEMENTS = "FOR_STATEMENTS"
ASSERT_STATEMENTS = "ASSERT_STATEMENTS"
BREAK_STATEMENTS = "BREAK_STATEMENTS"
CONTINUE_STATEMENTS = "CONTINUE_STATEMENTS"
THROW_STATEMENTS = "THROW_STATEMENTS"
SYNCHRONIZED_STATEMENTS = "SYNCHRONIZED_STATEMENTS"
TRY_STATEMENTS = "TRY_STATEMENTS"
SWITCH_STATEMENTS = "SWITCH_STATEMENTS"
BLOCK_STATEMENTS = "BLOCK_STATEMENTS"
ANNOTATIONS = "ANNOTATIONS"
VARIABLE_DECLARATIONS = "VARIABLE_DECLARATIONS"
FINAL_VARIABLE_DECLARATIONS = "FINAL_VARIABLE_DECLARATIONS"
VOLATILE_VARIABLE_DECLARATIONS = "VOLATILE_VARIABLE_DECLARATIONS"
METHOD_INVOCATIONS = "METHOD_INVOCATIONS"

# Misc
CASTS = "CASTS"
TYPED_REFERENCES = "TYPED_REFERENCES"
LITERALS = "LITERALS"


def analyze(file):
    """
        Computes the metrics of the file passed as argument and returns them into a Counter object.

        :param file: The path of the file on which to compute metrics
        :type file: str

        :return: The counter that holds the metrics of the file
        :rtype: Counter
    """
    counter = Counter()

    with open(file, 'r') as source:
        source = source.read()

    tree = parser.parse(source)

    for path, node in tree:
        if type(node) is ast.PackageDeclaration:
            counter[PACKAGE_DECLARATIONS] += 1

        elif type(node) is ast.Import:
            counter[IMPORT_STATEMENTS] += 1

            if node.static:
                counter[STATIC_IMPORT_STATEMENTS] += 1

        elif isinstance(node, ast.TypeDeclaration):
            if type(node) is ast.ClassDeclaration:
                counter[CLASS_DECLARATIONS] += 1
            elif type(node) is ast.InterfaceDeclaration:
                counter[INTERFACE_DECLARATIONS] += 1
            elif type(node) is ast.EnumDeclaration:
                counter[ENUM_DECLARATIONS] += 1
            elif type(node) is ast.AnnotationDeclaration:
                counter[ANNOTATION_DECLARATIONS] += 1

            if "private" in node.modifiers:
                counter[PRIVATE_TYPE_DECLARATIONS] += 1
            elif "protected" in node.modifiers:
                counter[PROTECTED_TYPE_DECLARATIONS] += 1
            elif "public" in node.modifiers:
                counter[PUBLIC_TYPE_DECLARATIONS] += 1

            if "static" in node.modifiers:
                counter[STATIC_TYPE_DECLARATIONS] += 1

            if "abstract" in node.modifiers:
                counter[ABSTRACT_TYPE_DECLARATIONS] += 1
            elif "final" in node.modifiers:
                counter[FINAL_TYPE_DECLARATIONS] += 1

            if type(node) is ast.ClassDeclaration or type(node) is ast.InterfaceDeclaration:
                if node.type_parameters:
                    counter[PARAMETRIZED_TYPE_DECLARATIONS] += 1

                if node.extends:
                    counter[SUBTYPE_DECLARATIONS] += 1

            if type(node) is ast.ClassDeclaration or type(node) is ast.EnumDeclaration:
                if node.implements:
                    counter[INTERFACES_IMPLEMENTED] += len(node.implements)

        elif type(node) is ast.ConstructorDeclaration:
            counter[CONSTRUCTOR_DECLARATIONS] += 1

        elif type(node) is ast.MethodDeclaration:
            counter[METHOD_DECLARATIONS] += 1

            if "private" in node.modifiers:
                counter[PRIVATE_METHOD_DECLARATIONS] += 1
            elif "protected" in node.modifiers:
                counter[PROTECTED_METHOD_DECLARATIONS] += 1
            elif "public" in node.modifiers:
                counter[PUBLIC_METHOD_DECLARATIONS] += 1

            if "static" in node.modifiers:
                counter[STATIC_METHOD_DECLARATIONS] += 1

            if node.throws:
                counter[EXCEPTION_METHOD_DECLARATIONS] += 1

        elif type(node) is ast.FieldDeclaration:
            counter[FIELD_DECLARATIONS] += 1

        elif type(node) is ast.ConstantDeclaration:
            counter[CONSTANT_DECLARATIONS] += 1

        elif type(node) is ast.AnnotationMethod:
            counter[ANNOTATION_METHODS] += 1

        elif type(node) is ast.Annotation:
            counter[ANNOTATIONS] += 1

        elif isinstance(node, ast.Statement):
            counter[STATEMENTS] += 1

            if type(node) is ast.StatementExpression:
                counter[EXPRESSION_STATEMENTS] += 1
            elif type(node) is ast.IfStatement:
                counter[IF_STATEMENTS] += 1
            elif type(node) is ast.WhileStatement:
                counter[WHILE_STATEMENTS] += 1
            elif type(node) is ast.DoStatement:
                counter[DO_STATEMENTS] += 1
            elif type(node) is ast.ForStatement:
                counter[FOR_STATEMENTS] += 1
            elif type(node) is ast.AssertStatement:
                counter[ASSERT_STATEMENTS] += 1
            elif type(node) is ast.BreakStatement:
                counter[BREAK_STATEMENTS] += 1
            elif type(node) is ast.ContinueStatement:
                counter[CONTINUE_STATEMENTS] += 1
            elif type(node) is ast.ThrowStatement:
                counter[THROW_STATEMENTS] += 1
            elif type(node) is ast.SynchronizedStatement:
                counter[SYNCHRONIZED_STATEMENTS] += 1
            elif type(node) is ast.TryStatement:
                counter[TRY_STATEMENTS] += 1
            elif type(node) is ast.SwitchStatement:
                counter[SWITCH_STATEMENTS] += 1
            elif type(node) is ast.BlockStatement:
                counter[BLOCK_STATEMENTS] += 1

        elif type(node) is ast.LocalVariableDeclaration:
            counter[VARIABLE_DECLARATIONS] += 1

            if type(node.type) is ast.ReferenceType:
                type_name = f"{node.type.name.upper()}_VARIABLES"

                if node.type.arguments:
                    counter[TYPED_REFERENCES] += 1
            else:
                type_name = f"BASIC_{node.type.name.upper()}_VARIABLES"

            counter[type_name] += 1

            if "final" in node.modifiers:
                counter[FINAL_VARIABLE_DECLARATIONS] += 1
            elif "volatile" in node.modifiers:
                counter[VOLATILE_VARIABLE_DECLARATIONS] += 1

        elif isinstance(node, ast.Invocation):
            counter[METHOD_INVOCATIONS] += 1

        elif type(node) is ast.Cast:
            counter[CASTS] += 1

        elif type(node) is ast.Literal:
            counter[LITERALS] += 1

    return counter

