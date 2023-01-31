package com.sggw.pattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    public void goTo(Room room) {
        System.out.println("Ide w pokuj:"+room.name());
        List<Observer> observers = new ArrayList<>();
        if (room == Room.KUCHNIA) {
            observers.add(new Czajnik());
        }
        if (room == Room.SYPIALNIA) {
            observers.add(new Zarowka());
        }
        observers.add(new Clima());
        observers.forEach(Observer::update);
    }
}
