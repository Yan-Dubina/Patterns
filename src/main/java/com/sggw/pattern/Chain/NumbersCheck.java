package com.sggw.pattern.Chain;

import java.util.Arrays;
import java.util.stream.Stream;

public class NumbersCheck extends Check {
    @Override
    public boolean check(String pass) {
        return pass.chars()
                .filter(value -> value >= '0' && value <= '9')
                .findFirst().isPresent() && checkNext(pass);
    }
}
