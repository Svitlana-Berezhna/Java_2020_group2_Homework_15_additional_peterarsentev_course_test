package ua.testing.task_007;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * <h1>Expression Test</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class ExpressionTest {

    @Test
    public void calc() {
        Expression expr = new Expression("2+2");
        double result = expr.calc();
        assertThat(result, is(4d));
    }

    @Test(expected = IllegalStateException.class)
    public void noValid() {
        new Expression("2+").calc();
    }
}
