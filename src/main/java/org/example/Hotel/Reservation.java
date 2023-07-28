package org.example.Hotel;

import java.util.ArrayList;
import java.util.HashMap;

public class Reservation {
    //private HashMap<Integer, String> idReservationList = new HashMap<>();
    private int idReservation;
    private boolean reservationStatus = false;
    private ArrayList<Chambre> roomList = new ArrayList<>();
    private int client;

    public Reservation(int idReservation, boolean reservationStatus, ArrayList<Chambre> roomList, int client) {
        this.idReservation = idReservation;
        this.reservationStatus = reservationStatus;
        this.roomList = roomList;
        this.client = client;
    }
}
