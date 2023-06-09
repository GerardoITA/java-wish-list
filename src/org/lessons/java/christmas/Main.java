package org.lessons.java.christmas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        int n = 0;
        Map<Integer, String> listaRegali = new HashMap<>();

        while (!stop) {
            System.out.println("Che regalo vuoi aggiungere? ( 'stop' per fermare )");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase( "stop")) {
                stop = true;
            } else {
                listaRegali.put(n, choice);
                n++;
                System.out.println(listaRegali.size());
            }
        }


    }
}
