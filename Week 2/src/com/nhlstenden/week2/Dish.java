package com.nhlstenden.week2;

public class Dish
{
    private String name;
    private double price;
    private int prepTime;
    private int stock;

    public Dish(String name, double price, int prepTime, int stock)
    {
        this.name = name;
        this.price = price;
        this.prepTime = prepTime;
        this.stock = stock;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getPrepTime()
    {
        return prepTime;
    }

    public void setPrepTime(int prepTime)
    {
        this.prepTime = prepTime;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    public void updateStock(int amount)
    {
        this.stock += amount;
    }

    public boolean isAvailable(int quantity)
    {
        return stock >= quantity;
    }
}
