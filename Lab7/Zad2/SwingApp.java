package com.company.Lab7.Zad2;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SwingApp extends JFrame{
    private JPanel PanelMain;
    private JPanel JPanelTop;
    private JPanel JPanelLeft;
    private JPanel JPanelRight;
    private JLabel JLabelAge;
    private JButton buttonNew;
    private JButton buttonSave;
    private JTextField textName;
    private JTextField textEmail;
    private JTextField textPhoneNumber;
    private JTextField textAddress;
    private JTextField textDateBirth;
    private JList listPeople;
    private ArrayList<Person> people;

    public SwingApp(){
        super("Moj projekt");
        this.setContentPane(this.PanelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        buttonNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        listPeople.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
    }

    public void addPerson(Person p){
        people.add(p);
    }

    public static void main(String[] args) {
        SwingApp swingApp = new SwingApp();
        swingApp.setVisible(true);
    }
}
