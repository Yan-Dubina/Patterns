package com.sggw.pattern.nrAlbumu191666_Observer;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Parking {
    double price = 0.0002;
    HashMap<String, LocalDateTime> map = new HashMap<>();
    List<Observer> observers;

    public Parking(List<Observer> observers){
        this.observers = observers;
    }

    public void add(String code) {
        if (map.size() < 100) {
            map.put(code, LocalDateTime.now());
            System.out.println("Samochód został dodany! Zostało miejsc" + (100 - map.size()));

        } else {
            System.out.println("Brak wolnych miejsc");
        }
    }

    public void run(Command command, String number) {
        Observer curObserver;
        if (command == Command.SAVE) {
            curObserver = observers.stream()
                    .filter(observer -> observer instanceof InterObserver)
                    .findFirst()
                    .get();
        } else {
            curObserver = observers.stream()
                    .filter(observer -> observer instanceof OuterObserver)
                    .findFirst()
                    .get();
        }
        curObserver.update(this, number);
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    void remove(String code) {
        if (map.containsKey(code)) {
            LocalDateTime toDateTime = LocalDateTime.now();
            LocalDateTime fromDateTime = map.get(code);
            LocalDateTime tempDateTime = LocalDateTime.from( fromDateTime );
            long years = tempDateTime.until( toDateTime, ChronoUnit.YEARS );
            tempDateTime = tempDateTime.plusYears( years );

            long months = tempDateTime.until( toDateTime, ChronoUnit.MONTHS );
            tempDateTime = tempDateTime.plusMonths( months );

            long days = tempDateTime.until( toDateTime, ChronoUnit.DAYS );
            tempDateTime = tempDateTime.plusDays( days );


            long hours = tempDateTime.until( toDateTime, ChronoUnit.HOURS );
            tempDateTime = tempDateTime.plusHours( hours );

            long minutes = tempDateTime.until( toDateTime, ChronoUnit.MINUTES );
            tempDateTime = tempDateTime.plusMinutes( minutes );
            long seconds = tempDateTime.until( toDateTime, ChronoUnit.SECONDS );

            map.remove(code);
            System.out.println("Samochód został usunięty! Do zapłaty: " + ((seconds + minutes * 60 + hours * 3600 + days * 86400
                    +months * 2592000 + years * 31536000)*price) + "zł");
            System.out.println("Pozostało miejsc: "+ map.size());
        } else {
            System.out.println("Nie ma takiego samochodu!");
        }

    }
}
