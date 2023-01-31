package com.sggw.pattern;

import com.sggw.pattern.Observer.Room;
import com.sggw.pattern.Observer.SmartHome;
import com.sggw.pattern.Template.AbstractRobot;
import com.sggw.pattern.Template.RobotA;
import com.sggw.pattern.Template.RobotB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        System.out.println("Zadanie: wzorzec Template");
        AbstractRobot robot = new RobotB();
        robot.run();
        robot = new RobotA();
        robot.run();

        System.out.println("\n\n");

        System.out.println("Zadanie: Observer ze wzorcem stategia");
        SmartHome smartHome = new SmartHome();

        smartHome.goTo(Room.LAZIENKA);
        System.out.println();

        smartHome.goTo(Room.SYPIALNIA);
        System.out.println();

        smartHome.goTo(Room.KUCHNIA);

        System.out.println("\n\n");
    }

}
