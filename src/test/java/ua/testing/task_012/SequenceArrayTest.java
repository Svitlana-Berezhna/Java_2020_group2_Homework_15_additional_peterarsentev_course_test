package ua.testing.task_012;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * <h1>Sequence Array Test</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class SequenceArrayTest {

    @Test
    public void contains() {
        SequenceArray array = new SequenceArray(new int[]{0, 1, 1, 1, 0});
        boolean result = array.containsOneSequence();
        assertThat(result, is(true));
    }

    @Test
    public void notContains() {
        SequenceArray array = new SequenceArray(new int[]{0, 1, 0, 1, 0});
        boolean result = array.containsOneSequence();
        assertThat(result, is(false));
    }
}
