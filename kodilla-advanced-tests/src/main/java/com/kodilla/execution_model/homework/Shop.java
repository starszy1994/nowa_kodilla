package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.homework.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    public ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        if (order.getOrderValue() > 0)
            orders.add(order);
    }

    public List getOrdersFromTwoYears() {
        List<Order>  ordersNoOlderThanTwoYears = new ArrayList<>();
        for (int n = 0; n < orders.size(); n++)
            if (orders.get(n).getOrderDate().isAfter(LocalDate.now().minusYears(2))) {
                ordersNoOlderThanTwoYears.add(orders.get(n));
            }
        return ordersNoOlderThanTwoYears;
    }

    public List getMaxAndMinOrderValue(int maxOrderValue, int minOrderValue) {
        List<Order> maxAndMinOrderValue = new ArrayList<>();
        for (int n = 0; n < orders.size(); n++)
            if (orders.get(n).getOrderValue() >= minOrderValue & orders.get(n).getOrderValue() <= maxOrderValue) {
                maxAndMinOrderValue.add(orders.get(n));
            }
        return maxAndMinOrderValue;
    }

    public int getNumberOrders() {
        return orders.size();
    }

    public double getSumOrdersValue() {
        double sumOrders = 0;
        for (int n = 0; n < orders.size(); n++)
            sumOrders += orders.get(n).getOrderValue();
        return sumOrders;
    }
}