package com.oracle.interpreter.domain;

public class InputRequest {
    private String code;
    private String sesssionId;

    public InputRequest(String code, String sesssionId) {
        this.code = code;
        this.sesssionId = sesssionId;
    }
    public InputRequest(){}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSesssionId() {
        return sesssionId;
    }

    public void setSesssionId(String sesssionId) {
        this.sesssionId = sesssionId;
    }
}
