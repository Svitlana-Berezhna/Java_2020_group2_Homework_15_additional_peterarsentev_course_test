package ua.testing.task_001;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Calculator</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class Calculator {
    private static final Logger log = getLogger(Calculator.class);

    private double result;

    public double getResult() {
        return result;
    }

    public void add(double first, double second) {
        result = first + second;
    }

    public void substract(double first, double second) {
        result = first - second;
    }

    public void multiple(double first, double second) {
        result = first * second;
    }

    public void div(double first, double second) {
        if (second == 0) {
            throw new IllegalStateException("Division by zero!");
        }
        result = first / second;
    }

    public void expand(double first, double second) {
        result = Math.pow(first, second);
    }
}
