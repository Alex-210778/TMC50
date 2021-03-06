package by.tms.homework5.figures.polyhedra;

import by.tms.homework5.figures.Figure;
import by.tms.homework5.figures.Point;
import by.tms.homework5.interfeices.IEqualsArea;
import by.tms.homework5.interfeices.IHeight;

public class Triangle extends Figure implements IHeight, IEqualsArea {
    private double lengthOfSideA;   //Длина стороны a
    private double lengthOfSideB;   //Длина стороны b
    private double angleAlfa;       //Угол между сторонами a и b

    public Triangle(Point coordinatePoint, double lengthOfSideA, double lengthOfSideB, double angleAlfa) {
        super(coordinatePoint);
        this.lengthOfSideA = lengthOfSideA;
        this.lengthOfSideB = lengthOfSideB;
        this.angleAlfa = angleAlfa;
        if (angleAlfa == 90) {
            this.figureName = "Прямоугольный треугольник";
        } else {
            this.figureName = "Треугольник";
        }
    }

    public double getLengthOfSideC() {
        return Math.sqrt(Math.pow(lengthOfSideA, 2) + Math.pow(lengthOfSideB, 2) -
                2 * lengthOfSideA * lengthOfSideB * Math.cos(Math.toRadians(angleAlfa)));
    }

    public double getAngleBetta() {
        return Math.toDegrees(Math.asin(lengthOfSideB * Math.sin(Math.toRadians(angleAlfa)) / getLengthOfSideC()));
    }

    public double getAngleGamma() {
        return 180 - angleAlfa - getAngleBetta();
    }

    public double getPerimetr() {
        return lengthOfSideA + lengthOfSideB + getLengthOfSideC();
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
    public double getHeight() {
        double semiPerimetr = getPerimetr() / 2;
        return 2 * Math.sqrt(semiPerimetr * (semiPerimetr - getLengthOfSideA()) *
                (semiPerimetr - getLengthOfSideB()) * (semiPerimetr - getLengthOfSideC())) / getLengthOfSideC();
    }

    @Override
    public double getArea() {
        return getHeight() * getLengthOfSideC() / 2;
    }

    public double getLengthOfSideA() {
        return lengthOfSideA;
    }

    public void setLengthOfSideA(double lengthOfSideA) {
        this.lengthOfSideA = lengthOfSideA;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        if (Double.compare(triangle.lengthOfSideA, lengthOfSideA) != 0) return false;
        if (Double.compare(triangle.lengthOfSideB, lengthOfSideB) != 0) return false;
        return Double.compare(triangle.angleAlfa, angleAlfa) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(lengthOfSideA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(lengthOfSideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(angleAlfa);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Треугольник{" +
                "координаты точки А = " + coordinatePoint +
                ", длина стороны a = " + lengthOfSideA +
                ", длина стороны b = " + lengthOfSideB +
                ", угол между сторонами = " + angleAlfa +
                ", наименование фигуры = '" + figureName + '\'' +
                '}';
    }
}
