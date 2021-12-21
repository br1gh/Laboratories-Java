package com.company.Lab6.Zad1;

public class Samolot implements Lata
{
    int masa;

    public Samolot(int masa)
    {
        this.masa = masa;
    }

    @Override
    public void lec()
    {
        System.out.println("Samolot o masie " + masa + "kg zaczyna lecieć");
    }
}
