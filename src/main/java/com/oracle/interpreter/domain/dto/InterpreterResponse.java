package com.oracle.interpreter.domain.dto;

public class InterpreterResponse {
    private String result;

    public InterpreterResponse(String result) {
        this.result=result;
    }
    public String getResult(){
        return result;
    }
}
