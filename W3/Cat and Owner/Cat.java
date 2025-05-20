public class Cat {
    private String name;
    private double happyLevel;

    public Cat(String name, double happyLevel) {
        this.name = name;
        this.happyLevel = happyLevel;
    }

    public void pet() {
        this.happyLevel += 0.3;
        if (this.happyLevel > 5.0) {
            this.happyLevel = 5.0;
        }
    }

    public boolean isHappy() {
        return this.happyLevel > 3.5;
    }

    public String getName() {
        return this.name;
    }
}
