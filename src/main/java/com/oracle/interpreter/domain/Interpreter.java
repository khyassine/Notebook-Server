package com.oracle.interpreter.domain;

import java.util.Arrays;

public enum Interpreter {
    PYTHON("python");

    private String name;
    Interpreter(String language) {
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public static Interpreter getInterpreter(String interpreterName){
        return Arrays.stream(Interpreter.values())
                .filter(interpreter -> interpreter.getName().equalsIgnoreCase(interpreterName))
                .findAny()
                .orElse(null);
    }
}
