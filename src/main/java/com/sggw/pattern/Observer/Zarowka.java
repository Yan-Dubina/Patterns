package com.sggw.pattern.Observer;


import java.util.Observable;

public class Zarowka implements Observer {
    @Override
    public void update() {

        System.out.println("Wlanczam zarowke w sypialni");

    }
}
