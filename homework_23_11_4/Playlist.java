package javaPro.saturday.homework_23_11_4;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;
    private String name;
    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }
    public void addSong(Song song) {

        songs.add(song);
    }
    public void removeSong(Song song) {

        songs.remove(song);
    }
    public String getName() {

        return name;
    }
}
