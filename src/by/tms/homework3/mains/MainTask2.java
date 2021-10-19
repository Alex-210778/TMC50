package by.tms.homework3.mains;

import by.tms.homework3.solutions.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainTask2 {

    public static void main(String[] args) {
        String numberInRome = Task2.getRomeNumberFromConsole();
        Pattern pattern = Pattern.compile("[^CDILMVX]");
        Matcher matcher = pattern.matcher(numberInRome);
        if (matcher.find()) {
            System.out.println("Вы не правильно ввели число");
        } else {
            int numberInArabic = Task2.fromRomeNumberInArabic(numberInRome);
            System.out.println("Число " + numberInRome + " = " + numberInArabic);
        }
    }
}
