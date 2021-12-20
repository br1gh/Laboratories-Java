package com.company.Lab5.Zad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public void pieriwastek()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        try
        {
            double a = in.nextDouble();
            if (a < 0)
                throw new java.lang.IllegalArgumentException("Podałeś liczbę ujemną");
            else
                System.out.println(Math.sqrt(a));
        }
        catch(Exception ex)
        {
            System.out.println("To nie jest liczba");
        }
    }

    public static void main(String[] args)
    {
        main ob1 = new main();
        ob1.pieriwastek();
    }
}
