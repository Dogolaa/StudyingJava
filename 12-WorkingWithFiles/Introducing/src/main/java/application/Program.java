package application;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        // ---------------------- LEITURA ----------------------

        // ----------------- OPÇÃO 1 -----------------------

        File file = new File("/home/lucas/Documentos/test.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

        // ----------------- OPÇÃO 2 -----------------------

        String path = "/home/lucas/Documentos/test.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try {

            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        // ----------------- OPÇÃO 3 -----------------------


        try (BufferedReader bR = new BufferedReader(new FileReader((path)))) {

            String line = bR.readLine();

            while (line != null) {
                System.out.println(line);
                line = bR.readLine();
            }

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // ---------------------- ESCRITA ----------------------

        String[] lines = new String[]{"Good Morning", "Good Afternoon", "Good Night"};

        String pathWrite = "/home/lucas/Documentos/out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathWrite))) { // ,true
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // ---------------------- Manipulando pastas ----------------------

        Scanner sc1 = new Scanner(System.in);

        String strPath = sc1.nextLine();

        File pathUser = new File(strPath);

        File[] folders = pathUser.listFiles(File::isDirectory);

        System.out.println("Folders: ");

        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = pathUser.listFiles(File::isFile);

        System.out.println("Files: ");

        for (File file3 : files) {
            System.out.println(file3);
        }

        boolean success = new File(pathUser + "/subdir").mkdir();


        System.out.println("getName: " + pathUser.getName());
        System.out.println("getParent: " + pathUser.getParent());
        System.out.println("getPath: " + pathUser.getPath());

        sc1.close();

    }
}
