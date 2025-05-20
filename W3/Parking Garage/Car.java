class Car {
    private String licensePlate;
    private String brand;
    private String color;

    public Car(String licensePlate, String brand, String color) 
	{
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.color = color;
    }

    public String getLicensePlate() 
	{
        return this.licensePlate;
    }

    public String getBrand() 
	{
        return this.brand;
    }

    public String getColor() 
	{
        return this.color;
    }
	public void isWhite()
	{
		return this.getColor().equalsIgnoreCase("white");
	}
}
