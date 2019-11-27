package com.oracle.interpreter.web.rest;

import com.oracle.interpreter.domain.InputRequest;
import com.oracle.interpreter.domain.dto.InterpreterRequest;
import com.oracle.interpreter.service.InterpreterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/execute")

public class InterpreterResource {

    private final Logger log = LoggerFactory.getLogger(InterpreterResource.class);
    private final InterpreterService interpreterService;

    public InterpreterResource(InterpreterService interpreterService) {
        this.interpreterService = interpreterService;
    }

    @PostMapping
    public String execute(@RequestBody InputRequest inputRequest, HttpSession httpSession){
        String result=interpreterService.execute(inputRequest).getResult();
        log.info(String.format("Result : %s !", result));

        return result;
    }
}
