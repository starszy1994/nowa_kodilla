package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {

    private static Set<Order> orderList = new HashSet<>();

    public static Order addOrder(Order order) {
        orderList.add(order);
        System.out.println("Order " + order);
        return order;
    }

    public static Order getOrder(String number) throws OrderDoesntExistException {
        System.out.println("Searching order number: " + number);
        return orderList
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .findFirst()
                .orElseThrow(() -> new OrderDoesntExistException());
    }

}