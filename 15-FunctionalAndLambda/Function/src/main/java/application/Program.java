package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //Metodo 1
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        //Metodo 2
        List<String> names2 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        //Metodo 3
        List<String> names3 = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        //Metodo 4
        Function<Product, String> func = p -> p.getName().toUpperCase();

        List<String> names4 = list.stream().map(func).collect(Collectors.toList());

        //Metodo 5
        List<String> names5 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());


        names.forEach(System.out::println);
        names2.forEach(System.out::println);
        names3.forEach(System.out::println);
        names4.forEach(System.out::println);
        names5.forEach(System.out::println);
    }
}
