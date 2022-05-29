package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void shouldCreateDifferentClocksWithDifferentTimes () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstClock = context.getBean(Clock.class);
        Clock secondClock = context.getBean(Clock.class);
        Clock thirdClock = context.getBean(Clock.class);
        assertNotEquals(firstClock, secondClock);
        assertNotEquals(firstClock, thirdClock);
        assertNotEquals(secondClock, thirdClock);
    }
}