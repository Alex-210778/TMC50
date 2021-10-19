package by.tms.homework4.solutions;

public class Rectangle {
    private Point firstPoint;
    private Point secondPoint;

    public Rectangle(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Rectangle(){
        this.firstPoint = new Point(0, 0);
        this.secondPoint = new Point(10, 10);
    }

    public double getArea() {
        return Math.abs((secondPoint.getX() - firstPoint.getX()) * (secondPoint.getY() - firstPoint.getY()));
    }

    public double getPerimetr() {
        return 2 * (Math.abs(secondPoint.getX() - firstPoint.getX()) + Math.abs(secondPoint.getY()) - firstPoint.getY());
    }

    public double getDiagonalLength() {
        return Math.sqrt(Math.pow(secondPoint.getX() - firstPoint.getX(), 2) + Math.pow(secondPoint.getY() - firstPoint.getY(), 2));
    }
}
