package org.example.pooP23;

public class Application {
    public static void main(String[] args) {
        Joueur gamer1 = new Joueur("Ada", 0, 0);
        Joueur gamer2 = new Joueur();


        for (int i = 0; i < 10; i++) {
            gamer1.doQuest();
            System.out.println("Le joueur " + gamer1.getName() +
                    " effectue la quête numéro " + (i + 1));
            if (gamer1.getExperiencePoints() >= 100) {

                gamer1.levelUp();
                System.out.println("Le joueur " + gamer1.getName() +
                       " passe au niveau " + gamer1.getLevel());
            }
        }
        gamer1.displayStat();
    }
}
