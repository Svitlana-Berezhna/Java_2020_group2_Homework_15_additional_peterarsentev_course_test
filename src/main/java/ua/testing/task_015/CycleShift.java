package ua.testing.task_015;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Cycle Shift</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class CycleShift {
    private static final Logger log = getLogger(CycleShift.class);

    private final int[] values;

    public CycleShift(final int[] values) {
        this.values = values;
    }

    public int[] shift(int position) {
        for (int i = 0; i < position; i++) {
            int temp = values[values.length - 1];
            for (int j = values.length - 1; j > 0; j--) {
                values[j] = values[j - 1];
            }
            values[0] = temp;
        }
        return values;
    }
}
