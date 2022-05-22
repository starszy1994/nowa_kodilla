package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle (double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    double giveArea() {
        return a*h/2;
    }

    @Override
    double giveCircuit() {
        return a+b+c;
    }
}
