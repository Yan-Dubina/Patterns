package com.sggw.pattern.Chain;

import com.sggw.pattern.Memento.Command;

import java.util.Scanner;

public class PassChecker {
    public static void main(String[] args) {
        Check checker = Check.link(
                new LengthCheck(),
                new CaseCheck(),
                new NumbersCheck(),
                new SpecialSymbolsCheck(),
                new SpecialSymbolsCheck()
        );
        Scanner in = new Scanner(System.in);
        String input;
        do {
            input = in.nextLine();
            new SpecialSymbolsCheck().check(input);
            if(checker.check(input)) {
                System.out.println("Haslo odporne");
            } else {
                System.out.println("Haslo nie jest odporne");
            }
        } while (!input.isEmpty());
        System.out.println("Program zakonczony");
    }
}
