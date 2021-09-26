package by.tms.homework1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дней: ");
        int days = scanner.nextInt();
        int count = 0;
        int maxRainfall = 0;

        if (days < 1) {
            System.out.println("Вы ввели не верное количество дней");
        } else {
            for (int i = 1; i <= days; i++) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Введите количество осадков за день №" + i);
                int rainfallInDay = scanner1.nextInt();
                count += rainfallInDay;

                if (maxRainfall < rainfallInDay) {
                    maxRainfall = rainfallInDay;
                }
            }
        }
        System.out.println("Сумма осадков за " + days + " дней = " + count);
        System.out.println("Среднее количество осадков в день за " + days + " дней (дня) = " + (double)count / days);
        System.out.println("Максимальное количество дневных осадков за " + days + " дней (дня) = " + maxRainfall);
    }
}
