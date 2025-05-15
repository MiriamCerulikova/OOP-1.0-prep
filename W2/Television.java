public class Television {
    private String brand;
    private String model;
    private int volume;
    private int channel;
    private String childLockPin;
    private boolean isChildLockActive;

    public Television(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.volume = 50;
        this.channel = 1;
        this.childLockPin = "";
        this.isChildLockActive = false;
    }

    public void channelUp() {
        if (!isChildLockActive && channel < 75) {
            channel++;
        }
    }

    public void channelDown() {
        if (!isChildLockActive && channel > 1) {
            channel--;
        }
    }

    public void volumeUp() {
        if (volume < 100) {
            volume++;
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
    }

    public void setChannel(int channel) {
        if (!isChildLockActive && channel >= 1 && channel <= 75) {
            this.channel = channel;
        }
    }

    public void setChildLock(String pin) {
        if (pin.length() == 4) {
            this.childLockPin = pin;
            this.isChildLockActive = true;
        }
    }

    public void removeChildLock(String pin) {
        if (isChildLockActive && pin.equals(childLockPin)) {
            this.isChildLockActive = false;
            this.childLockPin = "";
        }
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isChildLockActive() {
        return isChildLockActive;
    }
}
