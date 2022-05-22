package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{

    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void increaseSpeed() {
        this.speed = speed * 4;
    }
    @Override
    public void decreaseSpeed() {
        this.speed = speed / 4;
    }

}