package com.kodilla.mockito.homework;

import java.util.ArrayList;
import java.util.List;

public class WeatherAlert {

    private Person person;

    public void addPerson(Person person) {
        this.persons.add(person);

    }

    private List<Person> persons = new ArrayList<>();


    public void sendNotification(Notification notification) {
        this.persons.forEach(person -> person.receive(notification));
    }

    public void addLocation(Location location) {
    }

    public void deleteAllLocations(Location location) {
        this.persons.remove(location);
    }

    public void removePerson(Person person) {
        this.persons.remove(person);
    }

    public void deleteLocation(Location location) {
        this.persons.remove(location);

    }

}