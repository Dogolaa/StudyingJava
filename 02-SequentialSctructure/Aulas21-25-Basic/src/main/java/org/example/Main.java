package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int idade = 23;
        double altura = 1.86;
        char sexo = 'M';
        String nome = "Lucas Dogo";

        // Saida de dados
        System.out.println("Olá mundo!");
        System.out.println(idade);
        System.out.printf("%.2f%n", altura);
        System.out.println("idade= " + idade + " altura= " + altura);
        System.out.printf("ALTURA = %.2f METROS %n", altura);
        System.out.printf("%s tem %.2f metros de altura, %d anos de idade e é do sexo %s %n", nome, altura, idade, sexo);

        // Processamento de dados

        int val1 = 10;
        int val2 = 8;
        // necessário colocar o (double), pois estamos dividindo dois int
        double val3 = (double) val1 / val2;

        System.out.println(val3);

        // Entrada de Dados

        Scanner sc = new Scanner(System.in);

        // Lendo String sem espaço
        String name;
        name = sc.next();
        System.out.println("Voce digitou= " + name);

        //Lendo Int
        int x;
        x = sc.nextInt();
        System.out.println("Voce digitou= " + x);

        //Lendo ponto flutuante
        double y;
        y = sc.nextDouble();
        System.out.println(y);

        //Lendo char
        char z;
        z = sc.next().charAt(0);
        System.out.println(z);

        //Ler texto até quebra de linha
        sc.nextLine(); // Eliminar quebra de linha pendente vinda do next acima com um nextLine extra
        String texto;
        texto = sc.nextLine();
        System.out.println(texto);
        sc.close();

        // Funções Matemáticas

        double op = 48;

        op = Math.sqrt(op);
        System.out.println("Raiz quadrade de op=" + op);

        op = Math.pow(op, 2);
        System.out.println("op elevado ao quadrado=" + op);

        op = Math.abs(op);
        System.out.println("Valor absoluto de op=" + op);
    }
}