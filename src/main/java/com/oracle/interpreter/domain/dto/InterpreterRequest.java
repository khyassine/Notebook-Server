package com.oracle.interpreter.domain.dto;

public class InterpreterRequest {
    private String code;
    private String language;

    public InterpreterRequest(String code, String language) {
        this.code = code;
        this.language = language;
    }

    public String getCode() {
        return code;
    }

    public String getLanguage() {
        return language;
    }
}
