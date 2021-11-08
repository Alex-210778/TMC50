package by.tms.homework6;

import by.tms.homework6.myexceptions.MyException;
import by.tms.homework6.utils.ExceptionUtils;
import java.io.FileNotFoundException;

public class ExceptionMain {

    public static void main(String[] args) {
        String string = "Hello World!";
        String string1 = null;

        try {
            System.out.println("Количество символов в строке = " + ExceptionUtils.getLengthString(string));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Количество символов в строке = " + ExceptionUtils.getLengthString(string1));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        int[] array = {5, 6, 7, 8};
        System.out.print("Элемент массива с индексом 1 = ");
        ExceptionUtils.elementOfArray(array, 1);
        System.out.print("Элемент массива с индексом 20 = ");
        ExceptionUtils.elementOfArray(array, 20);

        try {
            System.out.println("Факториал числа 5 = " + ExceptionUtils.getFactorial(5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Факториал числа -5 = " + ExceptionUtils.getFactorial(-5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            try {
                System.out.println("Результат деления числа 10 на 3 = " + ExceptionUtils.getDivisionResult(10, 3));
            } catch (ArithmeticException e) {
                throw new MyException();
            }
        } catch (MyException e) {

            e.getCause();
        }

        try {
            try {
                System.out.println("Результат деления числа 6 на 0 = " + ExceptionUtils.getDivisionResult(6, 0));
            } catch (ArithmeticException e) {
                throw new MyException();
            }
        } catch (MyException e) {
            e.getCause();
        }

        try {
            double random = Math.random();
            System.out.println("random = " + random);
            ExceptionUtils.getRandomException(random);
        } catch (ArithmeticException e) {
            System.out.println("This is ArithmeticException");
        } catch (NullPointerException e) {
            System.out.println("This is NullPointerException");
        } catch (NumberFormatException ex) {
            System.out.println("This is NumberFormatException");
        }

        double random1 = Math.random();
        try {
            ExceptionUtils.throwExceptionFiftyPercent(random1);
            System.out.println("New random1 = " + 2 * random1);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("random1 = " + random1);
        }
    }
}
