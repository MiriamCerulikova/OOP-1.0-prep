import java.time.Duration;
import java.time.LocalDateTime;

public class Rental
{
    private Customer customer;
    private Bike bike;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private double distanceTraveled;

    public Rental(Customer customer, Bike bike, LocalDateTime startTime) {
        this.customer = customer;
        this.bike = bike;
        this.startTime = startTime;
        this.distanceTraveled = 0;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public Bike getBike()
    {
        return bike;
    }

    public void setBike(Bike bike)
    {
        this.bike = bike;
    }

    public double getDistanceTraveled()
    {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled)
    {
        this.distanceTraveled = distanceTraveled;
    }

    public LocalDateTime getStartTime()
    {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime)
    {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime()
    {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime)
    {
        this.endTime = endTime;
    }

    public void endRental(LocalDateTime endTime, double distanceTraveled)
    {
        this.endTime = endTime;
        this.distanceTraveled = distanceTraveled;
        bike.addDistance(distanceTraveled);
    }

    public double getDurationInHours()
    {
        Duration duration = Duration.between(startTime, endTime);
        return duration.toMinutes() / 60.0;
    }

    public double getTotalCost()
    {
        double costPerKm = 0.20 * distanceTraveled;
        double costPerHour = 2 * getDurationInHours();

        if (distanceTraveled > 50)
        {
            return costPerKm + costPerHour;
        }

        return costPerKm + costPerHour - 2;
    }
}

