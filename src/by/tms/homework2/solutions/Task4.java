package by.tms.homework2.solutions;

public class Task4 {

    public static int[] linearize(int[][] twoDimensionalArray) {
        int oneDimensionalArrayLength = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            oneDimensionalArrayLength += twoDimensionalArray[i].length;
        }
        int[] oneDimensionalArray = new int[oneDimensionalArrayLength];
        int index = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                oneDimensionalArray[index] = twoDimensionalArray[i][j];
                index++;
            }
        }
        return oneDimensionalArray;
    }
}
