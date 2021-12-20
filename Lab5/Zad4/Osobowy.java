package com.company.Lab5.Zad4;

public class Osobowy extends Samochod
{
    static final float predkosc_max = 250;

    public Osobowy(int predkosc)
    {
        super(predkosc);
    }

    void przyspiesz(int x) throws MyException
    {
        if (x % 2 == 0)
        {
            if (x == 0)
                throw new ArithmeticException("Dzielenie przez 0");
            if (predkosc_max/x < 0)
                throw new ArithmeticException("Nie da się mieć ujemnej prędkości");
            else
                predkosc=predkosc_max/x;
        }
        else
        {
            if (predkosc + x <= predkosc_max)
                super.przyspiesz(x);
            else
                throw new MyException("Nie da się przekroczyć maksymalnej prędkości");
        }
    }
}
