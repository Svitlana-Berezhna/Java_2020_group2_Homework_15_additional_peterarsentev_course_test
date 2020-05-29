package ua.testing.task_017;

import org.slf4j.Logger;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Cash Machine</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class CashMachine {
    private static final Logger log = getLogger(CashMachine.class);

    private final int[] values;

    public CashMachine(final int[] values) {
        this.values = values;
    }

    public List<List<Integer>> exchange(int note) {
        throw new UnsupportedOperationException();
    }
}
