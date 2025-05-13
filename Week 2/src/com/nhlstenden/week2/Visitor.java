package com.nhlstenden.week2;

import java.util.ArrayList;
import java.util.List;

public class Visitor
{
    private String name;
    private List<Order> orders;

    public Visitor(String name)
    {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Order> getOrders()
    {
        return orders;
    }

    public void setOrders(List<Order> orders)
    {
        this.orders = orders;
    }

    public void placeOrder(Order order)
    {
        orders.add(order);
    }

    public void provideFeedback(Order order, String feedback)
    {
        order.setFeedback(feedback);
    }
}
