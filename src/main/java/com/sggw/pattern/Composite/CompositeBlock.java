package com.sggw.pattern.Composite;

public class CompositeBlock {
    public static void main(String[] args) {
        Element elem = new Element(100L);
        CompoundElement comp = new CompoundElement(1L, elem);
        CompoundElement compositeBlock = new CompoundElement(200L, elem, comp);
        System.out.println(compositeBlock.getPrice());

    }
}
