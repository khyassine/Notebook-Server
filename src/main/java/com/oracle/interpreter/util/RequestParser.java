package com.oracle.interpreter.util;

import com.oracle.interpreter.domain.InputRequest;
import com.oracle.interpreter.domain.dto.InterpreterRequest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RequestParser {

    private static final String CODE_INPUT_PATTERN = "%(\\w+)\\s+(.*)";
    private static final Pattern pattern = Pattern.compile(CODE_INPUT_PATTERN);

    public static InterpreterRequest parseRequest(InputRequest input){

        Matcher matcher = pattern.matcher(input.getCode());

        if (matcher.matches()) {
            return new InterpreterRequest(matcher.group(1),matcher.group(2));
        }
        else {
            //TODO : Throw invalid request exception;
            return null;
        }
    }
}
