package by.tms.homework2.solutions;

import java.util.Scanner;

public class ArrayDefinision {

   public static int[] getArray() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите длину массива: ");
       int arrayLength = scanner.nextInt();
       int[] array = new int[arrayLength];

       for (int i = 0; i < array.length; i++) {
           Scanner scanner1 = new Scanner(System.in);
           System.out.println("Введите " + i + " элемент массива: ");
           array[i] = scanner1.nextInt();
       }
       return array;
   }

   public static int[][] getTwoDimensionalArray() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите количество строк двумерного массива: ");
       int rows = scanner.nextInt();

       Scanner scanner1 = new Scanner(System.in);
       System.out.println("Введите количество столбцов двумерного массива: ");
       int columns = scanner1.nextInt();

       int[][] twoDimensionalArray = new int[rows][columns];

       System.out.println("Исходный двумерный массив: ");


       for (int i = 0; i < twoDimensionalArray.length; i++) {
           for (int j = 0; j < twoDimensionalArray[0].length; j++) {
               twoDimensionalArray[i][j] = (int)(Math.random() * 100);
               System.out.print(twoDimensionalArray[i][j] + " ");
           }
           System.out.println();
       }
       return twoDimensionalArray;
   }
}
