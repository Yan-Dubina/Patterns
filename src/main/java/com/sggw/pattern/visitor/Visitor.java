package com.sggw.pattern.visitor;

public interface Visitor {
    int sum(Order order);
    String info(Order order);
}
