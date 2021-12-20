package com.company.Lab5.Zad5.Ksiegarnia;

public class Podrecznik extends Ksiazka
{
    String przedmiot;

    public String getPrzedmiot()
    {
        return przedmiot;
    }

    public Podrecznik(String tytul, int liczba_stron, String przedmiot)
    {
        super(tytul, liczba_stron);
        this.przedmiot = przedmiot;
    }

    public Podrecznik(String tytul,  String przedmiot)
    {
        super(tytul);
        this.przedmiot = przedmiot;
    }

    public Podrecznik(int liczba_stron,  String przedmiot)
    {
        super(liczba_stron);
        this.przedmiot = przedmiot;
    }

    public Podrecznik(String przedmiot)
    {
        this.przedmiot = przedmiot;
    }

    public Podrecznik()
    {
        super();
    }
}
