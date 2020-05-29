package ua.testing.task_005;

import org.slf4j.Logger;
import ua.testing.task_002.Point;
import ua.testing.task_003.Triangle;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Right Triangle</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class RightTriangle extends Triangle {
    private static final Logger log = getLogger(RightTriangle.class);

    public RightTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        return super.exists() &&
                ((Math.round(Math.pow(this.a, 2) + Math.pow(this.b, 2)) == Math.round(Math.pow(this.c, 2))) ||
                        (Math.round(Math.pow(this.b, 2) + Math.pow(this.c, 2)) == Math.round(Math.pow(this.a, 2))) ||
                        (Math.round(Math.pow(this.c, 2) + Math.pow(this.a, 2)) == Math.round(Math.pow(this.b, 2))));
    }
}
