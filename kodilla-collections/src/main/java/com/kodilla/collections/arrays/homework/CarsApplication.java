package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Mazda;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for ( Car car : cars)
            CarUtils.describeCar(car);
    }
    private static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int a = random.nextInt(150);
        int b = random.nextInt(150);
        int c = random.nextInt(150);
        if (drawnCarKind == 0)
            return new Ford(a);
        else if (drawnCarKind == 1)
            return new Opel(b);
        else
            return new Mazda(c);
    }
}