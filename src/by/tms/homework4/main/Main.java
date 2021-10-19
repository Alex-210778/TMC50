package by.tms.homework4.main;

import by.tms.homework4.solutions.Point;
import by.tms.homework4.solutions.Rectangle;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(5, 4);
        Point point3 = new Point(10, 5.5);
        System.out.printf("Расстояние от точки 1 до точки 3: %.3f\n", point1.getDistance(point3));

        Rectangle rectangle = new Rectangle(point1, point2);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimetr());
        System.out.println("Длина диагонали прямоугольника: " + rectangle.getDiagonalLength());

        Rectangle rectangle1 = new Rectangle();
        System.out.println("Периметр прямоугольника: " + rectangle1.getPerimetr());
        System.out.println("Длина диагонали прямоугольника: " + rectangle1.getDiagonalLength());
        point1.setX(-2);
        point1.setY(-5.259);
        point2.setX(45.669);
        point2.setY(-87.336);

        Rectangle rectangle2 = new Rectangle(point1, point2);
        System.out.printf("Расстояние от точки 1 до точки 3: %.3f\n", point1.getDistance(point3));
        System.out.printf("Площадь нового прямоугольника: %.3f\n", rectangle2.getArea());
        System.out.printf("Периметр нового прямоугольника: %.3f\n", rectangle2.getPerimetr());
        System.out.printf("Длина диагонали нового прямоугольника: %.3f\n", rectangle2.getDiagonalLength());
    }
}
