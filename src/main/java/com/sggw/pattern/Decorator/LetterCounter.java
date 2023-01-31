package com.sggw.pattern.Decorator;

import java.io.IOException;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LetterCounter {
    public static void main(String[] args) throws IOException {
        String text = "Name,Salary\\nJohn Smith,100000\\nSteven Jobs,912000";
        LetterCounter app = new LetterCounter();
        app.run(text);
    }

    private void run(String  text) throws IOException {
        Decorator upper = new UpperCaseDecorator();
        Decorator fileDecorator = new FileDecorator();
        fileDecorator.setDecorator(upper);
        fileDecorator.decore(getChars(text));
    }
    Map<Character, Long> getChars(String text){
        return  text.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
