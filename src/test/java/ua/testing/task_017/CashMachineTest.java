package ua.testing.task_017;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * <h1>Cash Machine Test</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class CashMachineTest {

    @Test
    public void unchange() {
        CashMachine machine = new CashMachine(new int[]{1, 5, 10});
        List<List<Integer>> result = machine.exchange(1);
        assertThat(result, is(singletonList(singletonList(1))));
    }

    @Test
    public void change() {
        CashMachine machine = new CashMachine(new int[]{1, 5, 10});
        List<List<Integer>> result = machine.exchange(10);
        assertThat(
                result, is(
                        asList(
                                singletonList(10),
                                asList(5, 5),
                                asList(5, 1, 1, 1, 1, 1),
                                asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
                        )
                )
        );
    }
}
