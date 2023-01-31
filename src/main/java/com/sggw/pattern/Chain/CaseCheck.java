package com.sggw.pattern.Chain;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties;

import java.util.stream.Stream;

public class CaseCheck extends Check {
    @Override
    public boolean check(String pass) {
        return pass.chars().filter(val -> val >= 'A' && val <= 'Z').findFirst().isPresent() &&
           pass.chars().filter(val -> val >= 'a' && val <= 'z').findFirst().isPresent() && checkNext(pass);
    }
}
