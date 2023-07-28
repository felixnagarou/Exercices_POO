package org.example.Hotel;

import java.util.HashMap;
import java.util.TreeMap;

public class Client {
    //private HashMap<Integer, String> idClientList = new HashMap<>();
    private int idClient;
    private String name;
    private String firstName;
    private String phoneNumber;

    public Client(int idClient, String name, String firstName, String phoneNumber) {
        this.idClient = idClient;
        this.name = name;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;

    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}
