package com.gusged.os.interpreter.errors;

import java.util.List;

public class CodeGenerationError extends RuntimeException {
    private List<String> errors;

    public CodeGenerationError() {
        super();
    }

    public CodeGenerationError(String message) {
        super(message);
    }

    public CodeGenerationError(List<String> errors) {
        this.errors = errors;
    }

    public CodeGenerationError(String message, Throwable cause) {
        super(message, cause);
    }

    public CodeGenerationError(Throwable cause) {
        super(cause);
    }
}
