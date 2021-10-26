package by.tms.homework5.figures.polyhedra.regularpolygons;

import by.tms.homework5.figures.Point;
import by.tms.homework5.interfeices.IHeight;

public class TriangleEquilateral extends PolygonRegular implements IHeight {

    public TriangleEquilateral(Point coordinatePoint, double radiusCircumscribedCircle) {
        super(coordinatePoint, radiusCircumscribedCircle);
        this.numberOfPolygonFaces = 3;
        this.figureName = "Равносторонний треугольник";
    }

    @Override
    public double getArea() {
        return (getHeight() * getLenghtOfSide()) / 2;
    }

    @Override
    public double getHeight() {
        return getRadiusCircumscribedCircle() + getRadiusInscribedCircle();
    }

    @Override
    public String toString() {
        return "Равносторонний треугольник{" +
                "координаты центра описанной окружности = " + coordinatePoint +
                ", радиус описанной окружности = " + radiusCircumscribedCircle +
                ", наименование фигуры = '" + figureName + '\'' +
                ", количество сторон = " + numberOfPolygonFaces +
                '}';
    }
}
