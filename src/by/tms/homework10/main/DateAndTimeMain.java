package by.tms.homework10.main;

import by.tms.homework10.solutions.DateAndTimeUtils;
import java.time.LocalDate;

public class DateAndTimeMain {

    public static void main(String[] args) {
        LocalDate localDateNow = LocalDate.now();
        LocalDate myDate = LocalDate.of(2020, 06, 25);
        System.out.println("Количество дней между сегодняшней датой и " + myDate + " - "
                + DateAndTimeUtils.getFindTheNumberOfDaysBetweenTwoDates(myDate, localDateNow));
        System.out.println("Количество секунд между сегодняшней датой и " + myDate + " - "
                + DateAndTimeUtils.getFindTheNumberOfSecondsBetweenTwoDates(myDate, localDateNow));
    }
}
