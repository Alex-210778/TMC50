package by.tms.homework2.mains;

import by.tms.homework2.solutions.ArrayDefinision;
import by.tms.homework2.solutions.Task3;

import java.util.Arrays;

public class MainTask3 {

    public static void main(String[] args) {

        int[] array1 = ArrayDefinision.getArray();
        int[] array2 = ArrayDefinision.getArray();
        System.out.println("Задан массив 1: " + Arrays.toString(array1));
        System.out.println("Задан массив 2: " + Arrays.toString(array2));
        int[] arrayResult = Task3.getArrayResult(array1, array2);
        System.out.println("Массив, представляющий собой сумму двух массивов: " + Arrays.toString(arrayResult));
   }
}
