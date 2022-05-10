package com.gusged.os.ui;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.Kernel;
import com.gusged.os.resource.MosFinal;
import com.gusged.os.resource.ScannerInputStream;
import com.gusged.os.resource.ProgramInputStream;

@Singleton
public class Window extends JFrame {
    private static final Logger logger = LoggerFactory.getLogger(Window.class);

    private static Window instance;

    private final Kernel kernel;
    private final JTextField keyboard;
    private final JTextArea console;

    @Inject
    public Window(Kernel kernel) {
        super("Operating system");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(880, 550);
        setLocationRelativeTo(null);

        try {
            var iconDirectory = Window.class.getResource("/icons");
            if (iconDirectory != null) {
                try (var stream = Files.list(Paths.get(iconDirectory.toURI()))) {
                    var icons = stream
                            .map(Path::toString)
                            .map(ImageIcon::new)
                            .map(ImageIcon::getImage)
                            .toList();

                    setIconImages(icons);
                }
            } else {
                logger.error("Icon directory does not exist");
            }
        } catch (Exception e) {
            logger.error("Failed to set icon", e);
        }

        var contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        var menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        var fileMenu = new JMenu("File");

        var launchProgramItem = new JMenuItem("Launch program...");
        launchProgramItem.addActionListener((e) -> openProgram());

        var exitItem = new JMenuItem("Exit");
        exitItem.addActionListener((e) -> dispose());

        fileMenu.add(launchProgramItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        var contentPaneLayout = new GridBagLayout();
        contentPaneLayout.columnWidths = new int[] { 28, 815, 30, 7 }; // SUM = 880
        contentPaneLayout.rowHeights = new int[] { 25, 485, 40 }; // SUM = 550
        contentPane.setLayout(contentPaneLayout);

        console = new JTextArea();
        console.setEditable(false);

        GridBagConstraints scrollConstraints = new GridBagConstraints();
        scrollConstraints.fill = GridBagConstraints.BOTH;
        scrollConstraints.gridx = 0;
        scrollConstraints.gridy = 0;
        scrollConstraints.gridwidth = 3;
        scrollConstraints.gridheight = 2;
        scrollConstraints.weightx = 1;
        scrollConstraints.weighty = 1;
        scrollConstraints.insets = new Insets(0, 5, 0, 0);
        contentPane.add(new JScrollPane(console), scrollConstraints);

        keyboard = new JTextField(10);
        keyboard.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    var cs = kernel.findResource(ScannerInputStream.class);
                    cs.setPayload(keyboard.getText());
                    kernel.addWaitingResource(ScannerInputStream.class);

                    keyboard.setText(null);
                }
            }
        });

        GridBagConstraints keyboardConstraints = new GridBagConstraints();
        keyboardConstraints.insets = new Insets(0, 0, 0, 5);
        keyboardConstraints.fill = GridBagConstraints.HORIZONTAL;
        keyboardConstraints.gridx = 0;
        keyboardConstraints.gridy = 2;
        keyboardConstraints.gridwidth = 0;
        keyboardConstraints.weightx = 1;
        keyboardConstraints.weighty = 0;
        contentPane.add(keyboard, keyboardConstraints);

        keyboard.requestFocusInWindow();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                kernel.addWaitingResource(MosFinal.class);
            }
        });

        this.kernel = kernel;
        instance = this;
    }

    public static Window instance() {
        return instance;
    }

    public void print(String message) {
        console.append(message);
        console.append("\n");
    }

    private void openProgram() {
        var fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));

        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            var file = fileChooser.getSelectedFile();
            try {
                var content = Files.readString(Path.of(file.getAbsolutePath()));

                var is = kernel.findResource(ProgramInputStream.class);
                is.setPayload(content);

                kernel.addWaitingResource(ProgramInputStream.class);
            } catch (IOException e) {
                logger.error("Failed to read file", e);
            }
        }
    }
}