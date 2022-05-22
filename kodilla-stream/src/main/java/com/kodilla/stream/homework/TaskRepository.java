
package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks(){
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Visit the doctor", LocalDate.of(2022, 4, 10), LocalDate.of(2022, 4, 10)));
        taskList.add(new Task("Buy new bike", LocalDate.of(2022, 4, 01), LocalDate.of(2022, 8, 31)));
        taskList.add(new Task("Make a new passport", LocalDate.of(2022, 3, 01), LocalDate.of(2030, 11, 15)));
        return taskList;
    }
}