package org.example.Hotel;

public class Chambre {
    private int roomNumber;
    private boolean isAvailable = true;
    private int numberOfBeds;
    private double roomPrice;


    public Chambre(int roomNumber, boolean isAvailable, int numberOfBeds, double roomPrice) {
        this.roomNumber = roomNumber;
        this.isAvailable = isAvailable;
        this.numberOfBeds = numberOfBeds;
        this.roomPrice = roomPrice;
    }
}
