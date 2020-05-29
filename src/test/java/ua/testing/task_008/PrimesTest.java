package ua.testing.task_008;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * <h1>Primes Test</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class PrimesTest {

    @Test
    public void calc() {
        Primes primes = new Primes(3);
        List<Integer> result = primes.calc();
        assertThat(result, is(asList(2, 3)));
    }
}
