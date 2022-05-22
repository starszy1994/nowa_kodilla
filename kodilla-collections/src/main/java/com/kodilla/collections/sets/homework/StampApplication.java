package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Pope", 3.0, 2.5, true));
        stamps.add(new Stamp("Maradona", 2.8, 2.4, true));
        stamps.add(new Stamp("Max Vesrtappen", 3.2, 2.2, false));
        stamps.add(new Stamp("Maradona", 2.8, 2.4, true));
        stamps.add(new Stamp("Krzysztof Kolumb", 2.6, 2.6, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
