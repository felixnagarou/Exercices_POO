package org.example.base;

public class Main {
    public static void main(String[] args) {

        Voiture voiture1 = new Voiture();

        voiture1.demarrer();

        System.out.println(voiture1.carburant);

        voiture1.remplirReservoir(15);

        voiture1.carburant += 1;

        System.out.println(voiture1.carburant);

        System.out.println(voiture1.couleur);

        Voiture Voiture2 = new Voiture("Rouge", 0, 1500);
    }
}
