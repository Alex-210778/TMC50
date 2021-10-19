package by.tms.homework2.mains;

import by.tms.homework2.solutions.ArrayDefinision;
import by.tms.homework2.solutions.Task2;

import java.util.Arrays;

public class MainTask2 {

    public static void main(String[] args) {
        int[] array = ArrayDefinision.getArray();
        System.out.println("Задан массив: " + Arrays.toString(array));
        System.out.println("Массив, в котором все повторяющие элементы удалены: " + Arrays.toString(Task2.getArrayRemovesIdenticalElements(array)));
    }
}
