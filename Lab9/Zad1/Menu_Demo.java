package com.company.Lab9.Zad1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Menu_Demo extends JFrame implements ActionListener{
    JMenuBar menuBar;
    JMenu menuFile, menuEdit;
    JMenuItem newProject, openProject, aSubmenu, python, java, cpp, php, javascript, undo, redo, cut, copy, paste;
    JCheckBoxMenuItem checkBox1, checkBox2;
    JRadioButtonMenuItem radioButton1, radioButton2;

    public Menu_Demo(){
        int DEFAULT_WIDTH = 600;
        int DEFAULT_HEIGHT = 100;
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setTitle("Menu Demo");
        setLayout(null);

        menuBar= new JMenuBar();

        menuFile = new JMenu("File");
        menuEdit = new JMenu("Edit");

        newProject = new JMenuItem("New Project...");
        newProject.setAccelerator(KeyStroke.getKeyStroke("alt 1"));

        openProject = new JMenuItem("Open Project...");
        openProject.addActionListener(this);

        checkBox1 = new JCheckBoxMenuItem("Autosave");
        checkBox2 = new JCheckBoxMenuItem("Dark Mode");

        radioButton1 = new JRadioButtonMenuItem("UTF-8");
        radioButton1.addActionListener(this);
        radioButton1.setSelected(true);

        radioButton2 = new JRadioButtonMenuItem("UTF-8 BOM");
        radioButton2.addActionListener(this);

        aSubmenu = new JMenu("Language");

        python = new JMenuItem("Python");
        java = new JMenuItem("Java");
        cpp = new JMenuItem("C++");
        php = new JMenuItem("PHP");
        javascript = new JMenuItem("JavaScript");

        undo = new JMenuItem("Undo");
        undo.setAccelerator(KeyStroke.getKeyStroke("ctrl Z"));
        redo = new JMenuItem("Redo");
        redo.setAccelerator(KeyStroke.getKeyStroke("ctrl Y"));
        cut = new JMenuItem("Cut");
        cut.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
        copy = new JMenuItem("Copy");
        copy.setAccelerator(KeyStroke.getKeyStroke("ctrl C"));
        paste = new JMenuItem("Paste");
        paste.setAccelerator(KeyStroke.getKeyStroke("ctrl V"));

        menuFile.add(newProject);
        menuFile.add(openProject);
        menuFile.addSeparator();
        menuFile.add(checkBox1);
        menuFile.add(checkBox2);
        menuFile.addSeparator();
        menuFile.add(radioButton1);
        menuFile.add(radioButton2);
        menuFile.addSeparator();
        menuFile.add(aSubmenu);

        menuEdit.add(undo);
        menuEdit.add(redo);
        menuEdit.addSeparator();
        menuEdit.add(cut);
        menuEdit.add(copy);
        menuEdit.add(paste);

        aSubmenu.add(python);
        aSubmenu.add(java);
        aSubmenu.add(cpp);
        aSubmenu.add(php);
        aSubmenu.add(javascript);

        setJMenuBar(menuBar);

        menuBar.add(menuFile);
        menuBar.add(menuEdit);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu_Demo frame = new Menu_Demo();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if (zrodlo == openProject){
            JFileChooser fc = new JFileChooser();
            if (fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
                File plik = fc.getSelectedFile();
            }
        }
        else if (zrodlo == radioButton1){
            radioButton1.setSelected(true);
            radioButton2.setSelected(false);
        }
        else if (zrodlo == radioButton2){
            radioButton1.setSelected(false);
            radioButton2.setSelected(true);
        }
    }
}
