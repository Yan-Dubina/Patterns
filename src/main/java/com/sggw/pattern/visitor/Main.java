package com.sggw.pattern.visitor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Visitor visitorInfo = new VisitorInfo();
        Visitor visitorSum = new VisitorSum();

        List orders = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Order  orderOnline = new OnlineOrder(orders, 123);

        Order stationarOrder = new StationaryOrder(orders, 34);

        System.out.println(orderOnline.accept(visitorInfo));
        System.out.println(orderOnline.accept(visitorSum));
        System.out.println("*****************************");
        System.out.println(stationarOrder.accept(visitorInfo));
        System.out.println(stationarOrder.accept(visitorSum));
    }
}
