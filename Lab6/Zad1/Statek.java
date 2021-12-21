package com.company.Lab6.Zad1;

public class Statek implements Plywa
{
    int wypornosc;

    public Statek(int wypornosc)
    {
        this.wypornosc = wypornosc;
    }

    @Override
    public void plyn()
    {
        System.out.println("Statek o wypornosci " + wypornosc + "ton zaczyna płynąć");
    }
}
