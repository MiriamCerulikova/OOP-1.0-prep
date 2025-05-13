package com.nhlstenden.week2;

import java.util.ArrayList;
import java.util.List;

public class FoodTruck
{
    private String name;
    private List<Dish> menu;
    private List<Order> orders;

    public FoodTruck(String name)
    {
        this.name = name;
        this.menu = new ArrayList<>();
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

    public List<Dish> getMenu()
    {
        return menu;
    }

    public void setMenu(List<Dish> menu)
    {
        this.menu = menu;
    }

    public List<Order> getOrders()
    {
        return orders;
    }

    public void setOrders(List<Order> orders)
    {
        this.orders = orders;
    }

    public void addDish(Dish dish)
    {
        menu.add(dish);
    }

    public void placeOrder(Order order)
    {
        orders.add(order);
    }

    public List<Order> viewOrders()
    {
        return new ArrayList<>(orders);
    }

    public List<Order> getOpenOrders()
    {
        List<Order> openOrders = new ArrayList<>();
        for (Order order : orders)
        {
            if (!order.isCompleted())
            {
                openOrders.add(order);
            }
        }
        return openOrders;
    }
}
