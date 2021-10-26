package by.tms.homework5.figures.polyhedra;

import by.tms.homework5.figures.Figure;
import by.tms.homework5.figures.Point;
import by.tms.homework5.interfeices.IDistance;
import by.tms.homework5.interfeices.IHeight;

public class Triangle extends Figure implements IHeight {

    public final double SEMI_PERIMETR = getPerimetr() / 2;

    private Point pointB;
    private double lengthOfSideB;
    private double angleAlfa;

    public Triangle(Point coordinatePoint, Point pointB, double lengthOfSideB, double angleAlfa) {
        super(coordinatePoint);
        this.pointB = pointB;
        this.lengthOfSideB = lengthOfSideB;
        this.angleAlfa = angleAlfa;
        if (angleAlfa == 90) {
            this.figureName = "Прямоугольный треугольник";
        } else {
            this.figureName = "Треугольник";
        }
    }

    public double getLengthOfSideA() {
        return pointB.getCoordinateX();



      //  return Math.sqrt((Math.pow(pointB.getCoordinateX() - coordinatePoint.getCoordinateX(), 2)) + Math.pow(coordinatePoint.getCoordinateY() - coordinatePoint.getCoordinateY(), 2));
    }

    public double getLengthOfSideC() {
        return Math.sqrt(Math.pow(getLengthOfSideA(), 2) + Math.pow(lengthOfSideB, 2) -
                2 * getLengthOfSideA() * lengthOfSideB * Math.cos(Math.toRadians(angleAlfa)));
    }

    public double getAngleGamma() {
        return Math.toDegrees(Math.asin(lengthOfSideB * Math.sin(Math.toRadians(angleAlfa))) / getLengthOfSideC());
    }

    public double getAngleBetta() {
        return 180 - angleAlfa - getAngleGamma();
    }

    public double getPerimetr() {
        return getLengthOfSideA() + lengthOfSideB + getLengthOfSideC();
    }

    @Override
    public double getHeight() {
        return 2 * Math.sqrt(SEMI_PERIMETR * (SEMI_PERIMETR - getLengthOfSideA()) *
                (SEMI_PERIMETR - getLengthOfSideB()) * (SEMI_PERIMETR - getLengthOfSideC())) / getLengthOfSideC();
    }

    @Override
    protected double getArea() {
        return getHeight() * getLengthOfSideC() / 2;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public double getLengthOfSideB() {
        return lengthOfSideB;
    }

    public void setLengthOfSideB(double lengthOfSideB) {
        this.lengthOfSideB = lengthOfSideB;
    }

    public double getAngleAlfa() {
        return angleAlfa;
    }

    public void setAngleAlfa(double angleAlfa) {
        this.angleAlfa = angleAlfa;
    }


    @Override
    public String toString() {
        return "Треугольник{" +
                "координаты точки А = " + coordinatePoint +
                ", координаты точки B = " + pointB +
                ", длина стороны b = " + lengthOfSideB +
                ", угол альфа = " + angleAlfa +
                ", наименование фигуры = '" + figureName + '\'' +
                '}';
    }



}
