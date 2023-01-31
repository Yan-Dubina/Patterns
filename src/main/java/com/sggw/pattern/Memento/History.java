package com.sggw.pattern.Memento;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class History {
    private List<Pair> history = new ArrayList<>();

    private class Pair {
        private final Commit commit;
        private final Memento memento;

        Pair(String text, Memento memento) {
            commit = new Commit(text);
            this.memento = memento;
        }

        private Commit getCommit() {
            return commit;
        }

        private Memento getMemento() {
            return memento;
        }
    }

    public void push(String body, Memento memento) {
        history.add(new Pair(body, memento));
    }

    public void show() {
        if (history.isEmpty()) {
            System.out.println("Historia commitow jest pusta");
        } else {
            history.stream().map(Pair::getCommit).collect(Collectors.toList()).forEach(System.out::println);
        }
    }

    public boolean undo() {
        if (history.size() == 0) {
            return false;
        }
        Pair pair = history.get(history.size() - 1);
        history.remove(history.size() - 1);
        pair.getMemento().restore();
        return true;
    }

    public Commit getLastCommit() {
        Commit commit = new Commit("");
        if (!history.isEmpty()) {
            commit = history.get(history.size() - 1).getCommit();
        }
        return commit;
    }
}
