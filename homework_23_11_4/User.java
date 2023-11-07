package javaPro.saturday.homework_23_11_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//1.8. Создать класс User, представляющий пользователя приложения, с полями:
//
//Имя пользователя (String username)
//Список плейлистов (List<Playlist> playlists) пользователя.
//Реализацией интерфейса PlaylistsManager.
//Методами для добавления (addToPlaylist) и удаления (removeFromPlaylist) песен в плейлисте.
//Методом rateSong для оценки песни.
public class User implements PlaylistsManager {
    private String username;
    private List<Playlist> playlists;

    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<Playlist>();
    }
    public String getUsername() {
        return username;
    }
    @Override
    public void createPlaylist(String name) {
        playlists.add(new Playlist(name));
    }

    @Override
    public void deletePlaylist(String name) {
        Iterator<Playlist> iterator = playlists.iterator();
        while (iterator.hasNext()) {
            Playlist playlist1 = iterator.next();
            if (playlist1.getName().equals(name)) {
                iterator.remove();
                break;
            }
        }
    }
    @Override
    public List<Playlist> getAllPlaylists() {
        return playlists;
    }
    @Override
    public void addToPlayList(Playlist playlist, Song song1) {
        playlist.addSong(song1);
    }
    public void rateSong(Song song, Rating rating) {
        song.setRating(rating);
    }
    public void viewSongInfo(Song song) {
        System.out.println("Title: " + song.getTitle());
        System.out.println("Artist: " + song.getArtist());
        System.out.println("Genre: " + song.getGenre());
        System.out.println("Rating: " + song.getRating());
    }
    public static void main(String[] args) {
        User user = new User("Anna");
        Song song1 = new Song("S1", "Artist1", Genre.POP, Rating.FIVE_STARS);
        Song song2 = new Song("S2", "Artist2", Genre.ROCK, Rating.FOUR_STARS);
        user.createPlaylist("My Playlist");
        Playlist myPlaylist = user.getAllPlaylists().get(0);
        user.addToPlayList(myPlaylist, song1);
        user.addToPlayList(myPlaylist, song2);
        user.rateSong(song1, Rating.FIVE_STARS);

        user.viewSongInfo(song1);

        user.deletePlaylist(String.valueOf(PlaylistType.CLASSIC));

        List<Playlist> playlists = user.getAllPlaylists();
        for (Playlist playlist : playlists) {
            System.out.println("Playlist: " + playlist.getName());
        }
    }
}
