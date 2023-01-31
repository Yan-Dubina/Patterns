package com.sggw.pattern.Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundElement extends Element {

    private List<Element> elementList = new ArrayList<>();

    public CompoundElement(Long price, Element... elements) {
        super(price);
        elementList.addAll(Arrays.asList(elements));
    }

    public Long getPrice() {
        return elementList.stream().map(Element::getPrice).reduce(0L, Long::sum);
    }

}
