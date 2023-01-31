package com.sggw.pattern.visitor;

import java.util.List;

public class StationaryOrder extends Order{
    public int delivery;

    public StationaryOrder (List orders, int delivery){
        this.items = orders;
        this.delivery = delivery;
    }

}
