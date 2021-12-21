package com.company.Lab6.Zad1;

public class SrodkiTransportu
{
    public static void main(String[] args)
    {
        Samolot samolot1 = new Samolot(250000);
        Statek statek1 = new Statek(70000);
        samolot1.lec();
        statek1.plyn();
    }
}
