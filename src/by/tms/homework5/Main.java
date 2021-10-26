package by.tms.homework5;

import by.tms.homework5.figures.Point;
import by.tms.homework5.figures.circles.Circle;
import by.tms.homework5.figures.circles.Ellipse;
import by.tms.homework5.figures.polyhedra.Polihendron;
import by.tms.homework5.figures.polyhedra.Triangle;
import by.tms.homework5.figures.polyhedra.regularpolygons.*;

public class Main {

    public static void main(String[] args) {

        Point point = new Point(5, 5);
        Point pointB = new Point(20, 10);

        TriangleEquilateral polygonRegular = new TriangleEquilateral(point, 20);
        System.out.println(polygonRegular.toString());
        System.out.println("Радиус  описанной окружности - " + polygonRegular.getRadiusCircumscribedCircle());
        System.out.println("Радиус вписанной окружности - " + polygonRegular.getRadiusInscribedCircle());
        System.out.println("Длина стороны - " + polygonRegular.getLenghtOfSide());
        System.out.println("Внутренний угол - " + polygonRegular.getAngleOfPoligon());
        System.out.println("Площадь - " + polygonRegular.getArea());
        System.out.println("Периметр - " + polygonRegular.getPerimetr());
        System.out.println("Высота - " + polygonRegular.getHeight());

        Square square = new Square(point, 20);
        System.out.println(square.toString());
        System.out.println("Радиус  описанной окружности - " + square.getRadiusCircumscribedCircle());
        System.out.println("Радиус вписанной окружности - " + square.getRadiusInscribedCircle());
        System.out.println("Длина стороны - " + square.getLenghtOfSide());
        System.out.println("Внутренний угол - " + square.getAngleOfPoligon());
        System.out.println("Площадь - " + square.getArea());
        System.out.println("Периметр - " + square.getPerimetr());
        System.out.println("Диагональ - " + square.getDistance());

        PentagonRegular pentagonRegular = new PentagonRegular(point, 20);
        System.out.println(pentagonRegular.toString());
        System.out.println("Радиус  описанной окружности - " + pentagonRegular.getRadiusCircumscribedCircle());
        System.out.println("Радиус вписанной окружности - " + pentagonRegular.getRadiusInscribedCircle());
        System.out.println("Длина стороны - " + pentagonRegular.getLenghtOfSide());
        System.out.println("Внутренний угол - " + pentagonRegular.getAngleOfPoligon());
        System.out.println("Площадь - " + pentagonRegular.getArea());
        System.out.println("Периметр - " + pentagonRegular.getPerimetr());
        System.out.println("Диагональ - " + pentagonRegular.getDistance());
        System.out.println("Высота - " + pentagonRegular.getHeight());

        HexagonRegular hexagonRegular = new HexagonRegular(point, 20);
        System.out.println(hexagonRegular.toString());
        System.out.println("Радиус  описанной окружности - " + hexagonRegular.getRadiusCircumscribedCircle());
        System.out.println("Радиус вписанной окружности - " + hexagonRegular.getRadiusInscribedCircle());
        System.out.println("Длина стороны - " + hexagonRegular.getLenghtOfSide());
        System.out.println("Внутренний угол - " + hexagonRegular.getAngleOfPoligon());
        System.out.println("Площадь - " + hexagonRegular.getArea());
        System.out.println("Периметр - " + hexagonRegular.getPerimetr());
        System.out.println("Диагональ - " + hexagonRegular.getDistance());

        AnyPolygonRegular anyPolygonRegular = new AnyPolygonRegular(point, 20, 9);
        System.out.println(anyPolygonRegular.toString());
        System.out.println("Радиус  описанной окружности - " + anyPolygonRegular.getRadiusCircumscribedCircle());
        System.out.println("Радиус вписанной окружности - " + anyPolygonRegular.getRadiusInscribedCircle());
        System.out.println("Длина стороны - " + anyPolygonRegular.getLenghtOfSide());
        System.out.println("Внутренний угол - " + anyPolygonRegular.getAngleOfPoligon());
        System.out.println("Площадь - " + anyPolygonRegular.getArea());
        System.out.println("Периметр - " + anyPolygonRegular.getPerimetr());

        Circle circle = new Circle(point, 20);
        System.out.println(circle.toString());
        System.out.println("Площадь - " + circle.getArea());
        System.out.println("Длина дуги - " + circle.getLenghtOfCircle());
        System.out.println("Площадь сектора - " + circle.getAreaOfSector(90));
        System.out.println("Длина дуги сектора - " + circle.getLenghtOfSectorArc(90));

        Ellipse ellipse = new Ellipse(point, 2, 4);
        System.out.println(ellipse.toString());
        System.out.println("Площадь - " + ellipse.getArea());
        System.out.println("Периметр - " + ellipse.getPerimetrOfEllipse());


        Triangle triangle = new Triangle(point, pointB, 30, 80);


        System.out.println(triangle.toString());

        System.out.println("Длина стороны a = " + triangle.getLengthOfSideA());
        System.out.println("Длина стороны b = " + triangle.getLengthOfSideB());
        System.out.println("Длина стороны c = " + triangle.getLengthOfSideC());

        System.out.println("Периметр - " + triangle.getPerimetr());
        System.out.println("Высота - " + triangle.getHeight());

        System.out.println("Угол альфа - " + triangle.getAngleAlfa());
        System.out.println("Угол бетта - " + triangle.getAngleBetta());
        System.out.println("Угол гамма - " + triangle.getAngleGamma());


    }
}
