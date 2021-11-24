package by.tms.homework10.solutions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public final class DateAndTimeUtils {

    private DateAndTimeUtils() {
        throw new UnsupportedOperationException();
    }

    public static long getFindTheNumberOfDaysBetweenTwoDates(LocalDate localDate, LocalDate localDateNow) {
        return ChronoUnit.DAYS.between(localDate, localDateNow);
    }
    
    public static long getFindTheNumberOfSecondsBetweenTwoDates(LocalDate localDate, LocalDate localDateNow) {
        LocalDateTime localDateTimeLokalDate = LocalDateTime.of(localDate, LocalTime.of(0, 0, 0));
        LocalDateTime localDateTimeNow = LocalDateTime.of(localDateNow, LocalTime.of(0, 0, 0));
        return ChronoUnit.SECONDS.between(localDateTimeLokalDate, localDateTimeNow);
    }
}
