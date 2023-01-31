package com.sggw.pattern.Observer;


public class Clima implements Observer {
    @Override
    public void update() {
        System.out.println("Ustawiam temperature na N stopni");
    }
}
