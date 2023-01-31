package com.sggw.pattern.Template;

public abstract class AbstractRobot {
    public void run() {
        if (canGo(Direction.FORWARD)) {
            go(Direction.FORWARD);
        }
        if (canGo(Direction.LEFT)) {
            go(Direction.LEFT);
        }
        if (canGo(Direction.FORWARD)) {
            go(Direction.FORWARD);
        }
        if (canClean()) {
            clean();
        }
        if(canSign()){
            sign();
        }
        if(haveLights()){
            lightersOn();
        }
    }

    abstract void go(Direction direction);

    abstract boolean canGo(Direction direction);

    abstract void sign();

    abstract boolean canSign();

    abstract void clean();

    abstract boolean canClean();

    abstract void lightersOn();
    abstract boolean haveLights();
}
