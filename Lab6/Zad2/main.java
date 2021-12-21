package com.company.Lab6.Zad2;

public class main
{
    public static void main(String[] args)
    {
        Wieloryb w1 = new Wieloryb();
        w1.plyn();
        w1.zanurz();
        w1.wynurz();

        Ptak p1 = new Ptak();
        p1.lec();
        p1.wyladuj();

        //Ryba r1 = new Ryba();
        //Nie można utworzyć instancji klasy ryba, ponieważ jest ona klasą abstrakcyjną.
    }
}
