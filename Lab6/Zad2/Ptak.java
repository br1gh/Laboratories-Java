package com.company.Lab6.Zad2;

public class Ptak implements Latanie {
    @Override
    public void lec()
    {
        System.out.println("Ptak leci");
    }

    @Override
    public void wyladuj()
    {
        System.out.println("Ptak ląduje");
    }
}
