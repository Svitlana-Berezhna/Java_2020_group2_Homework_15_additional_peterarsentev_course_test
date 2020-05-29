package ua.testing.task_014;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * <h1>Reverse Phrase Test</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class ReversePhraseTest {

    @Test
    public void oneWords() {
        ReversePhrase phrase = new ReversePhrase("code and earn");
        String result = phrase.reverse();
        assertThat(result, is("earn and code"));
    }

    @Test
    public void oneWord() {
        ReversePhrase phrase = new ReversePhrase("Java");
        String result = phrase.reverse();
        assertThat(result, is("Java"));
    }
}
