package com.sggw.pattern.nrAlbumu191666_Observer;

public class OuterObserver implements Observer{
    @Override
    public void update(Parking parking, String code) {
        parking.remove(code);
    }
}
