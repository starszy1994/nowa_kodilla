package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse.addOrder(new Order("12022"));
        Warehouse.addOrder(new Order("22022"));
        Warehouse.addOrder(new Order("32022"));
        Warehouse.addOrder(new Order("42022"));

        try {
            Warehouse.getOrder("abcd");
            throw new OrderDoesntExistException();
        } catch (OrderDoesntExistException e) {
            System.out.println("Order not found. Try again");
        }
    }
}
