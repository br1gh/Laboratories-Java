package com.company.Lab4.src.com.company;

public class Main
{
    public static void main(String[] args)
    {
        Punkt p1 = new Punkt(1,1);
        Punkt p2 = new Punkt();

	    Okrag o1 = new Okrag();
	    Okrag o2 = new Okrag(p1,4);
	    Okrag o3 = new Okrag(p1,4.0);

        Prostokat pr1 = new Prostokat(5,5);
        Prostokat pr2 = new Prostokat(6,6);

        o1.wpisany(pr1);
        o1.opisany(pr2);

        System.out.println(o1.getPowierzchnia());
        System.out.println(o1.getSrednica());
        System.out.println(o1.getPromien());
        System.out.println(o1.wSrodku(p1));
        o1.opis();

        Figura f1 = new Figura(p1);
        f1.opis();
    }
}
