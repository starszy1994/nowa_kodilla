package com.kodilla.basic_assertion;

import com.kodilla.abstracts.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator ();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        Assertions.assertEquals(13, sumResult);
    }
    @Test
    public void testSubstract () {
        Calculator calculator2 = new Calculator();
        int a = 5;
        int b = 8;
        int substractResult = calculator2.substract(a, b);
        Assertions.assertEquals(-3, substractResult);
    }
    @Test
    public void testSquredNegative () {
        Calculator calculator3 = new Calculator();
        double a = -5.0;
        double squaredResult = calculator3.squared(a);
        Assertions.assertEquals(25, squaredResult, 0.01);
    }
    @Test
    public void testSquaredZero() {
        Calculator calculator4 = new Calculator();
        double a = 0.0;
        double squaredResult = calculator4.squared(a);
        Assertions.assertEquals(0, squaredResult, 0.01);
    }
    @Test
    public void testSquaredPositive() {
        Calculator calculator5 = new Calculator();
        double a = 5.0;
        double squaredResult = calculator5.squared(a);
        Assertions.assertEquals(25, squaredResult, 0.01);
    }
}
