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

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public boolean isReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(boolean reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public ArrayList<Chambre> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Chambre> roomList) {
        this.roomList = roomList;
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }



}
