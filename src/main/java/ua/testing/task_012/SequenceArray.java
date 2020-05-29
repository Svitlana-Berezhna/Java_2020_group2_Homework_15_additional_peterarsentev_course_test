package ua.testing.task_012;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Sequence Array</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class SequenceArray {
    private static final Logger log = getLogger(SequenceArray.class);

    private final int[] values;

    public SequenceArray(final int[] values) {
        this.values = values;
    }

    public boolean containsOneSequence() {
        int count = 0;
        boolean contains = false;
        for (int value : values) {
            if (value == 1) {
                count++;
            }
            if (count == 3) {
                contains = true;
                break;
            }
        }
        return contains;
    }
}
