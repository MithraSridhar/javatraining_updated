package day9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class LocalDateTime_Demo {
    public static void main(String[] args) {

        //LocalDate
        LocalDate date = LocalDate.now();
        System.out.println("Current date "+date); //yyyy-dd-mm default format

        //before days
        LocalDate beforeDays = date.minusDays(2);
        System.out.println("Before 2 days "+beforeDays);

        //after days
        LocalDate afterDays = date.plusDays(2);
        System.out.println("After 2 days "+afterDays);

        //leap year
        System.out.println(afterDays.isLeapYear());

        //specific day - Temporal
        LocalDate temporalDay = date.plus(2, ChronoUnit.MONTHS);
        System.out.println("Temporal Months "+temporalDay);

        //LocalTime
        LocalTime time = LocalTime.now();
        System.out.println("Current Time "+time); //24 hours format by default

        System.out.println("Time at date "+time.atDate(date));

        //LocalDateTime
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date time "+dateTime);
    }
}
