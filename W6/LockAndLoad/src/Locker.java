class Locker
{
    private int lockerNumber;
    private Laptop laptop;

    public Locker(int lockerNumber)
    {
        this.lockerNumber = lockerNumber;
    }

    public int getLockerNumber()
    {
        return this.lockerNumber;
    }

    public void setLockerNumber(int lockerNumber)
    {
        this.lockerNumber = lockerNumber;
    }

    public Laptop getLaptop()
    {
        return this.laptop;
    }

    public void setLaptop(Laptop laptop)
    {
        this.laptop = laptop;
    }

    public boolean storeLaptop(Laptop laptop)
    {
        if (this.laptop == null)
        {
            this.laptop = laptop;
            return true;
        }
        return false;
    }

    public Laptop removeLaptop()
    {
        Laptop temp = this.laptop;
        this.laptop = null;
        return temp;
    }
}
