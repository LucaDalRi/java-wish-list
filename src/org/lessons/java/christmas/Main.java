package org.lessons.java.christmas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> listaRegali;

        listaRegali = new ArrayList<>();

        System.out.println("Inserisci il regalo da memorizzare nella lista, scrivi stop per terminare il programma, scrivi lista per visualizzare la lista creata precedentemente");

        Scanner s1 = new Scanner(System.in);

        String choice = s1.nextLine();

        if (!choice.equals("lista")) {

            do {

                String regalo = s1.nextLine();

                if (regalo.equals("stop") || regalo.isEmpty() || regalo.isBlank()) {
                    break;
                }

                listaRegali.add(regalo);

            } while (true);

            try {

                File lista = new File("src/org/lessons/java/christmas/lista.txt");
                
                FileWriter writer = new FileWriter("src/org/lessons/java/christmas/lista.txt");

                writer.write(listaRegali.toString());

                writer.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Lista completa:");

            System.out.println(listaRegali);

        } else {

            File lista = new File("src/org/lessons/java/christmas/lista.txt");

            try {
                Scanner reader = new Scanner(lista);
                while (reader.hasNextLine()) {
                    String data = reader.nextLine();
                    System.out.println("Questa è la tua lista precedente");
                    System.out.println(data);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
