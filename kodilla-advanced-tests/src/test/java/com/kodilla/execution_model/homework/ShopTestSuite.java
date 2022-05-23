package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order firstOrder = new Order(2500, LocalDate.of(2022, 4, 1), "Pepsi123");
    Order seconfOrder = new Order(10000, LocalDate.of(2022, 4, 5), "Tymbark1Poland");
    Order thirdOrder = new Order(100, LocalDate.of(2022, 4, 8), "VodkaBols");
    Order fourthOrder = new Order(12500, LocalDate.of(2010, 11, 23), "Heineken5445");
    Order fifthOrder = new Order(1232, LocalDate.of(2020, 1, 1), "CocaColaCoca");
    Order sixthOrder = new Order(200000, LocalDate.of(2021, 6, 25), "Fanta123!");
    Order seventhOrder = new Order(10, LocalDate.of(2018, 2, 2), "OranzadaHelenaPolska");

    @Test
    public void shouldAddOrderToList() {
        shop.addOrder(firstOrder);
        shop.addOrder(sixthOrder);
        assertEquals(2, shop.getNumberOrders());
    }

    @Test
    public void shouldReturnOrdersFromTwoYears() {
        shop.addOrder(firstOrder);
        shop.addOrder(seconfOrder);
        shop.addOrder(thirdOrder);
        shop.addOrder(fourthOrder);
        shop.addOrder(fifthOrder);
        shop.addOrder(sixthOrder);
        shop.addOrder(seventhOrder);
        assertEquals(4, shop.getOrdersFromTwoYears().size());
    }

    @Test
    public void shouldReturnMaxAndMinOrderValue() {
        shop.addOrder(firstOrder);
        shop.addOrder(seconfOrder);
        shop.addOrder(thirdOrder);
        shop.addOrder(fourthOrder);
        shop.addOrder(fifthOrder);
        shop.addOrder(sixthOrder);
        shop.addOrder(seventhOrder);
        assertEquals(7, shop.getMaxAndMinOrderValue(200000, 10).size());
    }

    @Test
    public void shouldReturnNumberOrders() {
        shop.addOrder(firstOrder);
        shop.addOrder(seconfOrder);
        shop.addOrder(thirdOrder);
        shop.addOrder(fourthOrder);
        shop.addOrder(fifthOrder);
        shop.addOrder(sixthOrder);
        shop.addOrder(seventhOrder);
        assertEquals(7, shop.getNumberOrders());
    }

    @Test
    public void shouldReturnAllOrdersValue() {
        shop.addOrder(firstOrder);
        shop.addOrder(seconfOrder);
        shop.addOrder(thirdOrder);
        shop.addOrder(fourthOrder);
        shop.addOrder(fifthOrder);
        shop.addOrder(sixthOrder);
        shop.addOrder(seventhOrder);
        assertEquals(226342, shop.getSumOrdersValue());

    }

}