package by.tms.homework5.figures.polyhedra.regularpolygons;

import by.tms.homework5.figures.Point;
import by.tms.homework5.interfeices.IDistance;

public class HexagonRegular extends PolygonRegular implements IDistance {

    public HexagonRegular(Point coordinatePoint, double radiusCircumscribedCircle) {
        super(coordinatePoint, radiusCircumscribedCircle);
        this.numberOfPolygonFaces = 6;
        this.figureName = "Правильный шестиугольник";
    }

    @Override
    public double getLenghtOfSide() {
        return getRadiusCircumscribedCircle();
    }

    @Override
    public double getDistance() {
        return 2 * radiusCircumscribedCircle;
    }

    @Override
    public String toString() {
        return "Правильный шестиугольник{" +
                "координаты центра описанной окружности = " + coordinatePoint +
                ", радиус описанной окружности = " + radiusCircumscribedCircle +
                ", наименование фигуры = '" + figureName + '\'' +
                ", количество сторон = " + numberOfPolygonFaces +
                '}';
    }
}

