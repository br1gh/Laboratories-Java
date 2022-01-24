package com.company.Lab8.Zad1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConTempCtoF extends JFrame {
    private JTextField textFCelcjusz;
    private JTextField textFFarenheit;
    private JButton konwertujButton;
    private JButton wyczyśćButton;
    private JButton wyjścieButton;
    private JRadioButton czcionkaMałaRadioButton;
    private JRadioButton czcionkaŚredniaRadioButton;
    private JRadioButton czcionkaDużaRadioButton;
    private JCheckBox wielkieLiteryCheckBox;
    private JButton resetujButton;
    private JPanel panel1;

    private double tempC, tempF;

    public ConTempCtoF(){
        super("Konwertowanie stopni C -> F");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLayout(null);

        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(czcionkaMałaRadioButton);
        radioButtonGroup.add(czcionkaŚredniaRadioButton);
        radioButtonGroup.add(czcionkaDużaRadioButton);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object ob1 = e.getSource();
                if (ob1 == konwertujButton || ob1 == textFCelcjusz){
                    tempC = Double.parseDouble(textFCelcjusz.getText());
                    tempF = 32.00 + (9.0 / 5.0) * tempC;
                    textFFarenheit.setText(String.valueOf(tempF));
                }
                else if (ob1 == wyczyśćButton){
                    textFCelcjusz.setText("");
                    textFFarenheit.setText("");
                    if (wielkieLiteryCheckBox.isSelected() == true) wielkieLiteryCheckBox.setSelected(false);
                    else if (czcionkaMałaRadioButton.isSelected() == true) czcionkaMałaRadioButton.setSelected(false);
                    else if (czcionkaŚredniaRadioButton.isSelected() == true) czcionkaŚredniaRadioButton.setSelected(false);
                    else if (czcionkaDużaRadioButton.isSelected() == true) czcionkaDużaRadioButton.setSelected(false);
                }

                else if (ob1 == wyjścieButton){
                    dispose();
                }
                else if (ob1 == wielkieLiteryCheckBox){
                    if (wielkieLiteryCheckBox.isSelected() == true){
                        textFFarenheit.setFont(new Font("SansSerif",Font.BOLD, 18));
                    }
                    else{
                        textFFarenheit.setFont(new Font("SansSerif",Font.PLAIN, 12));
                    }
                }
                else if (ob1 == czcionkaMałaRadioButton){
                    textFFarenheit.setFont(new Font("SansSerif", Font.PLAIN, 8));
                }
                else if (ob1 == czcionkaŚredniaRadioButton){
                    textFFarenheit.setFont(new Font("SansSerif", Font.PLAIN, 12));
                }
                else if (ob1 == czcionkaDużaRadioButton){
                    textFFarenheit.setFont(new Font("SansSerif", Font.PLAIN, 20));
                }
                else if (ob1 == resetujButton){
                    textFFarenheit.setFont(new Font("Dialog",Font.PLAIN,12));
                    radioButtonGroup.clearSelection();
                    wielkieLiteryCheckBox.setSelected(false);
                }
            }
        };
        konwertujButton.addActionListener(listener);
        wyczyśćButton.addActionListener(listener);
        wyjścieButton.addActionListener(listener);
        wielkieLiteryCheckBox.addActionListener(listener);
        czcionkaMałaRadioButton.addActionListener(listener);
        czcionkaŚredniaRadioButton.addActionListener(listener);
        czcionkaDużaRadioButton.addActionListener(listener);
        resetujButton.addActionListener(listener);
    }


    public static void main(String[] args) {
        ConTempCtoF conTemp = new ConTempCtoF();
        conTemp.setVisible(true);
    }
}


