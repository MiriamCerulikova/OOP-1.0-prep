import java.util.*;

class Destination {
    private String name;
    private String address;
    private double distanceToPreviousDestination;
    private int pizzasToDeliver;

    public Destination(String name, String address, double distanceToPreviousDestination, int pizzasToDeliver) {
        this.name = name;
        this.address = address;
        this.distanceToPreviousDestination = distanceToPreviousDestination;
        this.pizzasToDeliver = pizzasToDeliver;
    }

    public double getTotalPrice() {
        return pizzasToDeliver * 5.0;
    }

    public double getDistanceToPreviousDestination() {
        return this.distanceToPreviousDestination;
    }

    public int getPizzasToDeliver() {
        return this.pizzasToDeliver;
    }
}