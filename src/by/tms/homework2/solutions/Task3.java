package by.tms.homework2.solutions;

public class Task3 {

   public static int[] getArrayResult(int[] array1, int[] array2) {
       int[] arrayResult = new int[array1.length + array2.length];

       if (array1.length >= array2.length) {
           int position = array2.length;
           for (int i = 0; i < array2.length; i ++) {
               arrayResult[i*2] = array1[i];
           }
           for (int i = 1; i <= array2.length; i++) {
               arrayResult[i*2-1] = array2[i-1];
           }
           for (int i = array2.length * 2; i < arrayResult.length; i++) {
               arrayResult[i] = array1[position];
               position++;
           }
       } else {
           int position = array1.length;
           for (int i = 0; i < array1.length; i ++) {
               arrayResult[i*2] = array1[i];
           }
           for (int i = 1; i <= array1.length; i++) {
               arrayResult[i*2-1] = array2[i-1];
           }
           for (int i = array1.length * 2; i < arrayResult.length; i++) {
               arrayResult[i] = array2[position];
               position++;
           }
       }
       return arrayResult;
   }
}
