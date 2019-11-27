package com.oracle.interpreter.service;

import com.oracle.interpreter.domain.InputRequest;
import com.oracle.interpreter.domain.Interpreter;
import com.oracle.interpreter.domain.dto.InterpreterResponse;


public interface InterpreterService {

    InterpreterResponse execute(InputRequest request);
    Interpreter getInterpreter();
}
