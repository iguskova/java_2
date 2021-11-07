package ru.solvo;

import java.util.*;


public class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pont [x=" + x + ", y=" + y + "]";
    }

    public static void main (String[]args){

        Point point1 = new Point(22, 4);
        Point point2 = new Point(3, 16);
        Point point3 = new Point(4, 8);
        Point point4 = new Point(9, 10);

        List<Point> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);


        Collections.sort(points, Comparator.comparing(Point::getX));

        points.forEach(System.out::println);

        Collections.sort(points, Comparator.comparing(Point::getX));
        Collections.reverse(points);

        points.forEach(System.out::println);

        Collections.sort(points, Comparator.comparing(Point::getY));

        points.forEach(System.out::println);

        Collections.sort(points, Comparator.comparing(Point::getY));
        Collections.reverse(points);

        points.forEach(System.out::println);

        }

    @Override
    public int compareTo(Point otherP) {
        return this.x - otherP.x;
    }
}