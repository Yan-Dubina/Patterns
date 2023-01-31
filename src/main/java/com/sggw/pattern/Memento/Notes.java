package com.sggw.pattern.Memento;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Notes {

    private History history;

    private Commit commit;

    String input;

    public Commit backup() {
        return history.getLastCommit();
    }

    public void restore(Commit commit) {
        this.commit = commit;
    }

    public void run() {
        String input;
        history = new History();
        Scanner in = new Scanner(System.in);
        Command inputCommand;
        do {
            input = in.nextLine();
            try {
                inputCommand = Command.getByLabel(input);
            } catch (IllegalArgumentException e) {
                inputCommand = Command.OTHER;
            }
            if (Command.OTHER == inputCommand) {
                this.input = input;
            }
            runCommand(inputCommand);
        } while (inputCommand != Command.EXIT);
        System.out.println("Program zakonczony");
    }

    private void runCommand(Command command) {
        switch (command) {
            case SAVE:
                save();
                break;
            case SHOW:
                show();
                break;
            case UNDO:
                undo();
            default:
        }
    }

    private void save() {
        history.push(input, new Memento(this));
    }

    private void show() {
        history.show();
    }

    private void undo() {
        if (history.undo()) {

        } else {
            System.out.println("Brak historii zapisu");
        }
    }
}
