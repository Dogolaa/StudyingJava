package org.example;


import entities.Emplyoee;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("How many employees will be registered? ");
        int numEmployees = sc.nextInt();

        List<Emplyoee> list = new ArrayList<>();



        for( int i = 0; i < numEmployees; i++){
            System.out.println("Emplyoee #" + (i + 1));
            System.out.println("Id:");
            int id = sc.nextInt();
            System.out.println("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("Salary:");
            double salary = sc.nextDouble();
            Emplyoee emplyoee = new Emplyoee(id, name, salary);

            list.add(emplyoee);
        }

        sc.close();
    }
}