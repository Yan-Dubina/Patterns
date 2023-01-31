package com.sggw.pattern.nrAlbumu191666_Observer;

public class InterObserver implements Observer{
    @Override
    public void update(Parking parking, String code) {
        parking.add(code);
    }
}
