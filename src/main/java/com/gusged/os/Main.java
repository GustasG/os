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
        changeLook();

        var injector = Guice.createInjector(new AppModule());

        try {
            EventQueue.invokeLater(() -> {
                var window = injector.getInstance(Window.class);
                window.setVisible(true);
            });
        } catch (Exception e) {
            logger.error("Window creation error", e);
        }

        var kernel = injector.getInstance(Kernel.class);
        kernel.run();
    }

    private static void changeLook() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            logger.error("Failed to change look and feel", e);
        }
    }
}