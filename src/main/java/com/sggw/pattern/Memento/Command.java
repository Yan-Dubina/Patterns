package com.sggw.pattern.Memento;

public enum Command {
    OTHER(""),
    SAVE(">Save"),
    UNDO(">Undo"),
    SHOW(">Show"),
    EXIT(">Exit");


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
