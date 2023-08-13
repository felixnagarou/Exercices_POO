package org.example.pooP27;

public class Arbre extends Plante {
    private float circumference;

    public Arbre(String name, float height, String color, float circumference ){
        super(name, height, color);
        this. circumference = circumference;
    }

    @Override
    public String toString(){
        return super.toString() + "\n"  + "La circonférence de l'arbre est de : " + circumference + " m";
    }
}
