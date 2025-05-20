import java.util.ArrayList;

public class Album {
    private String artist;
    private ArrayList<Song> songs;

    public Album(String artist) {
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public String getArtist() {
        return artist;
    }

    public void addSong(Song song) {
        songs.add(song); 
    }

    public Song getMostPopularSong() {
        if (songs.size() == 0) { 
            return null;
        }

        Song mostPlayed = songs.get(0); 
        for (int i = 1; i < songs.size(); i++) { 
            if (songs.get(i).getTimesPlayed() > mostPlayed.getTimesPlayed()) {
                mostPlayed = songs.get(i);
            }
        }
        return mostPlayed;
    }

    public int getTotalPlayingTimeInSeconds() {
        int totalTime = 0;
        for (int i = 0; i < songs.size(); i++) { 
            totalTime = totalTime + songs.get(i).getPlayTimeInSeconds();
        }
        return totalTime;
    }

    public boolean isRoadTripWorthy() {
        if (getTotalPlayingTimeInSeconds() > 3600) { 
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Song> getFilteredSongs(String text) {
        ArrayList<Song> matchingSongs = new ArrayList<Song>();

        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().contains(text)) { 
                matchingSongs.add(songs.get(i));
            }
        }
        return matchingSongs;
    }
}
