package com.oracle.interpreter.domain.dto;

public class InterpreterRequest {
    public void setCode(String code) {
        this.code = code;
    }

    private String code;
    private String language;

    public InterpreterRequest(String language, String code) {
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
