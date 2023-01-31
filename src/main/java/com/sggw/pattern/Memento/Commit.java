package com.sggw.pattern.Memento;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;

public class Commit {

    String body;
    final LocalDateTime dateTime = LocalDateTime.now();
    int hash;

    public Commit(String body) {
        this.body = body;
        hash = Objects.hashCode(body);
    }

    @Override
    public String toString() {
        return "Commit{" +
                "body='" + body + '\'' +
                ", dateTime=" + dateTime +
                ", hash='" + hash + '\'' +
                '}';
    }
}
