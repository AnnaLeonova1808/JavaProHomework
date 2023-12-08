package javaPro.saturday.pointsOfSquaeres;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

public class Points_Squares {
    public Set<Point> getCommon(Point sq1, Point sq2) {
        Set<Point> sq1POINTS;
        Set<Point> sq2POINTS;
        System.out.println("Координаты первого квадрата:"); //
        sq1POINTS = get9points(sq1);
        System.out.println("Координаты второго квадрата:"); //
        sq2POINTS = get9points(sq2);
        System.out.println("Общие точки:");
        sq1POINTS.retainAll(sq2POINTS);
        for (Point point : sq1POINTS) {
            System.out.println("X: " + point.getX() + ", Y: " + point.getY());
        }
        return sq1POINTS;
    }

    private Set<Point> get9points(Point sq) {
        Set<Point> points = new HashSet<>();
        for (double X = (sq.getX() - 1); X <= (sq.getX() + 1); X++) {
            for (double Y = (sq.getY() - 1); Y <= (sq.getY() + 1); Y++) {
                Point point = new Point((int) X, (int) Y);
                points.add(point);
                System.out.println("X: " + point.getX() + ", Y: " + point.getY());
            }
        }
        return points;
    }

    public static void main(String[] args) {
        Points_Squares cla = new Points_Squares();
        Set<Point> commonPoints = cla.getCommon(new Point(2, 2), new Point(3, 3));

    }
}
