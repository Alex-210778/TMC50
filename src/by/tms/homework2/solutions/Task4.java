package by.tms.homework2.solutions;

public class Task4 {

    public static int[] linearize(int[][] twoDimensionalArray) {

        int[] oneDimensionalArray = new int[twoDimensionalArray.length * twoDimensionalArray[0].length];
        int index = 0;

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[0].length; j++) {
                oneDimensionalArray[index] = twoDimensionalArray[i][j];
                index++;
            }
        }
        return oneDimensionalArray;
    }
}
