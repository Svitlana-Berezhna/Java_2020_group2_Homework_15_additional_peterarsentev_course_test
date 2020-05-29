package ua.testing.task_018;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * <h1>Pool Test</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class PoolTest {

    @Test
    public void multi() {
        Pool pool = new Pool(
                new int[][]{
                        {1, 0, 0},
                        {1, 1, 0},
                        {0, 0, 1}
                }
        );
        int result = pool.maxUnion();
        assertThat(result, is(3));
    }

    @Test
    public void one() {
        Pool pool = new Pool(
                new int[][]{
                        {1, 1, 1},
                        {1, 1, 1},
                        {1, 1, 1}
                }
        );
        int result = pool.maxUnion();
        assertThat(result, is(9));
    }
}
