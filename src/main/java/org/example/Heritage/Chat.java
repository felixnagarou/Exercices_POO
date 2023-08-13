package org.example.Heritage;

public class Chat extends Animal {
    private int vies;

    public Chat(String nom, int age, String couleur){
        super(nom, age, couleur);
        this.vies = 7;
    }

    @Override
    public void crier(){
        System.out.println("MEOOOOOOOOOOOOOW");
    }

    public void manger(){
        super.manger();
        System.out.println("Je mange de délicieuses croquettes");
    }

    @Override
    public String toString(){
        return "Nom chat : " + getNom() + "age : " + getAge();
    }


}
