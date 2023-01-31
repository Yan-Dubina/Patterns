package com.sggw.pattern.Decorator;

import java.io.*;
import java.util.Locale;
import java.util.Map;

public class FileDecorator implements Decorator {

    Decorator decorator;

    @Override
    public void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String decore(Map<Character, Long> map) throws IOException {
        File file = new File("decore.txt");
        FileWriter writer = new FileWriter(file);
        writer.write(decorator.decore(map));
        writer.close();
        return "Plik zostal zapisany";
    }
}
