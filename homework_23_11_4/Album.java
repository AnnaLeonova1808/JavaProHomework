package javaPro.saturday.homework_23_11_4;

import com.github.javafaker.Artist;

import java.util.ArrayList;
import java.util.List;
//1.5. Создать класс Album, представляющий альбом, с полями:
//
//Название альбома (String title)
//Исполнитель альбома (Artist artist)
//Список песен (List<Song> songs) в альбоме.
public class Album {
    private String title;
    private Artist artist;
    private List<Song>songs;

    public Album(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }
}
