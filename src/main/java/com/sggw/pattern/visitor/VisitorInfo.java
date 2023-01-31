package com.sggw.pattern.visitor;

public class VisitorInfo implements Visitor {
    @Override
    public int sum(Order order) {
        return 0;
    }

    @Override
    public String info(Order order) {
        if (order instanceof StationaryOrder) {
            return "StationaryOrder{" +
                    "items=" + order.items +
                    ", delivery=" + ((StationaryOrder) order).delivery +
                    '}';
        }
        return "OnlineOrder{" +
                "shop Id=" +  ((OnlineOrder) order).id +
                ", items=" + order.items +
                '}';
    }
}
