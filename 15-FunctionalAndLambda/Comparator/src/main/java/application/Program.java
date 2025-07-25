package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // forma 1
        list.sort(new MyComparator());

        for(Product p : list){
            System.out.println(p);
        }


        //forma 2

        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };

        list.sort(comp);

        System.out.println("----------Maneira 2 ----------------");
        for(Product p : list){
            System.out.println(p);
        }



        //forma 3

        Comparator<Product> comp2 = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        list.sort(comp2);

        System.out.println("----------Maneira 3 ----------------");
        for(Product p : list){
            System.out.println(p);
        }


        //forma 4

        Comparator<Product> comp3 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        list.sort(comp3);

        System.out.println("----------Maneira 4 ----------------");
        for(Product p : list){
            System.out.println(p);
        }

        //forma 5

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        System.out.println("----------Maneira 5 ----------------");
        for(Product p : list){
            System.out.println(p);
        }





    }
}
