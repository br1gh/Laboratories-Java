package com.company.Lab5.Zad4;

public class Samochod
{
    float predkosc;

    public Samochod(int predkosc)
    {
        this.predkosc = predkosc;
    }

    public Samochod()
    {
        predkosc = 0;
        System.out.println("Domyślną prędkością jest 0");
    }

    void przyspiesz(int x) throws MyException
    {
        if (predkosc + x < 0)
            throw new ArithmeticException("Nie da się mieć ujemnej prędkości");
        else
            predkosc += x;
    }

    public static void main(String[] args) throws MyException
    {
        Ciezarowy s1 = new Ciezarowy(25);
        System.out.println(s1.predkosc);
        s1.przyspiesz(-2);
        System.out.println(s1.predkosc);
    }
}
