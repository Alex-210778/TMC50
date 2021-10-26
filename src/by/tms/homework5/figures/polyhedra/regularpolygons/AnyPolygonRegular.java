package by.tms.homework5.figures.polyhedra.regularpolygons;

import by.tms.homework5.figures.Point;
import by.tms.homework5.interfeices.IDistance;
import by.tms.homework5.interfeices.IHeight;

public class AnyPolygonRegular extends PolygonRegular {

    public AnyPolygonRegular(Point coordinatePoint, double radiusCircumscribedCircle, int numberOfPolygonFaces) {
        super(coordinatePoint, radiusCircumscribedCircle);
        this.numberOfPolygonFaces = numberOfPolygonFaces;
        this.figureName = "Правильный многоугольник";
    }

    @Override
    public String toString() {
        return "Правильный многоугольник{" +
                "координаты центра описанной окружности = " + coordinatePoint +
                ", радиус описанной окружности = " + radiusCircumscribedCircle +
                ", наименование фигуры = '" + figureName + '\'' +
                ", количество сторон = " + numberOfPolygonFaces +
                '}';
    }
}
