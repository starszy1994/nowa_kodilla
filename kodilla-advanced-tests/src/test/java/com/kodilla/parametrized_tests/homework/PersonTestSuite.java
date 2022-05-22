package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonTestFirst#provideIntsForTestingBMIBelow15")
    public void testPeopleBelowBMI15 (double input, double input2) {
        Person person = new Person(input, input2);
        assertEquals("Very severely underweight", person.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonTestFirst#provideIntsForTestingBMIBetween15And16")
    public void testPeopleWithBMIBetween15And16 (double input, double input2) {
        Person person = new Person(input, input2);
        assertEquals("Severely underweight", person.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonTestFirst#provideIntsForTestingBMIBetween16And18_5")
    public void testPeopleWithBMIBetween16And18_5 (double input, double input2) {
        Person person = new Person(input, input2);
        assertEquals("Underweight", person.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonTestFirst#provideIntsForTestingBMIBetween18_5And25")
    public void testPeopleWithBMIBetween18_5And25 (double input, double input2) {
        Person person = new Person(input, input2);
        assertEquals("Normal (healthy weight)", person.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonTestFirst#provideIntsForTestingBMIBetween25And30")
    public void testPeopleWithBMIBetween25And30 (double input, double input2) {
        Person person = new Person(input, input2);
        assertEquals("Overweight", person.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonTestFirst#provideIntsForTestingBMIBetween30And35")
    public void testPeopleWithBMIBetween30And35 (double input, double input2) {
        Person person = new Person(input, input2);
        assertEquals("Obese Class I (Moderately obese)", person.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonTestFirst#provideIntsForTestingBMIBetween35And40")
    public void testPeopleWithBMIBetween35And40 (double input, double input2) {
        Person person = new Person(input, input2);
        assertEquals("Obese Class II (Severely obese)", person.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonTestFirst#provideIntsForTestingBMIBetween40And45")
    public void testPeopleWithBMIBetween40And45 (double input, double input2) {
        Person person = new Person(input, input2);
        assertEquals("Obese Class III (Very severely obese)", person.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonTestFirst#provideIntsForTestingBMIBetween45And50")
    public void testPeopleWithBMIBetween45And50 (double input, double input2) {
        Person person = new Person(input, input2);
        assertEquals("Obese Class IV (Morbidly Obese)", person.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonTestFirst#provideIntsForTestingBMIBetween50And60")
    public void testPeopleWithBMIBetween50And60 (double input, double input2) {
        Person person = new Person(input, input2);
        assertEquals("Obese Class V (Super Obese)", person.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonTestFirst#provideIntsForTestingBMIAbove60")
    public void testPeopleWithBMIAbove60 (double input, double input2) {
        Person person = new Person(input, input2);
        assertEquals("Obese Class VI (Hyper Obese)", person.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonTestFirst#provideIncorrectIntsForTestingBMI")
    public void testValuesOutsideRange (double input, double input2) {
        Person person = new Person(input, input2);
        assertEquals("Improper weight or height given", person.getBMI());
    }
}