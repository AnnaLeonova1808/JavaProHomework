package javaPro.saturday.homework_23_11_4;

import java.util.ArrayList;
import java.util.List;

//1.6. Создать класс Artist, представляющий исполнителя, с полями:
//
//Имя исполнителя (String name)
//Список альбомов (List<Album> albums) исполнителя.
public class Artist {
    private String name;
    private List<Album> albums;

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }
}
