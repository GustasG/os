package com.gusged.os.interpreter;

import java.util.List;

import com.gusged.os.interpreter.report.ListStorageErrorReporter;
import lombok.Data;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.gusged.os.generated.AssemblyLexer;
import com.gusged.os.generated.AssemblyParser;
import com.gusged.os.interpreter.errors.CodeGenerationError;

@Data
public class Program {
    private final List<Integer> dataSegment;
    private final List<Integer> codeSegment;

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
