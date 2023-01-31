package com.sggw.pattern.Chain;

public abstract class Check {
    private Check next;

    public static Check link(Check first, Check... checks) {
        Check head = first;
        for (Check check : checks) {
            head.next = check;
            head = check;
        }
        return first;
    }

    public abstract boolean check(String pass);

    protected boolean checkNext(String pass) {
        if (next == null) {
            return true;
        } else return next.check(pass);
    }
}
