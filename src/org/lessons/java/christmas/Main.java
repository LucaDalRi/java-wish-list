package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> listaRegali;

        listaRegali = new ArrayList<>();

        System.out.println("Inserisci il regalo da memorizzare nella lista, scrivi stop per terminare il programma");

        do {
            Scanner s1 = new Scanner(System.in);

            String regalo = s1.nextLine();

            if (regalo.equals("stop") || regalo.isEmpty() || regalo.isBlank()){
                break;
            }

            listaRegali.add(regalo);

        } while (true);

        System.out.println("Lista completa:");

        System.out.println(listaRegali);
    }
}
