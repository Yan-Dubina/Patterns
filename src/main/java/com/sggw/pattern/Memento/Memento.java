package com.sggw.pattern.Memento;

public class Memento {
    private Commit backup;
    private Notes notes;

    public Memento(Notes notes) {
        this.notes = notes;
        backup = notes.backup();
    }

    public void restore(){
        notes.restore(backup);
    }
}
