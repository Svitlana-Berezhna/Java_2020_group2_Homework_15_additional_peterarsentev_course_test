package ua.testing.task_019;

import org.junit.Test;
import ua.testing.task_002.Point;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * <h1>Maze Test</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class MazeTest {

    @Test
    public void singleSolution() {
        Maze maze = new Maze(
                new int[][]{
                        {1, 0, 0},
                        {1, 1, 1},
                        {0, 0, 1}
                }
        );
        List<Point> result = maze.solution(new Point(0, 0), new Point(2, 2));
        assertThat(
                result, is(
                        asList(
                                new Point(0, 0),
                                new Point(1, 0),
                                new Point(1, 1),
                                new Point(1, 2),
                                new Point(2, 2)
                        )
                )
        );
    }

    @Test
    public void multiSolutions() {
        Maze maze = new Maze(
                new int[][]{
                        {1, 1, 1, 0, 1, 1, 1},
                        {1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 1, 1, 0, 1},
                        {1, 0, 0, 0, 0, 0, 1},
                        {1, 1, 1, 1, 1, 1, 1}
                }
        );
        List<Point> result = maze.solution(new Point(0, 0), new Point(6, 5));
        assertThat(
                result, is(
                        asList(
                                new Point(0, 0),
                                new Point(0, 1),
                                new Point(0, 2),
                                new Point(0, 3),
                                new Point(0, 4),
                                new Point(0, 5),
                                new Point(1, 5),
                                new Point(2, 5),
                                new Point(3, 5),
                                new Point(4, 5),
                                new Point(5, 5),
                                new Point(6, 5)
                        )
                )
        );
    }
}
