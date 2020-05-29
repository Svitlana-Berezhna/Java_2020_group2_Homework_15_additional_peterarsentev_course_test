package ua.testing.task_013;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Mono Array</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class MonoArray {
    private static final Logger log = getLogger(MonoArray.class);

    private final int[] values;

    public MonoArray(final int[] values) {
        this.values = values;
    }

    public boolean exists() {
        boolean res = true;
        for (int i = 1; i < values.length; i++) {
            if (values[0] != values[i]) {
                res = false;
            }
        }
        return res;
    }
}
