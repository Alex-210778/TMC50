package by.tms.homework5.figures.circles;

import by.tms.homework5.figures.Figure;
import by.tms.homework5.figures.Point;

public class Ellipse extends Figure {

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

    @Override
    public double getArea() {
        return Math.PI * smallRadius * bigRadius;
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
    public String toString() {
        return "Эллипс{" +
                "координаты центра эллипса = " + coordinatePoint +
                ", наименование фигуры = '" + figureName + '\'' +
                ", длина меньшей полуоси = " + smallRadius +
                ", длина большей полуоси = " + bigRadius +
                '}';
    }

}
