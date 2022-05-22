package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolMap = new HashMap<>();
        Principal hopkins = new Principal("Anthony", "Hopkins");
        Principal murray = new Principal("Less", "Murray");
        Principal brown = new Principal("Andy", "Brown");
        Principal markowsky = new Principal("John", "Markowsky");

        School hopkinsSchool = new School("School no. 2 in New York", 28, 25, 30, 22);
        School murraySchool = new School("School no. 10 in New Jersey", 23, 25, 27, 29);
        School brownSchool = new School("School no. 7 in Boston", 18, 15, 22, 19);
        School markowskySchool = new School("School no. 1 in California", 34, 29, 35, 38);

        schoolMap.put(hopkins, hopkinsSchool);
        schoolMap.put(murray, murraySchool);
        schoolMap.put(brown, brownSchool);
        schoolMap.put(markowsky, markowskySchool);

        for (Map.Entry<Principal, School> schoolEntry : schoolMap.entrySet()) {
            System.out.println("Principal and school: " + schoolEntry.getKey().getFirstname() + " " + schoolEntry.getKey().getLastname() + " " + schoolEntry.getValue().getSchoolName() + ", number of student: " + schoolEntry.getValue().getSum());
        }
    }

}