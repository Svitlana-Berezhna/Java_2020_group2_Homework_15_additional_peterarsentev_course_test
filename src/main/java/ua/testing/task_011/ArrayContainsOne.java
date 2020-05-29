package ua.testing.task_011;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Array Contains One</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class ArrayContainsOne {
    private static final Logger log = getLogger(ArrayContainsOne.class);

    private final int[] values;

    public ArrayContainsOne(final int[] values) {
        this.values = values;
    }

    public boolean containsOnlyOne() {
        boolean result = true;
        for (int value : values) {
            if (value != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
