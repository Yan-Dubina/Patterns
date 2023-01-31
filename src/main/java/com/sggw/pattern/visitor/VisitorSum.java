package com.sggw.pattern.visitor;

public class VisitorSum implements Visitor{
    @Override
    public int sum(Order order) {
        if(order instanceof StationaryOrder) {
           return ((StationaryOrder) order).delivery + order.items.stream().mapToInt(Integer::intValue).sum();
        }
        return order.items.stream().mapToInt(Integer::intValue).sum();
    }

    @Override
    public String info(Order order) {
        return null;
    }
}
