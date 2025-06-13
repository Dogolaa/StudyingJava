package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        int diesel = 0;
        int gasolina = 0;
        int alcool = 0;

        // Usado quando não se sabe previamente a quantidade de repetições que será realizada.
        while (entrada != 4) {
            if (entrada == 1) {
                alcool = alcool + 1;
            } else if (entrada == 2) {
                gasolina = gasolina + 1;
            } else if (entrada == 3) {
                diesel = diesel + 1;
            }
            entrada = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        // Usado quando se sabe previamente a quantidade de repetições, ou o intervalo de valores
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }
        
        sc.close();
    }
}