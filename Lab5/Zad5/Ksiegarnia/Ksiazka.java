package com.company.Lab5.Zad5.Ksiegarnia;

public class Ksiazka
{
    String tytul;
    int liczba_stron;

    public Ksiazka(String tytul, int liczba_stron)
    {
        this(tytul);
        this.liczba_stron = liczba_stron;
    }

    public Ksiazka(String tytul)
    {
        this.tytul = tytul;
    }

    public Ksiazka(int liczba_stron)
    {
        this.liczba_stron = liczba_stron;
    }

    public Ksiazka()
    {
    }
}
