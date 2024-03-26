package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private LampType lampType;
    private boolean battery;
    private int globalRating;

    public Lamp(LampType lampType, boolean battery, int globalRating) {
        this.lampType = lampType;
        this.battery = battery;
        this.globalRating = globalRating;
    }

    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() {
        return lampType;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobalRating() {
        return globalRating;
    }
}
