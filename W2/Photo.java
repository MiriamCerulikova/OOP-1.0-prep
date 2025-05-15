import java.util.List;

public class Photo {
    private int lengthInPixels;
    private int widthInPixels;
    private int dpi;
    private String description;
    private List<String> personsOnPicture;

    public Photo(int lengthInPixels, int widthInPixels, int dpi, String description, List<String> personsOnPicture) {
        this.lengthInPixels = lengthInPixels;
        this.widthInPixels = widthInPixels;
        this.dpi = dpi;
        this.description = description;
        this.personsOnPicture = personsOnPicture;
    }

    public boolean canBePrinted() {
        if (dpi >= 150) {
            if (lengthInPixels >= 585) {
                if (widthInPixels >= 878) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isGroupPicture() {
        if (personsOnPicture == null) {
            return false;
        }

        int numberOfPeople = personsOnPicture.size();
        if (numberOfPeople > 2) {
            return true;
        } else {
            return false;
        }
    }

    public int getLengthInPixels() {
        return lengthInPixels;
    }

    public void setLengthInPixels(int lengthInPixels) {
        this.lengthInPixels = lengthInPixels;
    }

    public int getWidthInPixels() {
        return widthInPixels;
    }

    public void setWidthInPixels(int widthInPixels) {
        this.widthInPixels = widthInPixels;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getPersonsOnPicture() {
        return personsOnPicture;
    }

    public void setPersonsOnPicture(List<String> personsOnPicture) {
        this.personsOnPicture = personsOnPicture;
    }
}