package com.sggw.pattern.Observer;


import java.util.Observable;

public class Czajnik implements Observer {

    @Override
    public void update() {
        System.out.println("Gotuje wode");
    }
}
