package org.example.Hotel;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private HashMap<String, Client> clientsList;
    private HashMap<String ,Reservation> reservationList;
    private ArrayList<Chambre> roomList;

    public Hotel(HashMap<String, Client> clientsList, HashMap<String, Reservation> reservationList, ArrayList<Chambre> roomList) {
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
}
