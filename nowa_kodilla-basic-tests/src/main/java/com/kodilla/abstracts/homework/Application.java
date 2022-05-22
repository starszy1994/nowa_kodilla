package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(4);
        System.out.println("Square area: " + square.giveArea());
        System.out.println("Square circuit: " + square.giveCircuit());

        Rectangle rectangle = new Rectangle(2.5, 5);
        System.out.println("Rectangle area: " + rectangle.giveArea());
        System.out.println("Rectangle circuit: " + rectangle.giveCircuit());

        Triangle triangle = new Triangle(2,4,6,3 );
        System.out.println("Triangle area: " + triangle.giveArea());
        System.out.println("Triangle circuit: " + triangle.giveCircuit());
    }
}
