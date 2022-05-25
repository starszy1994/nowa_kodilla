package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {

    public boolean hasHeadLightsTurnedOn();

    public String getCarType();

    public void setChosenTime(LocalTime chosenTime);
}
