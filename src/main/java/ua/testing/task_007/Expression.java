package ua.testing.task_007;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Expression</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class Expression {
    private static final Logger log = getLogger(Expression.class);

    private final String expr;

    private static final char PLUS_SIGN = '+';
    private static final char MINUS_SIGN = '-';
    private static final char MULT_SIGN = '*';
    private static final char DIV_SIGN = '/';
    private static final String SPACE = " ";
    private static final String EMPTY_STRING = "";

    public Expression(final String expr) {
        this.expr = expr;
    }

    public double calc() {
        String exprStr = this.expr.replace(SPACE, EMPTY_STRING);
        int indexOperation = -1;
        double result = 0d;
        Operation op = null;
        char[] signs = {PLUS_SIGN, MINUS_SIGN, MULT_SIGN, DIV_SIGN};

        for (char sign : signs) {
            indexOperation = checkingForValidOperation(exprStr, sign);
            if (indexOperation >= 0) {
                switch (sign) {
                    case PLUS_SIGN:
                        op = Operation.ADDITION;
                        break;
                    case MINUS_SIGN:
                        op = Operation.SUBTRACTION;
                        break;
                    case MULT_SIGN:
                        op = Operation.MULTIPLICATION;
                        break;
                    case DIV_SIGN:
                        op = Operation.DIVISION;
                        break;
                }
                break;
            }
        }

        if (indexOperation < 0) throw new IllegalStateException();

        String str1 = exprStr.substring(0, indexOperation).trim();
        String str2 = exprStr.substring(indexOperation + 1).trim();
        try {
            int operand1 = Integer.parseInt(str1);
            int operand2 = Integer.parseInt(str2);
            result = op.action(operand1, operand2);
        } catch (IllegalStateException e) {
        }
        return result;
    }

    private int checkingForValidOperation(String exprStr, char op_sign) {
        int indexOperation = -1;
        String str = exprStr;
        boolean negativeFirstOperand = false;
        if ((op_sign == MINUS_SIGN) && (exprStr.indexOf(op_sign) == 0)) {
            negativeFirstOperand = true;
            str = exprStr.substring(1);
        }
        if ((str.indexOf(op_sign) > 0) && (str.indexOf(op_sign) == str.lastIndexOf(op_sign))
                && (str.lastIndexOf(op_sign) < str.length() - 1)) {
            indexOperation = str.indexOf(op_sign);
            if (negativeFirstOperand) indexOperation++;
        }
        return indexOperation;
    }
}

enum Operation {
    ADDITION {
        public double action(double x, double y) {
            return x + y;
        }
    },
    SUBTRACTION {
        public double action(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICATION {
        public double action(double x, double y) {
            return x * y;
        }
    },
    DIVISION {
        public double action(double x, double y) {
            return x / y;
        }
    };

    public abstract double action(double x, double y);
}
