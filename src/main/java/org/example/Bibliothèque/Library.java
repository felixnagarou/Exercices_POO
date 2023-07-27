package org.example.Bibliothèque;


import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Livre> library1 = new ArrayList<Livre>();

        Livre livre1 = new  Livre("Le seigneur des anneaux", "Tolkien", 300, false);
        Livre livre2 = new  Livre("La Comédie Humaine", "Balzac", 1000, false);
        Livre livre3 = new  Livre("Simulacre et simulation", "Baudrillard", 200, false);
        Livre livre4 = new  Livre("Vie d'Alexandre", "Plutarque", 300, false);

        library1.add(livre1);
        library1.add(livre2);
        library1.add(livre3);
        library1.add(livre4);

        for (Livre livre : library1) {
            livre.displayBookInfo();
        }

        //emprunt du premier livre de la bibliothèque
        library1.get(0).borrowBook();

        for (Livre livre : library1) {
            livre.displayBookInfo();
        }

        //retour du livre emprunté
        library1.get(0).returnBook();
        for (Livre livre : library1) {
            livre.displayBookInfo();
        }




    }
}
