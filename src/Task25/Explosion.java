package Task25;

public class Explosion extends Error {
    public Explosion() {
        super("Kaboom");

        System.err.println("The car has exploded.");
    }
}
