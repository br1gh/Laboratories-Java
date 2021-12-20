package com.company.Lab5.Zad5.Ksiegarnia;

public class Klient
{
    String imie;
    String nazwisko;

    public Klient(String imie, String nazwisko)
    {
        this(nazwisko);
        this.imie = imie;
    }

    public Klient(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }
    public Klient()
    {
    }
}
