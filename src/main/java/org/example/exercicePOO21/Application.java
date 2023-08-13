package org.example.exercicePOO21;

public class Application {
    public static void main(String[] args) {
        //Chaise1

        Chaise chaise1 = new Chaise(); //appel avec le constructeur par défaut
        chaise1.setNbFeet(4);
        chaise1.setColor("bleu");
        chaise1.setMaterial("chaine");
        chaise1.setPrice(14.4F);
        System.out.println(chaise1.toString());

        //Chaise2

        Chaise chaise2 = new Chaise(); //appel avec le constructeur par défaut
        chaise2.setNbFeet(3);
        chaise2.setColor("bambou");
        chaise2.setMaterial("gris");
        chaise2.setPrice(130.99F);
        System.out.println(chaise2.toString());

        //Chaise3

        Chaise chaise3 = new Chaise(); //appel avec le constructeur par défaut
        chaise3.setNbFeet(1);
        chaise3.setColor("métal");
        chaise3.setMaterial("orange");
        chaise3.setPrice(75.25F);
        System.out.println(chaise3.toString());






    }
}
