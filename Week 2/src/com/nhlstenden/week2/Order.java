package com.nhlstenden.week2;

import java.util.List;

public class Order
{
    private int id;
    private Visitor visitor;
    private FoodTruck foodTruck;
    private String pickUpTime;
    private List<Dish> items;
    private boolean completed;
    private String feedback;

    public Order(int id, Visitor visitor, FoodTruck foodTruck, String pickUpTime, List<Dish> items)
    {
        this.id = id;
        this.visitor = visitor;
        this.foodTruck = foodTruck;
        this.pickUpTime = pickUpTime;
        this.items = items;
        this.completed = false;
        this.feedback = null;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Visitor getVisitor()
    {
        return visitor;
    }

    public void setVisitor(Visitor visitor)
    {
        this.visitor = visitor;
    }

    public FoodTruck getFoodTruck()
    {
        return foodTruck;
    }

    public void setFoodTruck(FoodTruck foodTruck)
    {
        this.foodTruck = foodTruck;
    }

    public String getPickUpTime()
    {
        return pickUpTime;
    }

    public void setPickUpTime(String pickUpTime)
    {
        this.pickUpTime = pickUpTime;
    }

    public List<Dish> getItems()
    {
        return items;
    }

    public void setItems(List<Dish> items)
    {
        this.items = items;
    }

    public boolean isCompleted()
    {
        return completed;
    }

    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }

    public String getFeedback()
    {
        return feedback;
    }

    public void setFeedback(String feedback)
    {
        this.feedback = feedback;
    }

    public int calculateWaitTime()
    {
        int totalTime = 0;
        for (Dish dish : items)
        {
            totalTime += dish.getPrepTime();
        }
        return totalTime;
    }

    public boolean isStockAvailable()
    {
        for (Dish dish : items)
        {
            if (!dish.isAvailable(1)) // assumes quantity of 1 per item
            {
                return false;
            }
        }
        return true;
    }
}
