package by.tms.homework2.solutions;

public class Task1 {

    public static int[] getArrayWithRightShift(int[] array) {
        int bufer = array[array.length - 1];

        for (int i = array.length - 1; i >= 1; i--) {
            array[i] = array[i - 1];
        }
        array[0] = bufer;
        return array;
    }
}
