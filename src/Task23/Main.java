package Task23;

public class Main {
    public static void main(String[] args) {
        Album alb1 = new Album("Loving You", new Song[]{new Song("Elvis", "Party"), new Song("Elvis", "Hot Dog")});
        Album alb2 = new Album("Ella & Louis", new Song[]{new Song("Armstrong", "A Foggy Day"), new Song("Fitzgerald", "Cheek to Cheek")});
        Shelf shelf = new Shelf(new Album[]{alb1, alb2});
        System.out.println("Song from album: " + shelf.findAlbumBySong("Cheek to Cheek"));


        Frac a = new Frac(20, 4), b = new Frac(1, -2),
                c = new Frac(-14, -4), d = new Frac(-8, -4), f = new Frac(4), m = new Frac(-1);

        Frac f2 = Frac.add(Frac.mul(d, c), new Frac(10).mul(b));
        Frac f4 = Frac.add(Frac.mul(Frac.mul(a, b), new Frac(-2)), m);
        Frac zz = d.add(a).add(f.mul(Frac.mul(b, c)));
        Frac ww = Frac.div(f2, f4).sub(b).sub(c);
        System.out.println(f2 + " " + f4 + " " + zz + " " + ww);
    }
}
