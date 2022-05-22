package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> school = new ArrayList<>();
    private String schoolName;

    public School( String schoolName, Integer... school) {
        for (Integer numberOfStudents : school)
            this.school.add(numberOfStudents);
        this.schoolName = schoolName;
    }

    public int getSum() {
        int sum = 0;
        for (int numberOfStudents : school)
            sum += numberOfStudents;
        return sum;
    }
    public String getSchoolName() {
        return schoolName;
    }
}