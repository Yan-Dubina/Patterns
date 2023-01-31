package com.sggw.pattern.State;

import java.util.Random;

public abstract class Connection {

    void onTaken() throws InterruptedException {
        Integer state = new Random().ints(0, 10000)
                .findFirst()
                .getAsInt();
        Thread.sleep(state);
        state = new Random().ints(1, 3)
                .findFirst()
                .getAsInt();
        if (state == 1) {
            System.out.println(
                    "Przyjete -> Zakoczone"
            );
            onFinished();
        } else {
            System.out.println("Przyjete -> Kolejka");
            onWait();
        }
    }

    void onWait() throws InterruptedException {
        int state = new Random().ints(0, 10000)
                .findFirst()
                .getAsInt();
        Thread.sleep(state);
        state = new Random().ints(1, 3)
                .findFirst()
                .getAsInt();
        if (state == 1) {
            System.out.println(
                    "W kolejce  -> Zakoczone"
            );
            onFinished();
        } else {
            System.out.println("W kolejce -> 1 linia wsparcia");
            onFirstLine();
        }

    }

    void onFirstLine() throws InterruptedException {
        Integer state = new Random().ints(1, 3)
                .findFirst()
                .getAsInt();
        if (state == 1) {
            onFinished();
        } else {
            onSecondLine();
        }
    }

    void onSecondLine() {
        System.out.println("W trakcie rozmowy z 2 linia wsparcia");
    }

    void onFinished() {
        System.out.println("Polaczenie zakonczone");
    }
}
