package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(120));
        cars.add(new Opel(90));
        cars.add(new Mazda(105));

        Ford ford = new Ford(120);

        cars.remove(0);
        cars.remove(ford);
        System.out.println(cars.size());

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
