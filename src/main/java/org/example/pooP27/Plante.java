package org.example.pooP27;

public class Plante {
    private String name;
    private float height;
    private String color;

    public Plante(String name, float height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Plante{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

    public  void displayInfo(){
        System.out.println(toString());
    }
}
