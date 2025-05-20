public class Song {
    private String title;
    private int playTimeInSeconds;
    private int timesPlayed;

    public Song(String title, int playTimeInSeconds) {
        this.title = title;
        this.playTimeInSeconds = playTimeInSeconds;
        this.timesPlayed = 0; 
    }

    public String getTitle() {
        return title;
    }

    public int getPlayTimeInSeconds() {
        return playTimeInSeconds;
    }

    public int getTimesPlayed() {
        return timesPlayed;
    }

    public void play() {
        timesPlayed = timesPlayed + 1; 
    }
}
