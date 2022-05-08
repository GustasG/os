package com.gusged.os.compiler;

import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.gusged.os.generated.AssemblyLexer;
import com.gusged.os.generated.AssemblyParser;

import com.gusged.os.compiler.errors.CodeGenerationError;
import com.gusged.os.compiler.report.ListStorageErrorReporter;

public record Program(
        List<Integer> dataSegment,
        List<Integer> codeSegment) {
    public static Program createFromFile(String filePath) {
        var errorReporter = new ListStorageErrorReporter();

        try {
            var charStream = CharStreams.fromFileName(filePath);

            var lexer = new AssemblyLexer(charStream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(errorReporter);

            var parser = new AssemblyParser(new CommonTokenStream(lexer));
            parser.removeErrorListeners();
            parser.addErrorListener(errorReporter);

            var generator = new CodeGenerator(errorReporter);
            generator.visit(parser.program());

            if (!errorReporter.getErrors().isEmpty()) {
                throw new CodeGenerationError(errorReporter.getErrors());
            }

            return new Program(generator.getDataSegment(), generator.getCodeSegment());
        } catch (Exception e) {
            throw new CodeGenerationError(e);
        }
    }
}