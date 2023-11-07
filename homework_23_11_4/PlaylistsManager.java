package javaPro.saturday.homework_23_11_4;

import java.util.List;

public interface PlaylistsManager {
    void createPlaylist(String name);

    void deletePlaylist(String name);

    List<Playlist> getAllPlaylists();

    void addToPlayList(Playlist playlist, Song song1);
}
