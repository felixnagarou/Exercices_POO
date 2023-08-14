package org.example.Hotel;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hotel {
    Scanner scanner = new Scanner(System.in);
    private HashMap<String, Client> clientsList;
    private HashMap<String ,Reservation> reservationList;
    private HashMap< Integer, Chambre> roomList;

    public Hotel(HashMap<String, Client> clientsList, HashMap<String, Reservation> reservationList, HashMap<Integer, Chambre> roomList) {
        this.clientsList = clientsList;
        this.reservationList = reservationList;
        this.roomList = roomList;
    }

    public HashMap<String, Client> getClientsList() {
        return clientsList;
    }

    public void setClientsList(HashMap<String, Client> clientsList) {
        this.clientsList = clientsList;
    }

    public HashMap<String, Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(HashMap<String, Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public String makeReservation(){
        clientConnection(scanner.next());
        roomSearch(scanner.nextInt(), scanner.nextDouble());
        System.out.println("Numéro de la chambre à réserver ?");
        int choice = scanner.nextInt();
        if (roomList.containsKey(choice) && roomList.get(choice).isAvailable()){
            reservationList.put(clientsList.get().getIdClient(), choice); //todo récupérer l'id client
        }
        return "Fin de la réservation";
    }


    public String clientConnection(String identifiant){ //todo Rajouter de quoi intégrer un mot de passe client ici.
        //System.out.println("Entrez votre identifiant Client");
        if (clientsList.containsKey(identifiant)) {
            return " Bienvenue " + clientsList.get(identifiant).getFirstName() + " , vous êtes connecté.";
        }
        else System.out.println("Compte introuvable. Vérifiez que la saisie est correcte ou créez un compte.");


    }

    public String roomSearch(int beds, double budget){
        //System.out.println("Pour combien de personnes ?");
        //int beds = scanner.nextInt();
        //System.out.println("Votre budget ?");
        //double budget = scanner.nextDouble();

        for (int i = 0; i < this.roomList.size(); i++){

            if(this.roomList.get(i).isAvailable()
                    && roomList.get(i).getNumberOfBeds() >= beds
                    && roomList.get(i).getRoomPrice() < budget){
                System.out.println(roomList.get(i) + " POUR VOUS");
            } else if (!roomList.get(i).isAvailable()
                    && roomList.get(i).getRoomPrice() < budget
                    && roomList.get(i).getNumberOfBeds() >= beds ) {
                System.out.println(roomList.get(i) + " DISPONIBLE ULTERIEUREMENT");
            }
        }
        return "Fin des résultats.";
    }


}
