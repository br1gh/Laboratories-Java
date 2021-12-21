package com.company.Lab6.Zad2;

public abstract class Ryba extends Zwierze implements Plywanie
{
    void jedz()
    {
        System.out.println("Ryba gatunku " + gatunek + " obecnie je" );
    }

    void wydalaj()
    {
        System.out.println("Ryba gatunku " + gatunek + " obecnie wydala" );
    }

    @Override
    public String gatunek()
    {
        return "Ssak";
    }

    public Ryba()
    {
    }

    @Override
    public void plyn()
    {
        System.out.println("Ryba gatunku " + gatunek + " obecnie płynie" );
    }

    @Override
    public void wynurz()
    {
        System.out.println("Ryba gatunku " + gatunek + " obecnie wynarza się" );
    }

    @Override
    public void zanurz()
    {
        System.out.println("Ryba gatunku " + gatunek + " obecnie wydala" );
    }
}
