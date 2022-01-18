package com.company.Lab7.Zad1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class testUsun {

    private JPanel panel1;
    private JButton button1;

    public testUsun() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("To jest moje pierwsze GUI");
        frame.setContentPane(new testUsun().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
