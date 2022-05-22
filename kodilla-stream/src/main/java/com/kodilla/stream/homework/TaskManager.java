
package com.kodilla.stream.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> undoneTasks = new ArrayList<>();
        TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline().isAfter(LocalDate.now()))
                .map(Task::getDeadline)
                .collect(Collectors.toList())
                .forEach(un -> System.out.println("Uncompleted task deadline: " + un));
    }
}