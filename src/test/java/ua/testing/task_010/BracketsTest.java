package ua.testing.task_010;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * <h1>Brackets Test</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class BracketsTest {

    @Test
    public void valid() {
        Brackets brackets = new Brackets("()()()");
        boolean result = brackets.isCorrect();
        assertThat(result, is(true));
    }

    @Test
    public void inValid() {
        Brackets brackets = new Brackets("(");
        boolean result = brackets.isCorrect();
        assertThat(result, is(false));
    }
}
