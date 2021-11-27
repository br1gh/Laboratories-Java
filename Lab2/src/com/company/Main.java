package com.company.Lab2.src.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Hello World!");
        MojaKlasa ob1 = new MojaKlasa();
        MojaKlasa ob2 = new MojaKlasa(2,4,"Hello",3.14);
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
        System.out.println(ob2.a + ob2.b + ob2.name+ob2.c);
        */

        System.out.println("\n Zad1: \n");

        Human os1 = new Human(21,80,180,"Oskar",true);
        Human os2 = new Human(21,50,165,"Sylwia",false);
        System.out.println(os1.getWeight());
        System.out.println(os1.getHeight());
        System.out.println(os1.getName());
        System.out.println(os1.isMale());
        System.out.println(os1.Age);

        System.out.println("\n Zad2: \n");

        Rectangle ob1 = new Rectangle(5,5);
        System.out.println(ob1.Area());
        System.out.println(ob1.Diagonal());
        System.out.println(ob1.Circuit());

        System.out.println("\n Zad3: \n");

        MyNumber num = new MyNumber(10);
        MyNumber num2 = new MyNumber(5);

        System.out.println(num.isOdd());
        System.out.println(num.isEven());
        System.out.println(num.sqrt());
        System.out.println(num.pow(2));
        System.out.println(num.add(num2));
        System.out.println(num.subtract(num2));

        Okrag okrag1 = new Okrag();
    }
}
