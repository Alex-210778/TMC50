package by.tms.homework5.figures.polyhedra;

import by.tms.homework5.figures.Figure;
import by.tms.homework5.figures.Point;
import by.tms.homework5.interfeices.IEqualsArea;
import by.tms.homework5.interfeices.IHeight;

public class Trapezoid extends Figure implements IHeight, IEqualsArea {
    private double lengthOfSideA;   //Длина основания стороны a
    private double lengthOfSideB;   //Длина стороны b
    private double angleAlfa;       //Угол между сторонами a и b
    private double angleBetta;       //Угол между сторонами a и c

    public Trapezoid(Point coordinatePoint, double lengthOfSideA, double lengthOfSideB, double angleAlfa, double angleBetta) {
        super(coordinatePoint);
        this.lengthOfSideA = lengthOfSideA;
        this.lengthOfSideB = lengthOfSideB;
        this.angleAlfa = angleAlfa;
        this.angleBetta = angleBetta;
        this.figureName = "Трапеция";
    }

    public double getAngleGamma() {
        return 180 - angleBetta;
    }

    public double getAngleDelta() {
        return 180 - angleAlfa;
    }

    public double getlengthOfSideC() {
        return getHeight() / Math.sin(Math.toRadians(angleBetta));
    }

    public double getlengthOfSideD() {
        return lengthOfSideA - lengthOfSideB * Math.cos(Math.toRadians(angleAlfa)) -
                getlengthOfSideC() * Math.cos(Math.toRadians(angleBetta));
    }

    public double getPerimetr() {
        return lengthOfSideA + lengthOfSideB + getlengthOfSideC() + getlengthOfSideD();
    }

    public double getlengthOfMiddleLine() {
        return (lengthOfSideA + getlengthOfSideD()) / 2;
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
        return lengthOfSideB * Math.sin(Math.toRadians(angleAlfa));
    }

    @Override
    public double getArea() {
        return getHeight() * getlengthOfMiddleLine();
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

    public double getAngleBetta() {
        return angleBetta;
    }

    public void setAngleBetta(double angleBetta) {
        this.angleBetta = angleBetta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trapezoid trapezoid = (Trapezoid) o;
        if (Double.compare(trapezoid.lengthOfSideA, lengthOfSideA) != 0) return false;
        if (Double.compare(trapezoid.lengthOfSideB, lengthOfSideB) != 0) return false;
        if (Double.compare(trapezoid.angleAlfa, angleAlfa) != 0) return false;
        return Double.compare(trapezoid.angleBetta, angleBetta) == 0;
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
        temp = Double.doubleToLongBits(angleBetta);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Параллелограмм{" +
                "координаты точки А = " + coordinatePoint +
                ", длина стороны a = " + lengthOfSideA +
                ", длина стороны b = " + lengthOfSideB +
                ", угол между сторонами = " + angleAlfa +
                ", наименование фигуры = '" + figureName + '\'' +
                '}';
    }
}
