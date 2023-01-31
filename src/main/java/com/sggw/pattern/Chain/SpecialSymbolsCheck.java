package com.sggw.pattern.Chain;

import java.util.regex.Pattern;

public class SpecialSymbolsCheck extends Check{
    @Override
    public boolean check(String pass) {
        Pattern p = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        if (p.matcher(pass).find()) {
            return checkNext(pass);
        } else {
            return false;
        }
    }
}
