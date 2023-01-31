package com.sggw.pattern.Decorator;

import java.io.IOException;
import java.util.Map;

public interface Decorator {
    void setDecorator(Decorator decorator);
    String decore(Map<Character,Long> text) throws IOException;
}
