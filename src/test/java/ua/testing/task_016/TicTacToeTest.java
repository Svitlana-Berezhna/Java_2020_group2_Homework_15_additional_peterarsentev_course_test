package ua.testing.task_016;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * <h1>Tic-Tac-Toe Test</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class TicTacToeTest {

    @Test
    public void hasWinner() {
        TicTacToe game = new TicTacToe(
                new int[][]{
                        {1, 0, 0},
                        {1, 1, 0},
                        {0, 0, 1}
                }
        );
        boolean result = game.hasWinner();
        assertThat(result, is(true));
    }

    @Test
    public void hasNotWinner() {
        TicTacToe game = new TicTacToe(
                new int[][]{
                        {1, 0, 1},
                        {1, 0, 0},
                        {0, 1, 1}
                }
        );
        boolean result = game.hasWinner();
        assertThat(result, is(false));
    }
}
