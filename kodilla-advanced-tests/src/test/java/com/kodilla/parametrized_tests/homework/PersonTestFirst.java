package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonTestFirst {

    static Stream<Arguments> provideIncorrectIntsForTestingBMI() {
        return Stream.of(
                Arguments.of(-1.70, -40.0),
                Arguments.of(0.0, -30.0),
                Arguments.of(-1.0, 4565445.0),
                Arguments.of(5, 0.0)
        );
    }

    static Stream<Arguments> provideIntsForTestingBMIBelow15() {
        return Stream.of(
                Arguments.of(1.70, 40.0),
                Arguments.of(1.80, 30.0)
        );
    }

    static Stream<Arguments> provideIntsForTestingBMIBetween15And16() {
        return Stream.of(
                Arguments.of(1.70, 45.0),
                Arguments.of(1.60, 40.0)
        );
    }

    static Stream<Arguments> provideIntsForTestingBMIBetween16And18_5() {
        return Stream.of(
                Arguments.of(1.70, 50.0),
                Arguments.of(1.60, 45.0)
        );
    }

    static Stream<Arguments> provideIntsForTestingBMIBetween18_5And25() {
        return Stream.of(
                Arguments.of(1.70, 60.0),
                Arguments.of(1.80, 80.9),
                Arguments.of(1.60, 50.0)
        );
    }

    static Stream<Arguments> provideIntsForTestingBMIBetween25And30() {
        return Stream.of(
                Arguments.of(1.70, 80.0),
                Arguments.of(1.60, 70.0)
        );
    }

    static Stream<Arguments> provideIntsForTestingBMIBetween30And35() {
        return Stream.of(
                Arguments.of(1.70, 90.0),
                Arguments.of(1.60, 80.0)
        );
    }

    static Stream<Arguments> provideIntsForTestingBMIBetween35And40() {
        return Stream.of(
                Arguments.of(1.70, 105.0),
                Arguments.of(1.60, 100.0)
        );
    }

    static Stream<Arguments> provideIntsForTestingBMIBetween40And45() {
        return Stream.of(
                Arguments.of(1.70, 120.0),
                Arguments.of(1.60, 115.0)
        );
    }

    static Stream<Arguments> provideIntsForTestingBMIBetween45And50() {
        return Stream.of(
                Arguments.of(1.70, 135.0),
                Arguments.of(1.60, 125.0)
        );
    }

    static Stream<Arguments> provideIntsForTestingBMIBetween50And60() {
        return Stream.of(
                Arguments.of(1.70, 150.0),
                Arguments.of(1.60, 140.0)
        );
    }

    static Stream<Arguments> provideIntsForTestingBMIAbove60() {
        return Stream.of(
                Arguments.of(1.70, 180.0),
                Arguments.of(1.70, 333.0),
                Arguments.of(1.60, 160.0)
        );
    }
}