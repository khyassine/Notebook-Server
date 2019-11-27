package com.oracle.interpreter.service.impl;

import com.oracle.interpreter.domain.InputRequest;
import com.oracle.interpreter.domain.Interpreter;
import com.oracle.interpreter.domain.dto.InterpreterRequest;
import com.oracle.interpreter.domain.InterpreterResponse;
import com.oracle.interpreter.service.InterpreterService;
import com.oracle.interpreter.util.RequestParser;
import org.graalvm.polyglot.Context;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;


@Service
public class InterpreterServiceImpl implements InterpreterService {

    @Override
    public InterpreterResponse execute(InputRequest request) {

        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();;
        ByteArrayOutputStream errorsStream=new ByteArrayOutputStream();;

        InterpreterRequest interpreterRequest=RequestParser.parseRequest(request);

        Context context = Context.newBuilder(interpreterRequest.getLanguage()).out(outputStream).err(errorsStream).build();
        context.eval(interpreterRequest.getLanguage(),interpreterRequest.getCode());

        return new InterpreterResponse(outputStream.toString());
    }

    @Override
    public Interpreter getInterpreter() {

        return null;
    }


}
