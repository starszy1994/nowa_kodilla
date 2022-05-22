package com.kodilla.abstracts.basic_assertion;

public class Calculator {

    public int sum(int a, int b) {
        return a+ b;
    }

    public int substract (int a, int b) {
        return a - b;
    }

    public double squared (double a) {
        return Math.pow(Double.valueOf(a), 2.0);
    }
}
