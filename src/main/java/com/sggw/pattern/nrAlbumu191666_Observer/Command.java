package com.sggw.pattern.nrAlbumu191666_Observer;

public enum Command {
    OTHER(""),
    SAVE("I"),
    OUT("O"),
    EXIT("EXIT");

    private final String lable;

    Command(String lable) {
        this.lable = lable;
    }

    static Command getByLabel(String lable) {
        for (Command e : Command.values()) {
            if (e.lable.equals(lable)) return e;
        }
        return Command.OTHER;
    }

}
