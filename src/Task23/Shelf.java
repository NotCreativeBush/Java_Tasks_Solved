package Task23;

public class Shelf {
    private Album[] albums;

    public Album[] getAlbums() {
        return albums;
    }

    public Shelf(Album[] albums) {
        this.albums = albums;
    }

    public String findAlbumBySong(String song) {
        for (Album x : albums) {
            for (Song y : x.getSongs()) {
                if (y.getTitle() == song) {
                    return x.getTitle();
                }
            }
        }
        return "none";
    }
}
