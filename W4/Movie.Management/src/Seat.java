public class Seat
{
    private String seatNumber;
    private String description;
    private double additionalCharge;
    private boolean isReserved;

    public Seat(String seatNumber, String description, double additionalCharge, boolean isReserved)
    {
        this.seatNumber = seatNumber;
        this.description = description;
        this.additionalCharge = additionalCharge;
        this.isReserved = isReserved;
    }

    public String getSeatNumber()
    {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber)
    {
        this.seatNumber = seatNumber;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getAdditionalCharge()
    {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge)
    {
        this.additionalCharge = additionalCharge;
    }

    public boolean isReserved()
    {
        return isReserved;
    }

    public void setReserved(boolean reserved)
    {
        isReserved = reserved;
    }

    public double getTotalPrice()
    {
        return isReserved ? additionalCharge + 10 : 0; // Assuming a base seat price of 10
    }

    public void reserveSeat()
    {
        isReserved = true;
    }
}
