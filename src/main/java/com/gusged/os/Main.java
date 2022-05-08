package com.gusged.os;

import javax.swing.*;
import java.awt.EventQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;

import com.gusged.os.ui.Window;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        var injector = Guice.createInjector(new AppModule());

        var kernel = injector.getInstance(Kernel.class);
        var window = injector.getInstance(Window.class);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            logger.error("Failed to change look and feel", e);
        }

        try {
            EventQueue.invokeLater(() -> {
                window.setVisible(true);
            });
        } catch (Exception e) {
            logger.error("Window creation error", e);
        }

        kernel.run();
    }
}