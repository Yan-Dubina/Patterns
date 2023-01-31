package com.sggw.pattern.Template;


public class RobotB extends AbstractRobot {

    Integer limit = 1;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Override
    void go(Direction direction) {
        System.out.println("Go " + direction.name() + "!!! " + this.getClass().getName());
    }

    @Override
    boolean canGo(Direction direction) {
        if (direction != Direction.FORWARD) {
            return true;
        }
        if (0 < limit) {
            System.out.println("Can't Go " + direction.name() + "!!! " + this.getClass().getName());
            return false;
        }
        return 0 < limit--;
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
        System.out.println("Clean!!! " + this.getClass().getName());
    }

    @Override
    boolean canClean() {
        return true;
    }

    @Override
    void lightersOn() {
        System.out.println(ANSI_RED + "Lighters!!! " + this.getClass().getName() + ANSI_RESET);
    }

    @Override
    boolean haveLights() {
        return true;
    }
}
