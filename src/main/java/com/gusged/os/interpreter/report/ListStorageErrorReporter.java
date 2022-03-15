package com.gusged.os.interpreter.report;

import java.util.List;
import java.util.ArrayList;

import lombok.Getter;

import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;

@Getter
public class ListStorageErrorReporter extends BaseErrorListener implements IdentiferErrorReporter  {
    private final List<String> errors;

    public ListStorageErrorReporter() {
        errors = new ArrayList<>();
    }

    @Override
    public void reportUnknownName(String message) {
        errors.add(String.format("Unknwon name: %s", message));
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        var sourceName = recognizer.getInputStream().getSourceName();
        if (!sourceName.isEmpty()) {
            sourceName = String.format("%s:%d:%d: ", sourceName, line, charPositionInLine);
        }

        errors.add(String.format("%s line %d:%d %s", sourceName, line, charPositionInLine, msg));
    }
}