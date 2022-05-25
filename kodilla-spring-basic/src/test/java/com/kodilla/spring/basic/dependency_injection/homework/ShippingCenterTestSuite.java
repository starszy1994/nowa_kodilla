package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldReturnTrueIfPackageWeightSmallerThan30(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = applicationContext.getBean(DeliveryService.class);
        assertTrue(bean.deliverPackage("Wall Street 18", 25));
    }

    @Test
    public void shouldReturnFalseIfPackageWeightGreaterThan30() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = applicationContext.getBean(DeliveryService.class);
        assertFalse(bean.deliverPackage("Wall Street 18", 50));
    }

    @Test
    public void shouldReturnNotNullValue(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        assertNotNull(bean.fail("Wall Street 18"), "Package not delivered to: Wall Street 18");
        assertEquals(bean.fail("Wall Street 18"), "Package not delivered to: Wall Street 18");
        assertNotNull(bean.success("Wall Street 18"));
        assertEquals(bean.success("Wall Street 18"), "Package delivered to: Wall Street 18");
    }
}