package org.example.exercicePOO21;

public class Chaise {

        private int nbFeet;
        private String material;
        private String color;

        private float price;

        //setters
        public void setNbFeet(int nbFeet) {
            this.nbFeet = nbFeet;
        }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
        public String toString() {
            return
                    "Je suis une chaise avec " + nbFeet + " pied(s) en " +
                    material + " de couleur " +
                     color + " à un prix de " +
                     price +
                    ".";
        }
}
