package by.tms.homework2.mains;

import by.tms.homework2.solutions.ArrayDefinision;
import by.tms.homework2.solutions.Task1;

import java.util.Arrays;

public class MainTask1 {

    public static void main(String[] args) {

        int[] array = ArrayDefinision.getArray();
        System.out.println("Задан массив: " + Arrays.toString(array));
        System.out.println("Массив, в котором элементы циклически сдвинуты вправо на одну позицию: " + Arrays.toString(Task1.getArrayWithRightShift(array)));
   }
}
