package calculatorif;

// 사칙연산을 상수화?
public enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    MULTIPLE('*'),
    DIVISION('/');

    private char operator;

    OperatorType(char operator) {
        this.operator = operator;
    }
}
