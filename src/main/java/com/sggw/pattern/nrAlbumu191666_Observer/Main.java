package com.sggw.pattern.nrAlbumu191666_Observer;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Parking parking = new Parking(Arrays.asList(new OuterObserver(), new InterObserver()));
        System.out.println("Start aplikacji parkingu (komendy: I/O, aby zakończyć program napisz: <EXIT>)");
        String input;
        Scanner in = new Scanner(System.in);
        Command inputCommand;
        String number;
        do {
            System.out.println("Podaj komende:");
            input = in.nextLine();

            try {
                inputCommand = Command.getByLabel(input);
            } catch (IllegalArgumentException e) {
                inputCommand = Command.OTHER;
            }
            if (Command.OTHER == inputCommand) {
                System.out.println("Niepoprawna komenda!");
            }
            if(Command.EXIT == inputCommand) {
                break;
            }
            System.out.println("Podaj numer:");
            number = in.nextLine();
            parking.run(inputCommand, number);
        } while (true);
        System.out.println("Program zakonczony");
    }
}
