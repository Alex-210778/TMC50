package by.tms.homework2.solutions;

public class Task2 {

    public static int[] getArrayRemovesIdenticalElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
        return array;
    }
}
