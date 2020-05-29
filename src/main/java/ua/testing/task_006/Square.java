package ua.testing.task_006;

import org.slf4j.Logger;
import ua.testing.task_002.Point;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Square</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class Square {
    private static final Logger log = getLogger(Square.class);

    private final Point first;
    private final Point second;
    private final Point third;
    private final Point fourth;

    public Square(final Point first, final Point second, final Point third, final Point fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public boolean exists() {
        double ab = first.distanceTo(second);
        double ac = first.distanceTo(third);
        double ad = first.distanceTo(fourth);

        double bc = second.distanceTo(third);
        double bd = second.distanceTo(fourth);

        double cd = third.distanceTo(fourth);

        return (ab == bc && bc == cd && cd == ad && ac == bd) ||
                (ac == cd && cd == bd && bd == ab && ad == bc) ||
                (ad == bd && bd == bc && bc == ac && ab == cd);
    }
}
