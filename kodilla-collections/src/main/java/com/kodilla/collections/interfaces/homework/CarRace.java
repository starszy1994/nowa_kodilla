package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(120);
        ford.getSpeed();
        ford.increaseSpeed();
        ford.decreaseSpeed();
        doRace(ford);

        Opel opel = new Opel (90);
        opel.getSpeed();
        opel.increaseSpeed();
        opel.decreaseSpeed();
        doRace(opel);

        Mazda mazda = new Mazda (105);
        mazda.getSpeed();
        mazda.increaseSpeed();
        mazda.decreaseSpeed();
        doRace(mazda);
    }
    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}