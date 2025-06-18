package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double renda;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        renda = sc.nextDouble();

        //If-Else
        if( renda < 2000.00){
            System.out.println("Insento%n");
        }else if (renda < 3000.00){
            double tax = (renda - 2000.00) * 0.08;
            System.out.printf("%.2f%n", tax );
        }else if (renda < 4500.00){
            double tax = ((renda - 3000.00) * 0.18) + 1000.00 * 0.08;
            System.out.printf("%.2f%n", tax );
        }else {
            double tax = ((renda - 4500.00) * 0.28) + 1500.0 * 0.18 + 1000.00 * 0.08;
            System.out.printf("%.2f%n", tax);
        }


        // Switch Case
        int dia;

        dia = sc.nextInt();

        switch(dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }

        //Expressao Ternaria

        double x;

        x = sc.nextDouble();

       double conta = (x > 1000.00 ) ?  x * 1000 : x / 1000 ;
        System.out.println(conta);
        sc.close();
    }
}