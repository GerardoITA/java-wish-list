package org.lessons.java.christmas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File filePath = new File("src/org/lessons/java/christmas/lista.txt");

        if (filePath.exists()) {
            Scanner reader = new Scanner(filePath);
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }




        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        List<String> listaRegali = new ArrayList<>();

        while (!stop) {
            System.out.println("Che regalo vuoi aggiungere? ( 'stop' per fermare )");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase( "stop")) {
                stop = true;
            } else {
                listaRegali.add(choice);
            }
        }
        scanner.close();

        for (int i = 0; i < listaRegali.size(); i++) {
            System.out.println(listaRegali.get(i));
        }

        if (!filePath.exists()) {
            filePath.createNewFile();
        }

        FileWriter fileWr = new FileWriter(filePath);
        fileWr.write(listaRegali.toString());
        fileWr.close();


    }
}
