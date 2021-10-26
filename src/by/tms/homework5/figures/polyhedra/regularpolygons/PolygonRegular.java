package by.tms.homework5.figures.polyhedra.regularpolygons;

import by.tms.homework5.figures.Point;
import by.tms.homework5.figures.polyhedra.Polihendron;

public class PolygonRegular extends Polihendron {

    public static final int SUM_OF_ANGLES = 180;
    protected double radiusCircumscribedCircle;

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

    @Override
    public double getArea() {
        return 0.5 * numberOfPolygonFaces * Math.pow(radiusCircumscribedCircle, 2) * Math.sin(Math.toRadians(2 * SUM_OF_ANGLES / numberOfPolygonFaces));
    }

    @Override
    public double getPerimetr() {
        return getLenghtOfSide() * numberOfPolygonFaces;
    }

    public double getRadiusCircumscribedCircle() {
        return radiusCircumscribedCircle;
    }

    public void setRadiusCircumscribedCircle(double radiusCircumscribedCircle) {
        this.radiusCircumscribedCircle = radiusCircumscribedCircle;
    }
}
