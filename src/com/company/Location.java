package com.company;

import java.util.HashMap;
import java.util.Map;

class Location {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits != null) {
            this.exits = new HashMap<>(exits);
        } else {
            this.exits = new HashMap<>();
        }
        this.exits.put("Q", 0);
    }

    String getDescription() {
        return description;
    }

    Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}

