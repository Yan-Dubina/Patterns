package com.sggw.pattern.Flyweight;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Game {
    static int UNIT_HP_MAX = 1000;
    static int X_MAX = 100;
    static int Y_MAX = 100;
    List<Unit> unitList = new ArrayList<>();

    public static void main(String[] args) {
        Game game = new Game();
        for (int i = 0; i < 100000; i++) {
            game.initUnit(random(0, X_MAX), random(0, X_MAX),
                    "username" +
                            i++, Color.GREEN, random(0, UNIT_HP_MAX), i % 3);
            game.initUnit(random(0, Y_MAX), random(0, X_MAX),
                    "" + i, Color.ORANGE, random(0, UNIT_HP_MAX), i % 3);
        }
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public void initUnit(int x, int y, String name, Color color, int hp, int typeOfUnit) {
        UnitType type = UnitFactory.getUnitType(name, color.toString());
        Unit unit;
        switch (typeOfUnit) {
            case (0):
                unit = new Gun(hp, x, y, type);
                break;
            case (1):
                unit = new Knight(hp, x, y, type);
                break;
            case (2):
                unit = new Villager(hp, x, y, type);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + typeOfUnit);
        }
        System.out.println("Powstal unit o type " + unit.getClass());
        unitList.add(unit);
    }
}
