package org.example.pooP27;

public class Main {
    public static void main(String[] args) {
        Plante plante1 = new Plante("orchidee", 0.15f, "blanche");
        Arbre acacia = new Arbre("acacia", 6, "brun", 1);
        plante1.displayInfo();
        acacia.displayInfo();
    }
}
