package by.tms.homework5.figures.circles;

import by.tms.homework5.figures.Figure;
import by.tms.homework5.figures.Point;

public class Circle extends Figure {

    private double radius;

    public Circle(Point coordinatePoint, double radius) {
        super(coordinatePoint);
        this.radius = radius;
        this.figureName = "Круг";
    }

    public double getLenghtOfCircle() {
        return 2 * Math.PI * radius;
    }

    public double getAreaOfSector(double angleOfSector) {
        return Math.PI * Math.pow(radius, 2) * angleOfSector / 360;
    }

    public double getLenghtOfSectorArc(double angleOfSector) {
        return Math.PI * radius * angleOfSector / 180;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }


    @Override
    public String toString() {
        return "Круг{" +
                "координаты центра круга = " + coordinatePoint +
                ", наименование фигуры = '" + figureName + '\'' +
                ", радиус = " + radius +
                '}';
    }
}
