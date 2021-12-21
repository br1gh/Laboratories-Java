package com.company.Lab6.Zad2;

public class Wieloryb implements Plywanie
{
    @Override
    public void plyn()
    {
        System.out.println("Wieloryb plywa");
    }

    @Override
    public void wynurz()
    {
        System.out.println("Wieloryb wynurza się");
    }

    @Override
    public void zanurz()
    {
        System.out.println("Wieloryb zanurza się");
    }
}
