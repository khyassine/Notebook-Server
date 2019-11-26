package com.oracle.interpreter.service.impl;

import com.oracle.interpreter.domain.Interpreter;
import com.oracle.interpreter.domain.dto.InterpreterRequest;
import com.oracle.interpreter.domain.InterpreterResponse;
import com.oracle.interpreter.service.InterpreterService;
import org.springframework.stereotype.Service;


@Service
public class InterpreterServiceImpl implements InterpreterService {

    @Override
    public InterpreterResponse execute(InterpreterRequest request) {
        return null;
    }

    @Override
    public Interpreter getInterpreter() {

        return null;
    }


}
