package com.company.Lab2.src.com.company;
public class Rectangle {
    double width,height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double Area(){
        return this.width*this.height;
    }
    public double Circuit(){
        return 2*this.width+2*this.height;
    }

    public double Diagonal(){
        return Math.sqrt(Math.pow(this.width,2)+Math.pow(this.height,2));
    }
}
