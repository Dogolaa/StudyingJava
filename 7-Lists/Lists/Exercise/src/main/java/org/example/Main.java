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
            System.out.println("Employee #" + (i + 1));
            System.out.println("Id:");
            int id = sc.nextInt();
            System.out.println("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary:");
            double salary = sc.nextDouble();
            Emplyoee emplyoee = new Emplyoee(id, name, salary);

            list.add(emplyoee);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int employeeId = sc.nextInt();

        Emplyoee emp = list.stream().filter(x -> x.getId() == employeeId).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("List of employees");
        for(Emplyoee x : list){
            System.out.println(x.toString());
        }

        sc.close();
    }
}