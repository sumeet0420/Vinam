package io.vinam.webpages;

import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Trial {

    public static void main(String[] args) {
        String currentMonthYear = "Jun 2022";
        var dateToCheck = LocalDate.from(DateTimeFormatter.ofPattern("MMM yyyy dd").parse(currentMonthYear+" 01"));
        System.out.println(ChronoUnit.MONTHS.between( LocalDate.now().withDayOfMonth(1), dateToCheck));
        System.out.println(Period.between( LocalDate.now().withDayOfMonth(1),dateToCheck));
    }
}
