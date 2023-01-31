package com.sggw.pattern.Decorator;


import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class UpperCaseDecorator implements Decorator {

    Decorator decorator;


    @Override
    public void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String decore(Map<Character, Long> map) {
        return map.entrySet()
                .stream()
                .map(val -> val.getKey().toString().toUpperCase(Locale.ROOT) + ":" + val.getValue())
                .collect(Collectors.joining("\n"));
    }

}
