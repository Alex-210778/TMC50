package by.tms.homework3.mains;

import by.tms.homework3.solutions.Task1;

public class MainTask1 {

    public static void main(String[] args) {
        String str = Task1.getStringFromConsole();
        if (Task1.isPalindrom(str)) {
            System.out.println("Введённая строка является палиндромом");
        } else {
            System.out.println("Введённая строка не является палиндромом");
        }
    }
}
