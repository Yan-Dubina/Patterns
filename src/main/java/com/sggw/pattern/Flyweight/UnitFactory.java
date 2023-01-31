package com.sggw.pattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class UnitFactory {
    static Map<String, UnitType> unitTypes = new HashMap<>();

    public static UnitType getUnitType(String name, String texture) {
        UnitType result = unitTypes.get(name);
        if (result == null) {
            result = new UnitType(name, texture);
            unitTypes.put(name, result);
        }
        return result;
    }
}
