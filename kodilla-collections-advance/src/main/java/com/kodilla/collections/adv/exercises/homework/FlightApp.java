package com.kodilla.collections.adv.exercises.homework;

public class FlightApp {


    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        for (Flight flight : flightFinder.findFlightsFrom("Warsaw")) {
            System.out.println(flight);
        }
        System.out.println("---");
        for (Flight flight : flightFinder.findFlightsTo("Gdansk")) {
            System.out.println(flight);
        }
    }
}