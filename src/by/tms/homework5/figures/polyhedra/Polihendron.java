package by.tms.homework5.figures.polyhedra;

import by.tms.homework5.figures.Figure;
import by.tms.homework5.figures.Point;

public abstract class Polihendron extends Figure {

    protected int numberOfPolygonFaces;

    protected Polihendron(Point coordinatePoint) {
        super(coordinatePoint);
    }

    protected abstract double getPerimetr();
}
