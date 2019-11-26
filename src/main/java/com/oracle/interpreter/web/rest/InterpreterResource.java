package com.oracle.interpreter.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/execute")
public class InterpreterResource {

    private final Logger log = LoggerFactory.getLogger(InterpreterResource.class);

}
