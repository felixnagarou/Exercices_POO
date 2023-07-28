package org.example.Hotel;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
   private HashMap<Client> clientsList = new HashMap<>();

    public Hotel(HashMap<Client> clientsList) {
        this.clientsList = clientsList;
    }
}
