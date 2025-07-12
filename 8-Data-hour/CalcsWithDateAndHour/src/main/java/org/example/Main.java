package org.example;


import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println(d04);
        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);

        System.out.println(d06);
        System.out.println(pastWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0,0));

        System.out.println(t1.toDays());

    }
}