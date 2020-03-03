import java.util.LinkedList;

public class Playlist {

    private LinkedList <Song> playlist;

    public Playlist() {
        this.playlist = new LinkedList<Song>();
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public boolean addSong (String songTitle, Album album) {
        Song existingSong = album.findSong(songTitle);
        for (int i = 0; i < this.playlist.size(); i++) {
            Song playlistSong = this.playlist.get(i);
            if (playlistSong.equals(existingSong)) {
                System.out.println("That song already exists in the playlist.");
                return false;
            }
        }
        if (existingSong != null) {
            this.playlist.add(existingSong);
            return true;
        }
        System.out.println("That song does not exist in that album.");
        return false;
    }
}
