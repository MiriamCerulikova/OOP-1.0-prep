public class Customer
{
    private String name;
    private String address;
    private String zipCode;
    private String city;

    public Customer(String name, String address, String zipCode, String city)
    {
        this.name = name;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return this.address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getZipCode()
    {
        return this.zipCode;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

    public String getCity()
    {
        return this.city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }
}
