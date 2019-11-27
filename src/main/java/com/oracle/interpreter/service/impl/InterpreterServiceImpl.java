package com.oracle.interpreter.service.impl;

import com.oracle.interpreter.domain.InputRequest;
import com.oracle.interpreter.domain.Interpreter;
import com.oracle.interpreter.domain.dto.InterpreterRequest;
import com.oracle.interpreter.domain.dto.InterpreterResponse;
import com.oracle.interpreter.service.InterpreterService;
import com.oracle.interpreter.util.RequestParser;
import org.graalvm.polyglot.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Service
public class InterpreterServiceImpl implements InterpreterService {

    private final Logger log = LoggerFactory.getLogger(InterpreterServiceImpl.class);
    private Map<String,InterpreterRequest> requests=new ConcurrentHashMap();

    @Override
    public InterpreterResponse execute(InputRequest request) {
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();;
        ByteArrayOutputStream errorsStream=new ByteArrayOutputStream();;
        String sessionId=request.getSesssionId();
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
