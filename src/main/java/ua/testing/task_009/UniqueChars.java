package ua.testing.task_009;

/**
 * <h1>Unique Chars</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class UniqueChars {
    private final String line;

    public UniqueChars(final String line) {
        this.line = line;
    }

    public int unique() {
        String str = this.line;
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (res.indexOf(ch) < 0) {
                res += ch;
                str.replace(ch, ' ');
            }
        }
        return res.length();
    }
}
