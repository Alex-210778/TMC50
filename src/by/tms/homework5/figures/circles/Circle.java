package by.tms.homework5.figures.circles;

import by.tms.homework5.figures.Figure;
import by.tms.homework5.figures.Point;
import by.tms.homework5.interfeices.IEqualsArea;

public class Circle extends Figure implements IEqualsArea {
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
    public boolean isEqualsArea (Figure figure) {
        if (this.getArea() == figure.getArea()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
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
