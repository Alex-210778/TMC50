package by.tms.homework3.solutions;

import java.util.Scanner;

public class Task1 {

    public static String getStringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любую строку для проверки: ");
        return scanner.nextLine();
    }

    public static void isPalindrom(String str) {
        if (str != null) {
            str = str.replaceAll("[!?.,:;\\s]", "");
            if (str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) {
                System.out.println("Введённая строка является палиндромом");
            } else {
                System.out.println("Введённая строка не является палиндромом");
            }
        }
    }
}
