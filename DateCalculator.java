package com.artem.data;


import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;


public class DateCalculator {
    public static long calculateNumberOfDaysBetweenTwoDate;

    public static long calculateNumberOfDaysBetweenTwoDate(Temporal firstDate, Temporal secondDate) {
        long days = ChronoUnit.DAYS.between(firstDate, secondDate);
        return days;
    }
}


