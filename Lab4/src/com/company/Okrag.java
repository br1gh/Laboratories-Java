package com.company;

public class Okrag extends Figura
{
    Punkt srodek = new Punkt();
    int promien;

    public Okrag()
    {
        srodek.x = 0;
        srodek.y = 0;
        promien = 5;
    }

    public Okrag(Punkt srodek, int promien)
    {
        super(srodek);
        this.promien = promien;
    }

    public Okrag(Punkt srodek, double srednica)
    {
        super(srodek);
        promien = (int)(srednica/2);
    }

    public double getPowierzchnia()
    {
        return 2*Math.PI*promien;
    }

    public int getPromien()
    {
        return promien;
    }
    public double getSrednica()
    {
        return 2*promien;
    }
    public boolean wSrodku(Punkt pkt)
    {
        return Math.pow(pkt.x - srodek.x,2) + Math.pow(pkt.y - srodek.y,2) < Math.pow(promien,2);
    }

    public static void opisany(Prostokat rect)
    {
        Okrag oo1 = new Okrag();
        rect.punkt.x = oo1.punkt.x;
        rect.punkt.y = oo1.punkt.y;
    }

    public static void wpisany(Prostokat rect)
    {
        Okrag ow1 = new Okrag();
        rect.punkt.x = ow1.punkt.x;
        rect.punkt.y = ow1.punkt.y;
    }

    void opis()
    {
        System.out.println("Okrag o srodku x: " + srodek.x + ", y: " + srodek.y + ", promieniu: " + promien);
    }
}