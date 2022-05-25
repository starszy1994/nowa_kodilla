package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car {

    private LocalTime chosenTime = LocalTime.of(0, 0);


    @Override
    public boolean hasHeadLightsTurnedOn() {
        if (chosenTime.isAfter(LocalTime.of(0, 0)) && chosenTime.isBefore(LocalTime.of(6, 0)) || chosenTime.equals(LocalTime.of(0, 0))) {
            System.out.println("Lights are turned on");
            return true;
        } else if (chosenTime.isAfter(LocalTime.of(6, 1)) && chosenTime.isBefore(LocalTime.of(20, 0))) {
            System.out.println("Lights are turned off");
            return false;
        } else if (chosenTime.isAfter(LocalTime.of(20, 1)) && chosenTime.isBefore(LocalTime.of(23, 59))) {
            System.out.println("Lights are turned on");
            return true;
        }
        return false;
    }


    @Override
    public String getCarType() {
        return "SUV";
    }

    @Override
    public void setChosenTime(LocalTime chosenTime) {
        this.chosenTime = chosenTime;
    }
}
