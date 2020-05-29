package ua.testing.task_010;

import org.slf4j.Logger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Brackets</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class Brackets {
    private static final Logger log = getLogger(Brackets.class);
    private final String line;

    public Brackets(final String line) {
        this.line = line;
    }

    public boolean isCorrect() {
        String str = this.line;
        HashMap<Character, Character> BracesMap = new HashMap<Character, Character>();
        BracesMap.put(')', '(');
        HashSet<Character> openBracketSet = new HashSet<Character>(BracesMap.values());
        Stack<Character> stack = new Stack<Character>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char cur = chars[i];
            if (openBracketSet.contains(cur)) {
                stack.push(cur);
            } else if (BracesMap.keySet().contains(cur)) {
                if (stack.isEmpty())
                    return false;
                if (BracesMap.get(cur) != stack.peek())
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
