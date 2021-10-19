package by.tms.homework3.solutions;

import java.util.Scanner;

public class Task2 {

    public static String getRomeNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число римскими цифрами: ");
        return scanner.nextLine().toUpperCase();
    }

    public static int fromRomeNumberInArabic(String number) {
        int[] array = new int[number.length()];
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            switch (number.charAt(i)) {
                case 'M':
                    array[i] = 1000;
                    break;
                case 'D':
                    array[i] = 500;
                    break;
                case 'C':
                    array[i] = 100;
                    break;
                case 'L':
                    array[i] = 50;
                    break;
                case 'X':
                    array[i] = 10;
                    break;
                case 'V':
                    array[i] = 5;
                    break;
                case 'I':
                    array[i] = 1;
                    break;
                default:
                    return -1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                result += array[i];
            } else if (array[i] < array[i + 1]) {
                result = result + (array[i + 1] - array[i]);
                i += 1;
            } else {
                result += array[i];
            }
        }
        return result;
    }
}
