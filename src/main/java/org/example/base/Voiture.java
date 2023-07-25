package org.example.base;

public class Voiture {
    public String couleur;
    public int carburant;

    public int puisssance;

    private String marque;

    protected int nombrePortes;

    public Voiture() {
        System.out.println("Je suis dans le constructeur XDDDD");
    }

    //polymorphisme : définition de plusieurs méthodes de même nom mais avec des signatures différentes i.e
    //type de retour, nombre de paramètres

    public Voiture(String couleur) {
        this(); //this(<paramètres>) appelle le constructeur avec la signature similaire
        this.couleur = couleur;

        System.out.println("Je suis dans le constructeur aves un paramètre");
    }

    public Voiture(String couleur,int carburant, int puisssance) {
        //this.couleur = couleur;
        this(couleur);
        this.carburant = carburant;
        this.puisssance = puisssance;
    }
}
