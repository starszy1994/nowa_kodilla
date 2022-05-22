package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mateusz Filip", new Teacher("Jan Kowalski")));
        students.add(new Student("Paweł Pawełek", new Teacher("Janek Jankowski")));
        students.add(new Student("Agata Agatkowska", null));
        students.add(new Student("Piotrek Piotrkowski", new Teacher("Nowak Nowakowski")));
        students.add(new Student("Marek Markowski", null));

        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Teacher: " + student.getTeacher().orElse(new Teacher("<undefinded>")).getName());
        }
    }
}