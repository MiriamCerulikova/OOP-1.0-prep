import java.util.*;

class Route {
    private List<Destination> destinations;
    private Deliverer deliverer;

    public Route(Deliverer deliverer) {
        this.deliverer = deliverer;
        this.destinations = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public double getTotalDistance() {
        double totalDistance = 0;
        for (Destination d : destinations) {
            totalDistance += d.getDistanceToPreviousDestination();
        }
        return totalDistance;
    }

    public double getDistancePrice() {
        return getTotalDistance() * 0.05;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Destination d : destinations) {
            total += d.getTotalPrice();
        }
        return total;
    }

    public double getProfit() {
        return getTotalPrice() - deliverer.getSalary();
    }

    public int getAmountOfPizzas() {
        int totalPizzas = 0;
        for (Destination d : destinations) {
            totalPizzas += d.getPizzasToDeliver();
        }
        return totalPizzas;
    }
}