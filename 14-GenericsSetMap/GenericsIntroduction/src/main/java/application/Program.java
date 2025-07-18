package application;

import services.PrintService;

public class Program {
    public static void main(String[] args) {

        PrintService<Integer> ps = new PrintService<>();

        ps.addValue(1);

    }
}
