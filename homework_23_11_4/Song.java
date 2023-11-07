package javaPro.saturday.homework_23_11_4;
//1.4. Создать класс Song, представляющий песню, с полями:
//
//Название (String title)
//Исполнитель (String artist)
//Жанр (Genre genre)
//Рейтинг (Rating rating) с возможностью установки и получения.
//Статическим полем int songCount для подсчета созданных песен.
//Переопределенным методом toString() для удобного вывода информации о песне.
public class Song {
    private String title;
    private String artist;
    private Genre genre;
    private Rating rating;
    private static int songCount = 0;
    public Song(String title, String artist, Genre genre, Rating rating) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.rating = rating;
        songCount ++;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public static int getSongCount() {
        return songCount;
    }

    public static void setSongCount(int songCount) {
        Song.songCount = songCount;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre=" + genre +
                ", rating=" + rating +
                '}';
    }
}
