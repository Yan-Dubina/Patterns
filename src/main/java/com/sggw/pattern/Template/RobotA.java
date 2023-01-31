package com.sggw.pattern.Template;


public class RobotA extends AbstractRobot {

    @Override
    void go(Direction direction) {
        System.out.println("Go " + direction.name() + "!!! " + this.getClass().getName());
    }

    @Override
    boolean canGo(Direction direction) {
        return true;
    }

    @Override
    void sign() {
        System.out.println("Signal!!! " + this.getClass().getName());
    }

    @Override
    boolean canSign() {
        return true;
    }

    @Override
    void clean() {

    }

    @Override
    boolean canClean() {
        System.out.println("Can't Clean !!! " + this.getClass().getName());
        return false;
    }

    @Override
    void lightersOn() {

    }

    @Override
    boolean haveLights() {
        System.out.println("Lighters is null!!! " + this.getClass().getName());
        return false;
    }
}
