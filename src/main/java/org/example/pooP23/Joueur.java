package org.example.pooP23;

public class Joueur {
    private String name;
    private int level;
    private int experiencePoints;

    //default constructor
    public Joueur(){
    }
    //constructor
    public Joueur(String name, int level, int experiencePoints) {
        this.name = name;
        this.level = level;
        this.experiencePoints = experiencePoints;
    }

    //getters
    public String getName(){
        return  name;
    }

    public int getLevel(){
        return level;
    }
    public int getExperiencePoints(){
        return experiencePoints;
    }

    //setters
    public void setName(){
        this.name = name;
    }

    public void setLevel(){
        this.level = level;

    }
    public void setExperiencePoints(){
        this.experiencePoints = experiencePoints;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", experiencePoints=" + experiencePoints +
                '}';
    }

    public void displayStat(){
        System.out.println(this.toString());

    }

    public void doQuest(){
        this.experiencePoints += 10;

    }
    public void levelUp(){
            this.level++;
        this.experiencePoints = 0;
    }




}
