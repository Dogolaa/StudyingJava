package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // Instanciando data local de agora
        LocalDate d01 = LocalDate.now();
        // Instanciando data e hora local de agora
        LocalDateTime d02 = LocalDateTime.now();
        // Instanciando data e hora global de agora
        Instant d03 = Instant.now();

        System.out.println("-----------------------");
        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println("-----------------------");

        // Transformando um texto ISO 8601 para uma data e hora

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        // Com timezone do br
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);

        System.out.println("-----------------------");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDate d09 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d10 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println("-----------------------");


    }
}