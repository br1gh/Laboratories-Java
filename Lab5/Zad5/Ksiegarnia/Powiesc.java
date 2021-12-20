package com.company.Lab5.Zad5.Ksiegarnia;

public class Powiesc extends Ksiazka
{
    int rok_akcji;

    public int getRok_akcji()
    {
        return rok_akcji;
    }

    public Powiesc(String tytul, int liczba_stron, int rok_akcji)
    {
        super(tytul, liczba_stron);
        this.rok_akcji = rok_akcji;
    }

    public Powiesc(String tytul, int rok_akcji)
    {
        super(tytul);
        this.rok_akcji = rok_akcji;
    }

    public Powiesc(int liczba_stron, int rok_akcji)
    {
        super(liczba_stron);
        this.rok_akcji = rok_akcji;
    }

    public Powiesc(int rok_akcji)
    {
        this.rok_akcji = rok_akcji;
    }

    public Powiesc()
    {
        super();
    }
}
