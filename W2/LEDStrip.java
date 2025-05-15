public class LEDStrip {
    private int red;
    private int green;
    private int blue;
    private int dimmer;

    public LEDStrip() {
        this.red = 0;
        this.green = 0;
        this.blue = 0;
        this.dimmer = 255;
    }

    public boolean setColor(String color) {
        switch (color.toLowerCase()) {
            case "red" -> { red = 255; green = 0; blue = 0; }
            case "green" -> { red = 0; green = 255; blue = 0; }
            case "blue" -> { red = 0; green = 0; blue = 255; }
            case "purple" -> { red = 255; green = 0; blue = 255; }
            case "orange" -> { red = 255; green = 165; blue = 0; }
            case "sun" -> { red = 201; green = 141; blue = 38; }
            default -> { return false; }
        }
        return true;
    }

    public String getColor() {
        if (red == 255 && green == 0 && blue == 0) return "Red";
        if (red == 0 && green == 255 && blue == 0) return "Green";
        if (red == 0 && green == 0 && blue == 255) return "Blue";
        if (red == 255 && green == 0 && blue == 255) return "Purple";
        if (red == 255 && green == 165 && blue == 0) return "Orange";
        if (red == 201 && green == 141 && blue == 38) return "Sun";
        return "Unknown";
    }

    public void setDimmer(int percentage) {
        if (percentage >= 0 && percentage <= 100) {
            this.dimmer = (int) (255 * (percentage / 100.0));
        }
    }

    public int getDimmer() {
        return dimmer;
    }
}