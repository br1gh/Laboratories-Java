package com.company;
class Prostokat extends Figura
{
    int wys=0;
    int szer=0;

    Prostokat(int wys,int szer)
    {
        this.wys = wys;
        this.szer = szer;
    }

    public Prostokat(String kolor, int wys, int szer)
    {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }
}
