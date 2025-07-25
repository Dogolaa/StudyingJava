package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //Metodo 1
        list.removeIf( p -> p.getPrice() >= 100);

        //Metodo 2
        list.removeIf(new ProductPredicate());

        //Metodo 3
        list.removeIf(Product::staticProductPredicate);

        //Metodo 4
        list.removeIf(Product::nonStaticProductPredicate);

        //Metodo 5
        Predicate<Product> pred = p -> p.getPrice() >= 100;
        list.removeIf(pred);

        for(Product p : list){
            System.out.println(p);
        }

    }
}
