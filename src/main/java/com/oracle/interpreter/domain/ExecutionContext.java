package com.oracle.interpreter.domain;

import org.graalvm.polyglot.Context;

import java.io.ByteArrayOutputStream;

public class ExecutionContext {
    private Context context;
    private ByteArrayOutputStream outputStream;
    private ByteArrayOutputStream errorsStream;

    public ExecutionContext(Context context, ByteArrayOutputStream outputStream, ByteArrayOutputStream errorsStream) {
        this.context = context;
        this.outputStream = outputStream;
        this.errorsStream = errorsStream;
    }
}
