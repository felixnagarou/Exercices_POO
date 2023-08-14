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

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }
}
