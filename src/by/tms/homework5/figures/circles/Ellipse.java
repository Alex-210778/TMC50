package by.tms.homework5.figures.circles;

import by.tms.homework5.figures.Figure;
import by.tms.homework5.figures.Point;
import by.tms.homework5.interfeices.IEqualsArea;

public class Ellipse extends Figure implements IEqualsArea {
    private double smallRadius;
    private double bigRadius;

    public Ellipse(Point coordinatePoint, double smallRadius, double bigRadius) {
        super(coordinatePoint);
        this.smallRadius = smallRadius;
        this.bigRadius = bigRadius;
        this.figureName = "Эллипс";
    }

    public double getCoefOfCompression() {
        return smallRadius / bigRadius;
    }

    public double getPerimetrOfEllipse() {
        return Math.PI * (bigRadius + smallRadius) * (1 + (3 * Math.pow(((bigRadius - smallRadius) / (bigRadius + smallRadius)), 2) /
                (10 + Math.sqrt(4 - 3 * Math.pow(((bigRadius - smallRadius) / (bigRadius + smallRadius)), 2)))));
    }

    public double getSmallRadius() {
        return smallRadius;
    }

    public void setSmallRadius(double smallRadius) {
        this.smallRadius = smallRadius;
    }

    public double getBigRadius() {
        return bigRadius;
    }

    public void setBigRadius(double bigRadius) {
        this.bigRadius = bigRadius;
    }

    @Override
    public double getArea() {
        return Math.PI * smallRadius * bigRadius;
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
        Ellipse ellipse = (Ellipse) o;
        if (Double.compare(ellipse.smallRadius, smallRadius) != 0) return false;
        return Double.compare(ellipse.bigRadius, bigRadius) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(smallRadius);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(bigRadius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Эллипс{" +
                "координаты центра эллипса = " + coordinatePoint +
                ", наименование фигуры = '" + figureName + '\'' +
                ", длина меньшей полуоси = " + smallRadius +
                ", длина большей полуоси = " + bigRadius +
                '}';
    }
}
