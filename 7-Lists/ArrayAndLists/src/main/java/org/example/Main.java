package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int count = sc.nextInt();

        int[] vector = new int[count];

        for(int i = 0; i < count; i++){
            vector[i] = i;
            System.out.println(Arrays.toString(vector));
        }

        sc.close();
    }
}