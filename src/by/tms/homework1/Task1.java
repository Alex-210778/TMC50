package by.tms.homework1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bведите любое целое число: ");
        int number = scanner.nextInt();
        int numberForConsole = number;
        int result = 0;

        if (number < 0) {
            number = -1 * number;
        }

        while (number > 0) {
            int count = number % 10;
            result += count;
            number = number  / 10;
        }
        System.out.println("Сумма всех цифр числа " + numberForConsole + " = " + result);
    }
}
