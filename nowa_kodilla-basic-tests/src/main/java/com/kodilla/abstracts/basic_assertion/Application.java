package com.kodilla.abstracts.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie!");
        } else {
            System.out.println("Metoda sum nie działa poprawnie!");
        }
        int substractresult = calculator.substract(a, b);
        boolean correct2 = ResultChecker.assertEquals(-3, substractresult);
        if (correct) {
            System.out.println("Metoda substract działa poprawnie!");
        } else {
            System.out.println("Metoda substract nie działa poprawnie");
        }
        int squaredResult = (int) calculator.squared(a);
        boolean correct3 = ResultChecker.assertEquals(25, squaredResult);
        if (correct) {
            System.out.println("Metoda squared działa poprawnie!");
        } else {
            System.out.println("Metoda squared nie działa poprawnie!");
        }
    }
}
