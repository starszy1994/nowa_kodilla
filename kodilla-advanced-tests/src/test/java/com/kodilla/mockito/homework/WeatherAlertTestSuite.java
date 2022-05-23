package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherAlertTestSuite {

    WeatherAlert weatherAlert = new WeatherAlert();
    Person person = Mockito.mock(Person.class);
    Notification notification = Mockito.mock(Notification.class);
    Location location = Mockito.mock(Location.class);

    //osoba może zapisać się do danej lokalizacji i otrzymywać subskrypcje
    @Test
    public void personCanJoinInAndReceiveNotification() {
        weatherAlert.addPerson(person);
        weatherAlert.addLocation(location);
        weatherAlert.sendNotification(notification);
        Mockito.verify(person, Mockito.times(1)).receive(notification);
    }

    //osoba może anulować subskrypcję z danej lokalizacji
    @Test
    public void personCanDeleteLocationSubscripction() {
        weatherAlert.sendNotification(notification);
        weatherAlert.addLocation(location);
        Mockito.verify(person, Mockito.never()).receive(notification);
    }

    //osoba może usunąc wszystkie lokalizacje i anulować subskrypcję
    @Test
    public void personCanDeleteAllLocationAndStopSubscription() {
        weatherAlert.deleteAllLocations(location);
        weatherAlert.removePerson(person);
        weatherAlert.sendNotification(notification);
        Mockito.verify(person, Mockito.never()).receive(notification);
    }

    //powiadomienie dla danej lokalizacji tylko do wybranych osób
    @Test
    public void shouldSpecificGroupOfPersonGetNotification() {
        weatherAlert.addPerson(person);
        weatherAlert.addLocation(location);
        weatherAlert.sendNotification(notification);
        Mockito.verify(person, Mockito.times(1)).receive(notification);
    }

    //powiadomienie dla wszystklich osób
    @Test
    public void shouldAllPersonGetNotification() {
        Person firstPerson = Mockito.mock(Person.class);
        Person secondPerson = Mockito.mock(Person.class);
        Person thirdPerson = Mockito.mock(Person.class);
        Person fourthPerson = Mockito.mock(Person.class);
        Person fifthPerson = Mockito.mock(Person.class);
        weatherAlert.addPerson(firstPerson);
        weatherAlert.addPerson(secondPerson);
        weatherAlert.addPerson(thirdPerson);
        weatherAlert.addPerson(fourthPerson);
        weatherAlert.addPerson(fifthPerson);

        weatherAlert.sendNotification(notification);
        Mockito.verify(firstPerson, Mockito.times(1)).receive(notification);
        Mockito.verify(secondPerson, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdPerson, Mockito.times(1)).receive(notification);
        Mockito.verify(fourthPerson, Mockito.times(1)).receive(notification);
        Mockito.verify(fifthPerson, Mockito.times(1)).receive(notification);
    }

    //kasowanie danej lokalizacji
    @Test
    public void shouldDeleteCurrentLocation() {
        weatherAlert.deleteLocation(location);
        weatherAlert.sendNotification(notification);
        Mockito.verify(person, Mockito.never()).receive(notification);
    }
}