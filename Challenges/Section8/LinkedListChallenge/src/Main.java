import java.util.*;

public class Main {

    private static ArrayList<Album> myAlbums = new ArrayList<>();
    private static LinkedList<Song> myPlaylist = new LinkedList<Song>();

    public static void main(String[] args) {
        addAlbum("The Beatles", "White Album");
        addAlbum("Bon Iver", "Bon Iver, Bon Iver");
        findAlbum("White Album").addSong("Back In The U.S.S.R", 163);
        findAlbum("White Album").addSong("Dear Prudence", 235);
        findAlbum("White Album").addSong("Glass Onion", 137);
        findAlbum("White Album").addSong("Ob-La-Di, Ob-La-Da", 188);
        findAlbum("White Album").addSong("Wild Honey Pie", 52);
        findAlbum("White Album").addSong("The Continuing Story of Bungalow Bill", 194);
        findAlbum("White Album").addSong("While My Guitar Gently Weeps", 163);
        findAlbum("White Album").addSong("Happiness Is A Warm Gun", 164);
        findAlbum("White Album").addSong("Martha My Dear", 148);
        findAlbum("White Album").addSong("I'm So Tired", 123);
        findAlbum("White Album").addSong("Blackbird", 138);
        findAlbum("White Album").addSong("Piggies", 124);
        findAlbum("White Album").addSong("Rocky Raccoon", 213);
        findAlbum("White Album").addSong("Don't Pass Me By", 230);
        findAlbum("White Album").addSong("Why Don't We Do It In The Road", 101);
        findAlbum("White Album").addSong("I Will", 105);
        findAlbum("Bon Iver, Bon Iver").addSong("Perth", 262);
        findAlbum("Bon Iver, Bon Iver").addSong("Minnesota, WI", 232);
        findAlbum("Bon Iver, Bon Iver").addSong("Holocene", 336);
        findAlbum("Bon Iver, Bon Iver").addSong("Towers", 188);
        findAlbum("Bon Iver, Bon Iver").addSong("Michicant", 225);
        findAlbum("Bon Iver, Bon Iver").addSong("Hinnom, TX", 165);
        findAlbum("Bon Iver, Bon Iver").addSong("Wash.", 298);
        findAlbum("Bon Iver, Bon Iver").addSong("Calgary", 250);
        findAlbum("Bon Iver, Bon Iver").addSong("Lisbon, OH", 93);
        findAlbum("Bon Iver, Bon Iver").addSong("Beth/Rest", 316);
//        printAlbums(true);
        addSongToPlaylist("Back In The U.S.S.R", "White Album");
        addSongToPlaylist("Calgary", "Bon Iver, Bon Iver");
        addSongToPlaylist("Perth", "Bon Iver, Bon Iver");
        addSongToPlaylist("Perth", "Bon Iver, Bon Iver");
        addSongToPlaylist("Skinny Love", "Bon Iver, Bon Iver");
        listen();

    }

    private static boolean addAlbum (String artist, String albumName) {
        if (findAlbum(albumName) == null) {
            myAlbums.add(new Album(artist, albumName));
            return true;
        }
        return false;
    }

    private static Album findAlbum (String albumName) {
        for (int i = 0; i < myAlbums.size(); i++) {
            Album album = myAlbums.get(i);
            if (album.getTitle().equals(albumName)) {
                return album;
            }
        }
        return null;
    }

    private static void printAlbums(boolean showSongs) {
        for (int i = 0; i < myAlbums.size(); i++) {
            Album album = myAlbums.get(i);
            System.out.println(album.getTitle() + " by " + album.getArtist());
            if (showSongs) {
                System.out.println("Songs:");
                for (int j = 0; j < album.getSongs().size(); j++) {
                    Song song = album.getSongs().get(j);
                    System.out.println((j+1) + ". " + song.getTitle() + " (duration: " + song.getDuration() + " seconds.)");
                }
            }
        }
    }


    private static boolean addSongToPlaylist (String songTitle, String albumName) {
        // Iterator of the playlist
        ListIterator<Song> playListIterator = myPlaylist.listIterator();
        Album album = findAlbum(albumName);
        // ensures that the song exists in the album
        Song existingSong = album.findSong(songTitle);
        if (existingSong == null) {
            System.out.println("That song does not exist in that album.");
            return false;
        }
        while (playListIterator.hasNext()) {
            // checks if the song already exists in the playlist
            // (one fault is that it only checks title comparison, not artist or album comparison)
            int comparison = playListIterator.next().getTitle().compareTo(existingSong.getTitle());
            if (comparison == 0) {
                System.out.println("That song already exists in the playlist.");
                return false;
            }
        }
            myPlaylist.add(existingSong);
            System.out.println(existingSong.getTitle() + " added to playlist.");
            return true;
    }


    private static void listen() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> playListIterator = myPlaylist.listIterator();

        if (myPlaylist.isEmpty()) {
            System.out.println("There are no songs in the playlist.");
            return;
        } else {
            System.out.println("Now listening to " + playListIterator.next().getTitle());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Done listening to music.");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (playListIterator.hasNext()) {
                            playListIterator.next();
                        }
                        goingForward = true;
                    }
                    if (playListIterator.hasNext()) {
                        System.out.println("Now listening to " + playListIterator.next().getTitle());
                    } else {
                        System.out.println("You have reached the end of the playlist.");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (playListIterator.hasPrevious()) {
                            playListIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (playListIterator.hasPrevious()) {
                        System.out.println("Now listening to " + playListIterator.previous().getTitle());
                    } else {
                        System.out.println("We are at the beginning of the playlist.");
                        goingForward = true;
                    }
                    break;

                case 3:
                    if (goingForward) {
                        System.out.println("Replaying + " + playListIterator.previous().getTitle());
                        goingForward = false;
                    } else {
                        System.out.println("Replaying " + playListIterator.next().getTitle());
                        goingForward = true;
                    }
                    break;

                case 4:
                    printMenu();
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Available Actions:\npress ");
        System.out.println("0 - to quit\n" +
                " 1 - skip to next song\n" +
                " 2 - skip to previous song\n" +
                " 3 - replay current song\n" +
                " 4 - print menu options\n");
    }


 }
