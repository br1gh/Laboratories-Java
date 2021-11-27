package com.company.Lab2.src.com.company;
public class MojaKlasa {
    int a,b;
    String name;
    double c;
    //alt + insert

    public MojaKlasa() {
    }

    public MojaKlasa(int a, int b, String name, double c) {
        this.a = a;
        this.b = b;
        this.name = name;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
