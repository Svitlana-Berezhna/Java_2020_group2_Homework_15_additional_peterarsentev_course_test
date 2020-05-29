package ua.testing.task_014;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Reverse Phrase</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class ReversePhrase {
    private static final Logger log = getLogger(ReversePhrase.class);

    private final String line;

    public ReversePhrase(final String line) {
        this.line = line;
    }

    public String reverse() {
        String res = "";
        String[] str = line.split(" ");
        for (int i = str.length - 1; i >= 0; i--) {
            res += str[i] + " ";
        }
        return res.trim();
    }
}
