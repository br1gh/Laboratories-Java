package com.company.Lab9.Zad2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie extends JFrame {

    private JPanel panel1;
    private JTextField liczba1;
    private JTextField liczba2;
    private JTextField wynik;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JButton obliczButton;
    private JButton wyjscieButton;
    double a,b;

    public Zadanie(){
        super("Zadanie");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLayout(null);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        obliczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (radioButton1.isSelected()) {
                        a = Double.parseDouble(liczba1.getText());
                        b = Double.parseDouble(liczba2.getText());
                        wynik.setText(String.valueOf(a * b));
                    }
                    else if (radioButton2.isSelected()) {
                        a = Double.parseDouble(liczba1.getText());
                        b = Double.parseDouble(liczba2.getText());
                        if (b != 0)
                            wynik.setText(String.valueOf(a / b));
                        else
                            wynik.setText("Dzielenie przez 0!");
                    }
                    else{
                        wynik.setText("Wybierz operator!");
                    }
                }
                catch (NumberFormatException ex){
                    wynik.setText("Podaj dwie liczby!");
                }
            }
        });
        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int answer = JOptionPane.showConfirmDialog(null,"Czy napewno wyjsc?","Pytanie",JOptionPane.YES_NO_OPTION);
                if (answer == JOptionPane.YES_OPTION)
                    dispose();
            }
        });
    }

    public static void main(String[] args) {
        Zadanie zadanie = new Zadanie();
        zadanie.setVisible(true);
    }
}


