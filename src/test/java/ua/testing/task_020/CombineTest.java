package ua.testing.task_020;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * <h1>Combine Test</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class CombineTest {

    @Test
    public void simple() {
        Combine combine = new Combine(new int[]{1, 2});
        List<List<Integer>> result = combine.generate();
        assertThat(result, is(
                asList(
                        asList(1, 2),
                        asList(2, 1)
                )
                )
        );
    }

    @Test
    public void three() {
        Combine combine = new Combine(new int[]{1, 2, 3});
        List<List<Integer>> result = combine.generate();
        assertThat(result, is(
                asList(
                        asList(1, 2, 3),
                        asList(1, 3, 2),
                        asList(2, 1, 3),
                        asList(3, 2, 1)
                )
                )
        );
    }
}
