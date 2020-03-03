import java.util.ArrayList;

public class Album {

    private String artist;
    private String title;
    private ArrayList <Song> songs;

    public Album(String artist, String title) {
        this.artist = artist;
        this.title = title;
        this.songs = new ArrayList<Song>();
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong (String title, int duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public Song findSong (String songTitle) {
        // similar to a 'for of' loop in javascript
        for (Song checkedSong: this.songs) {
            if (checkedSong.getTitle().equals(songTitle)) {
                return checkedSong;
            }
        }
        return null;
    }

}
