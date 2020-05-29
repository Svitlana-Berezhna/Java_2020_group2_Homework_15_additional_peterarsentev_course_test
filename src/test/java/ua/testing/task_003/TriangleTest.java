package ua.testing.task_003;

import org.junit.Test;
import ua.testing.task_002.Point;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * <h1>Triangle Test</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class TriangleTest {

    @Test
    public void calculateArea() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        double result = new Triangle(first, second, third).area();
        assertThat(result, is(2d));
    }

    @Test
    public void checkExists() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        boolean result = new Triangle(first, second, third).exists();
        assertThat(result, is(true));
    }

    @Test
    public void notExist() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(0, 4);
        boolean result = new Triangle(first, second, third).exists();
        assertThat(result, is(false));
    }

    @Test(expected = IllegalStateException.class)
    public void inLine() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(0, 4);
        new Triangle(first, second, third).area();
    }

    @Test(expected = IllegalStateException.class)
    public void inPoint() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 0);
        Point third = new Point(0, 0);
        new Triangle(first, second, third).area();
    }
}
