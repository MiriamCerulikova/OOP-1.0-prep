import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FireDepartment
{
    private List<Firefighter> firefighters;
    private List<FireTruck> fireTrucks;
    private List<Emergency> emergencies;

    public FireDepartment()
    {
        this.firefighters = new ArrayList<>();
        this.fireTrucks = new ArrayList<>();
        this.emergencies = new ArrayList<>();
    }

    public List<Firefighter> getFirefighters()
    {
        return this.firefighters;
    }

    public void setFirefighters(List<Firefighter> firefighters)
    {
        this.firefighters = firefighters;
    }

    public List<FireTruck> getFireTrucks()
    {
        return this.fireTrucks;
    }

    public void setFireTrucks(List<FireTruck> fireTrucks)
    {
        this.fireTrucks = fireTrucks;
    }

    public List<Emergency> getEmergencies()
    {
        return this.emergencies;
    }

    public void setEmergencies(List<Emergency> emergencies)
    {
        this.emergencies = emergencies;
    }

    public void reportEmergency(Emergency emergency)
    {

    }

    public FireTruck findAvailableTruck(double waterNeeded)
    {
        for (FireTruck truck : fireTrucks)
        {
            if (truck.getCurrentWaterLevel() >= waterNeeded)
            {
                return truck;
            }
        }
        return null;
    }

    public List<Firefighter> assignFirefighters(int priority)
    {
        List<Firefighter> assignedFirefighters = new ArrayList<>();
        if (priority == 1)
        {
            for (Firefighter firefighter : firefighters)
            {
                if (firefighter.getYearsOfExperience() > 10)
                {
                    assignedFirefighters.add(firefighter);
                    if (assignedFirefighters.size() == 5)
                    {
                        break;
                    }
                }
            }
        }
        else
        {
            assignedFirefighters.addAll(firefighters);
        }
        return assignedFirefighters;
    }

    public void completeEmergency(Emergency emergency)
    {
        emergency.markAsCompleted();
    }
}
