package by.tms.homework5.figures.polyhedra.regularpolygons;

import by.tms.homework5.figures.Figure;
import by.tms.homework5.figures.Point;
import by.tms.homework5.figures.polyhedra.Polihendron;
import by.tms.homework5.interfeices.IEqualsArea;

public class PolygonRegular extends Polihendron implements IEqualsArea {
    public static final int SUM_OF_ANGLES = 180;
    protected double radiusCircumscribedCircle;     //радиус описанной окружности

    protected PolygonRegular(Point coordinatePoint, double radiusCircumscribedCircle) {
        super(coordinatePoint);
        this.radiusCircumscribedCircle = radiusCircumscribedCircle;
    }

    public double getAngleOfPoligon() {
        return SUM_OF_ANGLES * (numberOfPolygonFaces - 2) / numberOfPolygonFaces;
    }

    public double getLenghtOfSide() {
        return 2 * radiusCircumscribedCircle * Math.sin(Math.toRadians(SUM_OF_ANGLES / numberOfPolygonFaces));
    }

    public double getRadiusInscribedCircle() {
        return radiusCircumscribedCircle * Math.cos(Math.toRadians(SUM_OF_ANGLES / numberOfPolygonFaces));
    }

    public double getRadiusCircumscribedCircle() {
        return radiusCircumscribedCircle;
    }

    public void setRadiusCircumscribedCircle(double radiusCircumscribedCircle) {
        this.radiusCircumscribedCircle = radiusCircumscribedCircle;
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
    public double getArea() {
        return 0.5 * numberOfPolygonFaces * Math.pow(radiusCircumscribedCircle, 2) * Math.sin(Math.toRadians(2 * SUM_OF_ANGLES / numberOfPolygonFaces));
    }

    @Override
    public double getPerimetr() {
        return getLenghtOfSide() * numberOfPolygonFaces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolygonRegular that = (PolygonRegular) o;
        return Double.compare(that.radiusCircumscribedCircle, radiusCircumscribedCircle) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radiusCircumscribedCircle);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "PolygonRegular{" +
                "coordinatePoint=" + coordinatePoint +
                ", figureName='" + figureName + '\'' +
                ", numberOfPolygonFaces=" + numberOfPolygonFaces +
                ", radiusCircumscribedCircle=" + radiusCircumscribedCircle +
                '}';
    }
}
