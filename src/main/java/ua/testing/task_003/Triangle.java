package ua.testing.task_003;

import org.slf4j.Logger;
import ua.testing.task_002.Point;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Triangle</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class Triangle {
    private static final Logger log = getLogger(Triangle.class);

    protected final Point first;
    protected final Point second;
    protected final Point third;

    protected final double a;
    protected final double b;
    protected final double c;

    public Triangle(final Point first, final Point second, final Point third) {
        this.first = first;
        this.second = second;
        this.third = third;

        a = first.distanceTo(second);
        b = second.distanceTo(third);
        c = third.distanceTo(first);
    }

    public boolean exists() {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }

    public double area() {
        if (exists()) {
            double p = (a + b + c) / 2;
            return Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        } else throw new IllegalStateException("Triangle does not exist.");
    }
}
