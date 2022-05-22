package com.kodilla.exception.homework;

import com.kodilla.exception.AirportRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testIsOrderInSystem() throws OrderDoesntExistException {
        // when
        Order order = new Order("22022");
        // given
        Warehouse.addOrder(order);
        // then
        assertEquals(Warehouse.getOrder("22022").getNumber(), "22022");
    }

    @Test
    public void testIsOrderInSystem_withException() {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        // then
        assertThrows(OrderDoesntExistException.class, () -> Warehouse.getOrder("abcd"));
    }

}