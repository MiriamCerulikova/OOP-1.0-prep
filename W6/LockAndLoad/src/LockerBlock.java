import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class LockerBlock
{
    private List<Locker> lockers;
    private final int chargerCapacity = 522;

    public LockerBlock()
    {
        lockers = new ArrayList<>();
    }

    public List<Locker> getLockers()
    {
        return this.lockers;
    }

    public void setLockers(List<Locker> lockers)
    {
        this.lockers = lockers;
    }

    public int getChargerCapacity()
    {
        return this.chargerCapacity;
    }

    public void addLocker(Locker locker)
    {
        lockers.add(locker);
    }

    public boolean storeLaptopInLocker(Laptop laptop, int lockerNumber)
    {
        for (Locker locker : lockers)
        {
            if (locker.getLockerNumber() == lockerNumber && locker.getLaptop() == null)
            {
                locker.setLaptop(laptop);
                return true;
            }
        }
        return false;
    }

    public List<Locker> getAvailableLockers()
    {
        List<Locker> availableLockers = new ArrayList<>();
        for (Locker locker : lockers)
        {
            if (locker.getLaptop() == null)
            {
                availableLockers.add(locker);
            }
        }
        return availableLockers;
    }

    public Locker getFirstAvailableLocker()
    {
        for (Locker locker : lockers)
        {
            if (locker.getLaptop() == null)
            {
                return locker;
            }
        }

        Iterator<Locker> iterator = lockers.iterator();
        Locker highestBatteryLocker = null;
        while (iterator.hasNext())
        {
            Locker locker = iterator.next();
            if (locker.getLaptop() != null)
            {
                if (highestBatteryLocker == null || locker.getLaptop().getBatteryPercentage() > highestBatteryLocker.getLaptop().getBatteryPercentage())
                {
                    highestBatteryLocker = locker;
                }
            }
        }
        return highestBatteryLocker;
    }

    public double calculateChargingTime()
    {
        int totalRemainingCharge = 0;
        for (Locker locker : lockers)
        {
            if (locker.getLaptop() != null)
            {
                totalRemainingCharge += (locker.getLaptop().getMaxBattery() - locker.getLaptop().getCurrentBattery());
            }
        }
        return (double) totalRemainingCharge / chargerCapacity;
    }
}
