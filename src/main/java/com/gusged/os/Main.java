package com.gusged.os;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.gusged.os.generated.AssemblyLexer;
import com.gusged.os.generated.AssemblyParser;
import com.gusged.os.interpreter.CodeGenerator;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Starting OS");

//        var injector = Guice.createInjector(new AppModule());
//        var rm = injector.getInstance(RealMachine.class);

        try {
            var charStream = CharStreams.fromFileName("programs/example.asm");
            var lexer = new AssemblyLexer(charStream);
            var parser = new AssemblyParser(new CommonTokenStream(lexer));
            var tree = parser.program();

            var generator = new CodeGenerator();
            generator.visit(tree);
            generator.resolveNames();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}