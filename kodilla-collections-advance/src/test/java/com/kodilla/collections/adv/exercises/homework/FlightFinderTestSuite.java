package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void doesAddTheRightFlights() {  // czy dodaje prawdziwe loty
        //when
        FlightRepository.getFlightsTable();
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("Warsaw", "Eindhoven"));
        expectedFlights.add(new Flight("Madrid", "Dortmund"));
        expectedFlights.add(new Flight("Berlin", "Warsaw"));
        expectedFlights.add(new Flight("Warsaw", "Gdansk"));
        expectedFlights.add(new Flight("Paris", "Madrid"));
        assertEquals(expectedFlights, FlightRepository.getFlightsTable());
    }

    @Test
    public void doesFindDepartures() { // czy znajduje wyloty
        //when
        List <Flight> result = FlightFinder.findFlightsFrom("Warsaw");
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("Warsaw", "Eindhoven"));
        expectedFlights.add(new Flight("Warsaw", "Gdansk"));
        assertEquals(expectedFlights, FlightFinder.findFlightsFrom("Warsaw"));
    }

    @Test
    public void doesFindArrivals() { // czy znajduje przyloty
        //when
        List <Flight> result = FlightFinder.findFlightsTo("Dortmund");
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("Madrid", "Dortmund"));
        assertEquals(expectedFlights, FlightFinder.findFlightsTo("Dortmund"));
    }

    @Test
    public void doesFailToReturnIfNothingFound() { // nie zwraca jeśli nie znaleziono
        //when
        List <Flight> resultDep = FlightFinder.findFlightsFrom("New Yprk");
        List <Flight> resultArr = FlightFinder.findFlightsTo("New York");
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        assertEquals(expectedFlights, resultDep);
        assertEquals(expectedFlights, resultArr);
    }
}