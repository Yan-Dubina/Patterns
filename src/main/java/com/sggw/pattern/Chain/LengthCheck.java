package com.sggw.pattern.Chain;

public class LengthCheck extends Check{

    @Override
    public boolean check(String pass) {
        return pass.length() >= 7 && checkNext(pass);
    }
}
