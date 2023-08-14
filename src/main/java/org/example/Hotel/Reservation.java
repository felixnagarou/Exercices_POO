package org.example.Hotel;

import java.util.ArrayList;

public class Reservation {
    //private HashMap<Integer, String> idReservationList = new HashMap<>();
    private int idReservation;
    private boolean reservationStatus = false;
    private ArrayList<Chambre> roomList;
    private int client;

    public Reservation(int idReservation, boolean reservationStatus, ArrayList<Chambre> roomList, int client) {
        this.idReservation = idReservation;
        this.reservationStatus = reservationStatus;
        this.roomList = roomList;
        this.client = client;
    }

}
