import java.util.ArrayList;
import java.util.List;

public class NSGroup {
    private List<Bike> bikes;
    private List<Rental> rentals;

    public NSGroup() {
        this.bikes = new ArrayList<>();
        this.rentals = new ArrayList<>();
    }

    public List<Bike> getBikes() {
        return bikes;
    }

    public void setBikes(List<Bike> bikes) {
        this.bikes = bikes;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    public void addBike(Bike bike) {
        bikes.add(bike);
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public List<Bike> getBikesForMaintenance() {
        List<Bike> bikesForMaintenance = new ArrayList<>();
        for (Bike bike : bikes) {
            if (bike.needsMaintenance()) {
                bikesForMaintenance.add(bike);
            }
        }
        return bikesForMaintenance;
    }

    public double getTotalRevenue() {
        double totalRevenue = 0;
        for (Rental rental : rentals) {
            totalRevenue += rental.getTotalCost();
        }
        return totalRevenue;
    }

    public Customer getTopPayingCustomer() {
        Customer topCustomer = null;
        double maxAmount = 0;

        for (Rental rental : rentals) {
            double amount = rental.getTotalCost();
            if (amount > maxAmount) {
                maxAmount = amount;
                topCustomer = rental.getCustomer();
            }
        }

        return topCustomer;
    }
}

