package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add("Brian");

        // Adiciona na posição que eu quiser
        list.add(2, "Mario");

        // Para ver o tamanho da lista
        System.out.println(list.size());


        for(String x : list) {
            System.out.println(x);
        }

        System.out.println("------------------------------");

        // Remover um elemento da lista
        list.remove("Ana");

        // Remover um elemento da por posição
        list.remove(1);

        // Remove elementos que atendam um predicado

        list.removeIf(x -> x.charAt(0) == 'M');
        for(String x : list) {
            System.out.println(x);
        }

        System.out.println("------------------------------");
        // Busca a posição de um elemento na lista
        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        System.out.println("------------------------------");
        // Filtrando para uma nova lista aqueles que comecam com a letra B da lista antiga
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').toList();

        for(String x : result) {
            System.out.println(x);
        }

        System.out.println("------------------------------");

        // Busca a primeira aparição de alguem com o nome começando com B na lista
        String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
        System.out.println(name);

    }
}