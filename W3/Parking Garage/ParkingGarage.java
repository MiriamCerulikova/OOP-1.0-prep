import java.util.ArrayList;

class ParkingGarage {
    private int capacity;
    private String name;
    private String address;
    private ArrayList<Car> cars;

    public ParkingGarage(int capacity, String name, String address) {
        this.capacity = capacity;
        this.name = name;
        this.address = address;
        this.cars = new ArrayList<>();
    }

    public boolean isLicensePlateValid(Car car) 
	{
        String plate = car.getLicensePlate();
        if (plate.length() != 6) {
            return false;
        }
        for (char c : plate.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public void addCar(Car car) 
	{
		if(isFull())
		{
			return;
		}
		if(!isLicensePlateValid(car.getLicensePlate()));
		{
			return;
		}
		if (car.isWhite())
		{
			if (getAmountOfWhiteCars() >= 40)
			{
				return;
			}
		}
		
		this.cars.add(car);
    }
	
	public boolean isFull ()
	{
		return(this.cars.size() >= this.capacity);
	}
	
	public int getAmountOfWhiteCars()
	{
		this.cars.size()
		{
			int numWhiteCars = 0;
			
			for (Car car : this.cars)
			{
				if(car.isWhiteCars += 1
			}
		}
		return numWhiteCars;
	}
	
			

    public int countWhiteCars() {
        int whiteCarCount = 0;
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase("white")) {
                whiteCarCount++;
            }
        }
        return whiteCarCount;
    }

    public int countCarsByMake(String make) {
        int carCount = 0;
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(make)) {
                carCount++;
            }
        }
        return carCount;
    }

    public boolean removeCar(Car car) {
        return cars.remove(car);
    }
}