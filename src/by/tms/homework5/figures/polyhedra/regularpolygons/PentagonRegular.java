package by.tms.homework5.figures.polyhedra.regularpolygons;

import by.tms.homework5.figures.Point;
import by.tms.homework5.interfeices.IDistance;
import by.tms.homework5.interfeices.IHeight;

public class PentagonRegular extends PolygonRegular implements IHeight, IDistance {

    public PentagonRegular(Point coordinatePoint, double radiusCircumscribedCircle) {
        super(coordinatePoint, radiusCircumscribedCircle);
        this.numberOfPolygonFaces = 5;
        this.figureName = "Равносторонний пятиугольник";
    }

    @Override
    public double getHeight() {
        return Math.tan(Math.toRadians(SUM_OF_ANGLES * 2 / 5)) * getLenghtOfSide() / 2;
    }

    @Override
    public double getDistance() {
        return ((Math.sqrt(5) + 1) / 2) * getLenghtOfSide();
    }

    @Override
    public String toString() {
        return "Равносторонний пятиугольник{" +
                "координаты центра описанной окружности = " + coordinatePoint +
                ", радиус описанной окружности = " + radiusCircumscribedCircle +
                ", наименование фигуры = '" + figureName + '\'' +
                ", количество сторон = " + numberOfPolygonFaces +
                '}';
    }
}
