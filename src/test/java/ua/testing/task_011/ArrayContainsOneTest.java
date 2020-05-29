package ua.testing.task_011;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * <h1>Array Contains One Test</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class ArrayContainsOneTest {

    @Test
    public void onlyOne() {
        ArrayContainsOne array = new ArrayContainsOne(new int[]{1});
        boolean result = array.containsOnlyOne();
        assertThat(result, is(true));
    }

    @Test
    public void notOnlyOne() {
        ArrayContainsOne array = new ArrayContainsOne(new int[]{1, 1, 0});
        boolean result = array.containsOnlyOne();
        assertThat(result, is(false));
    }
}
