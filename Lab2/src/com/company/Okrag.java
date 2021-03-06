package com.company.Lab2.src.com.company;
public class Okrag {
    Punkt srodek;
    int promien;

    public Okrag() {
        this.promien =  10;
        this.srodek = new Punkt(5,5);
    }

    public Okrag(Punkt srodek, int promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public Okrag(Punkt srodek, double srednica) {
        this.srodek = srodek;
        this.promien = (int)(srednica/2);
    }

    public double getPowierzchnia() {
        return Math.PI*Math.pow(this.promien,2);
    }

    public double getSrednica() {
        return 2*this.promien;
    }

    public double getPromien() {
        return this.promien;
    }

    public boolean wSrodku(Punkt punkcik){
        return Math.pow(punkcik.x - srodek.x,2) + Math.pow(punkcik.y - srodek.y,2) < Math.pow(promien,2);
    }
    public static void opiany(Rectangle rect)
    {
        Punkt p1 = new Punkt(0,0);
        Okrag oo = new Okrag(p1,rect.Diagonal());
    }

    public static void wpiany(Rectangle rect)
    {
        Punkt p2 = new Punkt(0,0);
        Okrag oo = new Okrag(p2, (int)(rect.height/2));
    }
}
