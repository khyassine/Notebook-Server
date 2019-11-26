package com.oracle.interpreter.service;

import com.oracle.interpreter.domain.Interpreter;
import com.oracle.interpreter.domain.dto.InterpreterRequest;
import com.oracle.interpreter.domain.dto.InterpreterResponse;
import org.springframework.stereotype.Service;

@Service
public interface InterpreterService {

    InterpreterResponse execute(InterpreterRequest request);
    Interpreter getInterpreter();
}
