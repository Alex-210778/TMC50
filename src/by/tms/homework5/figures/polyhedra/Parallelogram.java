package by.tms.homework5.figures.polyhedra;

import by.tms.homework5.figures.Figure;
import by.tms.homework5.figures.Point;
import by.tms.homework5.interfeices.IDistance;
import by.tms.homework5.interfeices.IEqualsArea;
import by.tms.homework5.interfeices.IHeight;

public class Parallelogram extends Figure implements IHeight, IDistance, IEqualsArea {
    private double lengthOfSideA;   //Длина стороны a
    private double lengthOfSideB;   //Длина стороны b
    private double angleAlfa;       //Угол между сторонами a и b

    public Parallelogram(Point coordinatePoint, double lengthOfSideA, double lengthOfSideB, double angleAlfa) {
        super(coordinatePoint);
        this.lengthOfSideA = lengthOfSideA;
        this.lengthOfSideB = lengthOfSideB;
        this.angleAlfa = angleAlfa;
        if (lengthOfSideA == lengthOfSideB && angleAlfa == 90) {
            this.figureName = "Квадрат";
        } else if (lengthOfSideA == lengthOfSideB) {
            this.figureName = "Ромб";
        } else if (angleAlfa == 90) {
            this.figureName = "Прямоугольник";
        } else {
            this.figureName = "Параллелограмм";
        }
    }

    public double getAngleBetta() {
        return 180 - angleAlfa;
    }

    public double getPerimetr() {
        return 2 * (lengthOfSideA + lengthOfSideB);
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
    public double getDistance() {
        return Math.sqrt(Math.pow(lengthOfSideA, 2) + Math.pow(lengthOfSideB, 2) -
                2 * lengthOfSideA * lengthOfSideB * Math.cos(Math.toRadians(angleAlfa)));
    }

    @Override
    public double getArea() {
        return getHeight() * lengthOfSideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        if (Double.compare(that.lengthOfSideA, lengthOfSideA) != 0) return false;
        if (Double.compare(that.lengthOfSideB, lengthOfSideB) != 0) return false;
        return Double.compare(that.angleAlfa, angleAlfa) == 0;
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
        return "Параллелограмм{" +
                "координаты точки А = " + coordinatePoint +
                ", длина стороны a = " + lengthOfSideA +
                ", длина стороны b = " + lengthOfSideB +
                ", угол между сторонами = " + angleAlfa +
                ", наименование фигуры = '" + figureName + '\'' +
                '}';
    }
}
