package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        System.out.println("--------------HashSet--------------");

        // Nao garante a ordem, porem mais rapido
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }

        System.out.println("-----remove-------");

        set.remove("Tablet");

        for (String p : set) {
            System.out.println(p);
        }


        System.out.println("--------------TreeSet--------------");

        // Ordena os dados
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("TV");
        treeSet.add("Tablet");
        treeSet.add("Notebook");

        System.out.println(treeSet.contains("Notebook"));

        for (String p : treeSet) {
            System.out.println(p);
        }

        System.out.println("-----removeIf-------");

        treeSet.removeIf(x -> x.length() >= 3);

        for (String p : treeSet) {
            System.out.println(p);
        }


        System.out.println("--------------LinkedHashSet--------------");

        // Mantem a ordem da inserção
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("TV");
        linkedHashSet.add("Tablet");
        linkedHashSet.add("Notebook");

        System.out.println(linkedHashSet.contains("Notebook"));

        for (String p : linkedHashSet) {
            System.out.println(p);
        }

        System.out.println("--------------Union/Intersection/Difference--------------");

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);
        
        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
