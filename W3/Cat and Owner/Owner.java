public class Owner {
    private Cat cat;

    public Owner(Cat cat) {
        this.cat = cat;
    }

    public boolean isCatHappy() {
        if (this.cat != null) {
            return this.cat.isHappy();
        }
        return false;
    }

    public String shoutToCat() {
        if (this.cat != null) {
            return "Come here, " + this.cat.getName();
        }
        return "I don't have cat!";
    }
}
