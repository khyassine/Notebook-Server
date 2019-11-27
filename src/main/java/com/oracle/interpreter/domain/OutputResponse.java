package com.oracle.interpreter.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OutputResponse {
    private String result;
    private String error;

    public OutputResponse(){}

    public OutputResponse(String result,String error) {
        this.result = result;
        this.error=error;
    }


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
