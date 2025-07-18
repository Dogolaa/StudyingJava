package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        printList(myObjs);

        copy(myDoubles, myObjs);
        printList(myObjs);
    }

    /**
     * Copia elementos de uma lista de origem (source) para uma lista de destino (destiny).
     * A lista de origem pode ser de qualquer tipo que seja um subtipo de Number (Integer, Double, etc).
     * A lista de destino pode ser de qualquer tipo que seja um supertipo de Number (Number, Object).
     */
    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    /**
     * Imprime os elementos de qualquer lista.
     */
    public static void printList(List<?> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
