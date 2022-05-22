package com.kodilla.abstracts.homework;

public class Square extends Shape{

    public double a;

    public Square(double a){
        this.a = a;
    }

    @Override
    double giveArea() {
        return a*a;
    }

    @Override
    double giveCircuit() {
        return 4*a;
    }
}
