package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private final double orderValue;
    private final LocalDate orderDate;
    private final String login;

    public Order(double orderValue, LocalDate orderDate, String login) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.login = login;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getLogin() {
        return login;
    }
}