package com.company.Lab7.Zad2;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
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
    private DefaultListModel listPeopleModel;

    public SwingApp(){
        super("Moj projekt");
        people = new ArrayList<Person>();
        listPeopleModel = new DefaultListModel();
        listPeople.setModel(listPeopleModel);
        this.setContentPane(this.PanelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        buttonNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Person p = new Person(
                        textName.getText(),
                        textEmail.getText(),
                        textPhoneNumber.getText(),
                        textAddress.getText(),
                        textDateBirth.getText()
                );
                people.add(p);
                refreshPeopleList();
            }
        });

        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int personNumber = listPeople.getSelectedIndex();
                if (personNumber >= 0) {
                    Person p = people.get(personNumber);
                    p.setName(textName.getText());
                    p.setEmail(textEmail.getText());
                    p.setPhoneNumber(textPhoneNumber.getText());
                    p.setAddress(textAddress.getText());
                    p.setDateOfBirth(textDateBirth.getText());
                    refreshPeopleList();
                }
            }
        });

        listPeople.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int personNumber = listPeople.getSelectedIndex();
                if (personNumber >= 0){
                    Person p = people.get(personNumber);
                    textName.setText(p.getName());
                    textEmail.setText(p.getEmail());
                    textPhoneNumber.setText(p.getPhoneNumber());
                    textAddress.setText(p.getAddress());
                    textDateBirth.setText(p.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    JLabelAge.setText(Integer.toString(p.getAge()) + " lat / lata");
                    buttonSave.setEnabled(true);
                }
                else {buttonSave.setEnabled(false);}
            }
        });
    }

    public void refreshPeopleList(){
        listPeopleModel.removeAllElements();
        System.out.println("Usunięto wszystkie osoby z listy");
        for (Person p: people) {
            System.out.println("Dodanie osoby do listy: " + p.getName());
            listPeopleModel.addElement(p.getName());
        }
    }

    public void addPerson(Person p){
        people.add(p);
        refreshPeopleList();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Jan Kowalski", "jkowalski@przyklad.com","123 123 123","Pigonia 1, Rzeszow","01/01/2001");
        Person person2 = new Person("Marian Nowak", "mnowak@przyklad.com","321 321 321","Pigonia 2, Rzeszow","02/02/2002");
        Person person3 = new Person("Janina Urban", "jurban@przyklad.com","132 132 132","Pigonia 3, Rzeszow","03/03/2003");

        SwingApp swingApp = new SwingApp();

        swingApp.addPerson(person1);
        swingApp.addPerson(person2);
        swingApp.addPerson(person3);

        swingApp.setVisible(true);
    }
}
