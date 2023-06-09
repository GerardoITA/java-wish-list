package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        for (int i = 0; i < listaRegali.size(); i++) {
            System.out.println(listaRegali.get(i));
        }


    }
}
