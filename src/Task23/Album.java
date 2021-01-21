package Task23;

public class Album {
    private String title;
    private Song[] songs;

    public String getTitle() {
        return title;
    }

    public Song[] getSongs() {
        return songs;
    }

    public Album(String title, Song[] songs) {
        this.title = title;
        this.songs = songs;
    }
}
