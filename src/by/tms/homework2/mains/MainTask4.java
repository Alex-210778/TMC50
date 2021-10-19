package by.tms.homework2.mains;

import by.tms.homework2.solutions.ArrayDefinision;
import by.tms.homework2.solutions.Task4;

import java.util.Arrays;

public class MainTask4 {

    public static void main(String[] args) {
        int[][] twoDimensionalArray = ArrayDefinision.getTwoDimensionalArray();
        System.out.println("Полученный одномерный массив:");
        System.out.println(Arrays.toString(Task4.linearize(twoDimensionalArray)));
    }
}
