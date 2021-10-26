package by.tms.homework5.figures.polyhedra.regularpolygons;

import by.tms.homework5.figures.Point;
import by.tms.homework5.interfeices.IDistance;

public class Square extends PolygonRegular implements IDistance {

    public Square(Point coordinatePoint, double radiusCircumscribedCircle) {
        super(coordinatePoint, radiusCircumscribedCircle);
        this.numberOfPolygonFaces = 4;
        this.figureName = "Квадрат";
    }

    @Override
    public double getArea() {
        return Math.pow(getLenghtOfSide(), 2);
    }

    @Override
    public double getDistance() {
        return 2 * radiusCircumscribedCircle;
    }

    @Override
    public String toString() {
        return "Квадрат{" +
                "координаты центра описанной окружности = " + coordinatePoint +
                ", радиус описанной окружности = " + radiusCircumscribedCircle +
                ", наименование фигуры = '" + figureName + '\'' +
                ", количество сторон = " + numberOfPolygonFaces +
               '}';
    }



}

