package ua.testing.task_008;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Primes</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class Primes {
    private static final Logger log = getLogger(Primes.class);

    private final int limit;

    public Primes(final int limit) {
        this.limit = limit;
    }

    public List<Integer> calc() {
        boolean[] primesBool = new boolean[this.limit + 1];

        Arrays.fill(primesBool, true);
        primesBool[0] = false;
        primesBool[1] = false;
        for (int i = 2; i < primesBool.length; ++i) {
            if (primesBool[i]) {
                for (int j = 2; i * j < primesBool.length; ++j) {
                    primesBool[i * j] = false;
                }
            }
        }

        ArrayList<Integer> primesInt = new ArrayList<Integer>();
        for (int i = 0; i < primesBool.length; i++) {
            if (primesBool[i]) primesInt.add(i);
        }
        return primesInt;
    }
}
