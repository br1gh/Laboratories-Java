package com.company.Lab8.Zad2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometricFigures extends JFrame {
    private JRadioButton kwadratRadioButton;
    private JRadioButton prostokątRadioButton;
    private JRadioButton trójkątRadioButton;
    private JRadioButton trapezRadioButton;
    private JRadioButton sześcianRadioButton;
    private JRadioButton prostopadłościanRadioButton;
    private JRadioButton walecRadioButton;
    private JRadioButton kulaRadioButton;
    private JPanel panel1;
    private JButton obliczButton;
    private JButton wyczyśćButton;
    private JTextField textBokA;
    private JTextField textBokB;
    private JTextField textWysokość;
    private JTextField textPromień;
    private JTextField textPole;
    private JTextField textObwód;
    private JTextField textObjętość;
    private double a, b, h, r;

    public GeometricFigures(){
        super("Figury geometryczne - kalulator");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLayout(null);

        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(kwadratRadioButton);
        radioButtonGroup.add(prostokątRadioButton);
        radioButtonGroup.add(trójkątRadioButton);
        radioButtonGroup.add(trapezRadioButton);
        radioButtonGroup.add(sześcianRadioButton);
        radioButtonGroup.add(prostopadłościanRadioButton);
        radioButtonGroup.add(walecRadioButton);
        radioButtonGroup.add(kulaRadioButton);

        kwadratRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setEnabledAll();
                textBokB.setEnabled(false);
                textWysokość.setEnabled(false);
                textPromień.setEnabled(false);
                textObjętość.setEnabled(false);
            }
        });

        prostokątRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setEnabledAll();
                textWysokość.setEnabled(false);
                textPromień.setEnabled(false);
                textObjętość.setEnabled(false);
            }
        });

        trójkątRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setEnabledAll();
                textBokB.setEnabled(false);
                textPromień.setEnabled(false);
                textObwód.setEnabled(false);
                textObjętość.setEnabled(false);
            }
        });

        trapezRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setEnabledAll();
                textPromień.setEnabled(false);
                textObwód.setEnabled(false);
                textObjętość.setEnabled(false);
            }
        });

        sześcianRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setEnabledAll();
                textBokB.setEnabled(false);
                textWysokość.setEnabled(false);
                textPromień.setEnabled(false);
            }
        });

        prostopadłościanRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setEnabledAll();
                textPromień.setEnabled(false);
            }
        });

        walecRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setEnabledAll();
                textBokA.setEnabled(false);
                textBokB.setEnabled(false);
            }
        });

        kulaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setEnabledAll();
                textBokA.setEnabled(false);
                textBokB.setEnabled(false);
                textWysokość.setEnabled(false);
                textObwód.setEnabled(false);
            }
        });

        obliczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (kwadratRadioButton.isSelected()){
                    a = Double.parseDouble(textBokA.getText());
                    textPole.setText(String.valueOf(a*a));
                    textObwód.setText(String.valueOf(4*a));
                }
                else if (prostokątRadioButton.isSelected()){
                    a = Double.parseDouble(textBokA.getText());
                    b = Double.parseDouble(textBokB.getText());
                    textPole.setText(String.valueOf(a*b));
                    textObwód.setText(String.valueOf(a+a+b+b));
                }
                else if (trójkątRadioButton.isSelected()){
                    a = Double.parseDouble(textBokA.getText());
                    h = Double.parseDouble(textWysokość.getText());
                    textPole.setText(String.valueOf((a*h)/2));
                }
                else if (trapezRadioButton.isSelected()){
                    a = Double.parseDouble(textBokA.getText());
                    b = Double.parseDouble(textBokB.getText());
                    h = Double.parseDouble(textWysokość.getText());
                    textPole.setText(String.valueOf(((a+b)*h)/2));
                }
                else if (sześcianRadioButton.isSelected()){
                    a = Double.parseDouble(textBokA.getText());
                    textPole.setText(String.valueOf(6*a*a));
                    textObwód.setText(String.valueOf(12*a));
                    textObjętość.setText(String.valueOf(a*a*a));
                }
                else if (prostopadłościanRadioButton.isSelected()){
                    a = Double.parseDouble(textBokA.getText());
                    b = Double.parseDouble(textBokB.getText());
                    h = Double.parseDouble(textWysokość.getText());
                    textPole.setText(String.valueOf(2*((a*b) +(a*h) + (b*h))));
                    textObwód.setText(String.valueOf(4*(a+b+h)));
                    textObjętość.setText(String.valueOf(a*b*h));
                }
                else if (walecRadioButton.isSelected()){
                    h = Double.parseDouble(textWysokość.getText());
                    r = Double.parseDouble(textPromień.getText());
                    textPole.setText(String.valueOf(2*Math.PI*r*(r+h)));
                    textObwód.setText(String.valueOf(4*Math.PI*r));
                    textObjętość.setText(String.valueOf(Math.PI*r*r*h));
                }
                else if (kulaRadioButton.isSelected()){
                    r = Double.parseDouble(textPromień.getText());
                    textPole.setText(String.valueOf(4*Math.PI*r*r));
                    textObjętość.setText(String.valueOf((4/3)*Math.PI*r*r*r));
                }
            }
        });

        wyczyśćButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setEnabledAll();
                radioButtonGroup.clearSelection();
                textBokA.setText("");
                textBokB.setText("");
                textWysokość.setText("");
                textPromień.setText("");
                textPole.setText("");
                textObwód.setText("");
                textObjętość.setText("");
            }
        });
    }

    public void setEnabledAll(){
        textBokA.setEnabled(true);
        textBokB.setEnabled(true);
        textWysokość.setEnabled(true);
        textPromień.setEnabled(true);
        textPole.setEnabled(true);
        textObwód.setEnabled(true);
        textObjętość.setEnabled(true);
    }

    public static void main(String[] args) {
        GeometricFigures geometricFigures = new GeometricFigures();
        geometricFigures.setVisible(true);
    }
}


