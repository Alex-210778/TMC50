package by.tms.homework1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bведите любое целое положительное число: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else {
            int previousNumber = 0;
            int nextNumber = 1;
            int result = 0;

            System.out.println("Все числа Фибоначчи до числа " + number + ": ");
            System.out.print(0 + ", ");
            while (result <= number) {
                System.out.print(nextNumber  + ", ");
                result = previousNumber + nextNumber;
                previousNumber = nextNumber;
                nextNumber = result;
            }
        }
    }
}
