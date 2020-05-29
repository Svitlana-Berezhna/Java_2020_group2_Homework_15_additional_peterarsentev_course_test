package ua.testing.task_004;

import org.slf4j.Logger;
import ua.testing.task_002.Point;
import ua.testing.task_003.Triangle;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Isosceles Triangle</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class IsoscelesTriangle extends Triangle {
    private static final Logger log = getLogger(IsoscelesTriangle.class);

    public IsoscelesTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        return super.exists() && (this.a == this.b || this.b == this.c || this.c == this.a);
    }
}
