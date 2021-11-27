package com.company.Lab2.src.com.company;
public class MyNumber {
    double a;

    public MyNumber(double a) {
        this.a = a;
    }

    public boolean isOdd() {
        return this.a % 2 != 0;
    }

    public boolean isEven() {
        return this.a % 2 == 0;
    }

    public double sqrt(){
        return Math.sqrt(this.a);
    }

    public double pow(int x){
        return Math.pow(this.a,x);
    }

    public double add(MyNumber x){
        return this.a + x.a;
    }

    public double subtract(MyNumber x){
        return this.a - x.a;
    }
}