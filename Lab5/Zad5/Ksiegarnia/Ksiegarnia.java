package com.company.Lab5.Zad5.Ksiegarnia;

public class Ksiegarnia
{
    Klient klient1 = new Klient();
    Klient klient2 = new Klient("Nowak");
    Klient klient3 = new Klient("Jan","Kowalski");

    Ksiazka ksiazka1 = new Ksiazka("Harry Potter", 500);
    Powiesc powiesc1 = new Powiesc("Potop",1000,1655);
    Podrecznik podrecznik1 = new Podrecznik("Chemia dla studenta",100,"Chemia");

    public static void main(String[] args)
    {
        Ksiegarnia ksiegarnia1 = new Ksiegarnia();
        System.out.println(ksiegarnia1.powiesc1.getRok_akcji());
        System.out.println(ksiegarnia1.podrecznik1.getPrzedmiot());
    }
}
