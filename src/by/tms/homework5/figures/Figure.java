package by.tms.homework5.figures;

public abstract class Figure{

    protected Point coordinatePoint;
    protected String figureName;

    protected Figure(Point coordinatePoint) {
        this.coordinatePoint = coordinatePoint;
    }

    protected abstract double getArea();

    public Point getCoordinatePoint() {
        return coordinatePoint;
    }

    public void setCoordinatePoint(Point coordinatePoint) {
        this.coordinatePoint = coordinatePoint;
    }
}
