package ua.testing.task_009;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * <h1>Unique Chars Test</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class UniqueCharsTest {

    @Test
    public void hasNotUnique() {
        UniqueChars unique = new UniqueChars("2+2");
        int result = unique.unique();
        assertThat(result, is(2));
    }

    @Test
    public void onlyUnique() {
        UniqueChars unique = new UniqueChars("123");
        int result = unique.unique();
        assertThat(result, is(3));
    }
}
