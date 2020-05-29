package ua.testing.task_018;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

import ua.testing.task_002.Point;

import java.util.HashSet;

/**
 * <h1>Pool</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class Pool {
    private static final Logger log = getLogger(Pool.class);

    private final int[][] values;

    public Pool(final int[][] values) {
        this.values = values;
    }

    public int maxUnion() {
        HashSet<HashSet<Point>> sets = new HashSet<HashSet<Point>>();
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[i][j] == 1) {
                    handle(i, j, sets);
                }
            }
        }

        int MaxSetSize = 0;
        for (HashSet<Point> set : sets) {
            if (set.size() > MaxSetSize) MaxSetSize = set.size();
        }
        return MaxSetSize;
    }

    private void handle(int i, int j, HashSet<HashSet<Point>> sets) {
        HashSet<Point> setTop = null;
        HashSet<Point> setLeft = null;
        for (HashSet<Point> set : sets) {
            for (Point point : set) {
                if (i > 0 && point.getX() == i - 1 && point.getY() == j) {
                    setTop = set;
                }
                if (j > 0 && point.getX() == i && point.getY() == j - 1) {
                    setLeft = set;
                }
                if (setTop != null && setLeft != null) break;
            }
            if (setTop != null && setLeft != null) break;
        }

        if (setTop == null) {
            if (setLeft == null) {
                HashSet<Point> set = new HashSet<Point>();
                set.add(new Point(i, j));
                sets.add(set);
            } else {
                setLeft.add(new Point(i, j));
            }
        } else {
            if (setLeft == null) {
                setTop.add(new Point(i, j));
            } else {
                setLeft.add(new Point(i, j));
                setTop.addAll(setLeft);
            }
        }
    }
}
