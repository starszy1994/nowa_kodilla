package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    static List<Flight> flightsTable;

    public static List<Flight> getFlightsTable() {
        flightsTable = new ArrayList<>();
        flightsTable.add(new Flight("Warsaw", "Eindhoven"));
        flightsTable.add(new Flight("Madrid", "Dortmund"));
        flightsTable.add(new Flight("Berlin", "Warsaw"));
        flightsTable.add(new Flight("Warsaw", "Gdansk"));
        flightsTable.add(new Flight("Paris", "Madrid"));
        return flightsTable;
    }
}