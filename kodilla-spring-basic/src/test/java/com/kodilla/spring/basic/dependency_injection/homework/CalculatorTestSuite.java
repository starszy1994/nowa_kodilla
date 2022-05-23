package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldAddTwoNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(2.0, 8.0);
        assertEquals(10.0, result, 0.01);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(2.0, 8.0);
        assertEquals(-6.0, result, 0.01);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(2.0, 8.0);
        assertEquals(16.0, result, 0.01);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(2.0, 8.0);
        assertEquals(0.25, result, 0.01);
    }
}