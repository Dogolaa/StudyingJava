package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal:");
        for (int i = 0; i < n; i ++){
            System.out.print(mat[i][i] + " ");
        }

        int negativeNumbers = 0;

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(mat[i][j] < 0){
                    negativeNumbers++;
                };
            }
        }

        System.out.println();
        System.out.println("Negative Numbers: " + negativeNumbers );

        sc.close();
    }
}