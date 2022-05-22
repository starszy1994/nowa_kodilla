package com.kodilla.collections.adv.immutable.homework;

public class TaskApplication {
    public static void main(String[] args) {
        Task task = new Task("The Shawshank Redemption", 142);
        System.out.println("The movie:" + " " + task.title + " " + "duration" + " " + task.getDuration() + " " + "minutes.");
    }
}