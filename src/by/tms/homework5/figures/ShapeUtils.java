package by.tms.homework5.figures;

public final class ShapeUtils {
    private int numberOfFaces;       //количество сторон многоугольника
    private double angleAlfa;        //Угол между сторонами a и b

    private ShapeUtils(int numberOfFaces, double angleAlfa) {
        this.numberOfFaces = numberOfFaces;
        this.angleAlfa = angleAlfa;
    }

    public static boolean isRectangle (int numberOfFaces, double angleAlfa) {
        if (numberOfFaces == 4 && angleAlfa == 90) {
            System.out.println("Данная фигура является прямоугольником");
            return true;
        } else {
            System.out.println("Данная фигура не является прямоугольником");
            return false;
        }
    }

    public static boolean isTriangle (int numberOfFaces) {
        if (numberOfFaces == 3) {
            System.out.println("Данная фигура является треугольником");
            return true;
        } else {
            System.out.println("Данная фигура не является треугольником");
            return false;
        }
    }
}
