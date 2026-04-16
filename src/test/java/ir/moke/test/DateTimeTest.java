package ir.moke.test;

import ir.moke.utils.date.CalendarType;
import ir.moke.utils.date.DatePattern;
import ir.moke.utils.date.DateTimeUtils;

import java.time.ZonedDateTime;
import java.util.Locale;

public class DateTimeTest {
    static void main() {
        String currentDateTime = DateTimeUtils.toString(ZonedDateTime.now(), Locale.ENGLISH, CalendarType.PERSIAN, DatePattern.DATE_TIME_PATTERN);
        System.out.println(currentDateTime);
    }
}
