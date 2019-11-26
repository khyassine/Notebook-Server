package com.oracle.interpreter.domain;

public class InputRequest {
    private String code;

    public InputRequest(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
