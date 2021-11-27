package com.company.Lab4.src.zad2;

import java.util.Random;

public class Taxi extends Auto
{
    public static void main(String[] args)
    {
        Taxi a1 = new Taxi();
        System.out.println("Sredni przebieg: " + a1.srPrzebieg() + "\nSrednie zarobki: "+ a1.srZarobki());
    }

    float[] zarobki = new float[12];
    public Taxi()
    {
        super();
        Random rand = new Random();
        for (int i = 0; i < 12; i++)
            zarobki[i] = rand.nextFloat() * (10000 - 0) + 0; // 0-10000 (float)
    }

    public float srZarobki()
    {
        float suma = 0;
        for (float i: zarobki)
            suma += i;
        return suma/12;
    }
}
