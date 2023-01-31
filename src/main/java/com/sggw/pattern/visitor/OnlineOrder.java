package com.sggw.pattern.visitor;

import java.util.List;

public class OnlineOrder extends Order{
    long id;

    public OnlineOrder (List orders, int id){
        this.items = orders;
        this.id = id;
    }
}
