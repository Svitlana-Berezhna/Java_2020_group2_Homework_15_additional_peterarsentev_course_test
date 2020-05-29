package ua.testing.task_019;

import org.slf4j.Logger;
import ua.testing.task_002.Point;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * <h1>Maze</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class Maze {
    private static final Logger log = getLogger(Maze.class);

    private final int[][] values;

    private ArrayList<RoutePoint> mazeResult = new ArrayList<RoutePoint>();

    private enum Side {
        TOP,
        DOWN,
        LEFT,
        RIGHT
    }

    public ArrayList<RoutePoint> getMazeResult() {
        return mazeResult;
    }

    public Maze(final int[][] values) {
        this.values = values;
    }

    public static class RoutePoint extends Point {
        private Point previousPoint;

        public RoutePoint(Point previousPoint, int x, int y) {
            super(x, y);
            this.previousPoint = previousPoint;
        }

        public Point getPreviousPoint() {
            return previousPoint;
        }
    }

    private void checkNeighboringPoint(RoutePoint routePoint, Side side, ArrayList<RoutePoint> result) {
        int i = routePoint.getX();
        int j = routePoint.getY();
        if (side == Side.TOP) {
            i--;
        }
        if (side == Side.DOWN) {
            i++;
        }
        if (side == Side.LEFT) {
            j--;
        }
        if (side == Side.RIGHT) {
            j++;
        }
        if ((i >= 0) && (j >= 0) && (i < values.length) && (j < values.length) && (values[i][j] == 1)) {
            if ((routePoint.previousPoint == null) || ((routePoint.previousPoint != null) &&
                    (routePoint.previousPoint.getX() != i) &&
                    (routePoint.previousPoint.getY() != j))) {
                result.add(new RoutePoint(routePoint, i, j));
            }
        }
    }

    public ArrayList<RoutePoint> checkPoint(ArrayList<RoutePoint> startPoints, Point finish) {
        ArrayList<RoutePoint> result = new ArrayList<RoutePoint>();
        for (RoutePoint routePoint : startPoints) {
            if (finish.getX() == routePoint.getX() && finish.getY() == routePoint.getY()) {
                return result;
            }
            checkNeighboringPoint(routePoint, Side.TOP, result);
            checkNeighboringPoint(routePoint, Side.DOWN, result);
            checkNeighboringPoint(routePoint, Side.LEFT, result);
            checkNeighboringPoint(routePoint, Side.RIGHT, result);
        }
        if (result.size() > 0) {
            this.mazeResult.addAll(result);
        }
        return checkPoint(result, finish);
    }

    private List<Point> reverse(List<Point> result) {
        List<Point> result1 = new ArrayList<Point>();
        for (int i = result.size() - 1; i >= 0; i--) {
            result1.add(result.get(i));
        }
        return result1;
    }

    public List<Point> solution(Point start, Point finish) {
        ArrayList<RoutePoint> startPoints = new ArrayList<RoutePoint>();
        startPoints.add(new RoutePoint(null, start.getX(), start.getY()));
        ArrayList<RoutePoint> route = checkPoint(startPoints, new Point(finish.getX(), finish.getY()));

        ArrayList<ArrayList<Point>> results = new ArrayList<ArrayList<Point>>();
        List<Point> result = new ArrayList<Point>();
        Point previous = null;
        int i;
        for (i = mazeResult.size() - 1; i >= 0; i--) {
            RoutePoint routePoint = mazeResult.get(i);
            if (routePoint.getX() == finish.getX() && routePoint.getY() == finish.getY()) {
                result.add(finish);
                previous = routePoint.getPreviousPoint();
                break;
            }
        }

        for (int j = i - 1; j >= 0; j--) {
            RoutePoint routePoint = mazeResult.get(j);
            if (routePoint.getX() == previous.getX() && routePoint.getY() == previous.getY()) {
                result.add(new Point(routePoint.getX(), routePoint.getY()));
                previous = routePoint.getPreviousPoint();
            }
        }
        if (previous.getX() == start.getX() && previous.getY() == start.getY()) {
            result.add(start);
        }
        return reverse(result);
    }
}
