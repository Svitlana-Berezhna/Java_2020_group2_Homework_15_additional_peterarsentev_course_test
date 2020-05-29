package ua.testing.task_016;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Tic-Tac-Toe</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class TicTacToe {
    private static final Logger log = getLogger(TicTacToe.class);

    private final int[][] values;

    public TicTacToe(final int[][] values) {
        this.values = values;
    }

    public boolean hasWinner() {
        return checkWinnerHorizontally() ||
                checkWinnerVertically() ||
                checkWinnerDiagonallyDirect() ||
                checkWinnerDiagonallyReverse();
    }

    private boolean checkWinnerHorizontally() {
        boolean res = false;
        for (int i = 0; i < values.length; i++) {
            res = true;
            for (int j = 1; res && j < values.length; j++)
                if (values[i][0] != values[i][j])
                    res = false;
        }
        return res;
    }

    private boolean checkWinnerVertically() {
        boolean res = false;
        for (int j = 0; j < values.length; j++) {
            res = true;
            for (int i = 1; res && i < values.length; i++)
                if (values[0][j] != values[i][j])
                    res = false;
        }
        return res;
    }

    private boolean checkWinnerDiagonallyDirect() {
        boolean res = true;
        for (int i = 1; res && i < values.length; i++) {
            if (values[0][0] != values[i][i])
                res = false;
        }
        return res;
    }

    private boolean checkWinnerDiagonallyReverse() {
        boolean res = true;
        for (int i = 1; res && i < values.length; i++) {
            if (values[0][values.length - 1] != values[i][values.length - 1 - i])
                res = false;
        }
        return res;
    }
}
