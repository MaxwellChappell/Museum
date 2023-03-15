import java.util.Arrays;
import java.util.Hashtable;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Art[] a = {
                new Art("Death and the Maiden", 1915, "Schiele"),
                new Art("Belshazzars Feast", 1635, "Rembrandt"),
                new Art("The Red Vineyar", 1888, "van Gogh"),
                new Art("Guernica", 1937, "Picasso"),
                new Art("Vase with Fifteen Sunflowers", 1888, "van Gogh"),
                new Art("Curtain, Jug and Fruit", 1894, "Cézanne"),
                new Art("No. 5, 1948", 1948, "Pollock"),
                new Art("The Scream", 1893, "Munch")
        };
        Gallery[] g = {
                new Gallery("Storage", Arrays.copyOfRange(a, 0, 4)),
                new Gallery("Main", Arrays.copyOfRange(a, 4, 6)),
                new Gallery("Staircase", Arrays.copyOfRange(a, 7, 8)),
        };
        Entrance[] e = {
                new Entrance("North"),
                new Entrance("South")
        };

        Museum m = new Museum("Fake", g, e);

        Random r = new Random();

        System.out.println(m);
        Hashtable<String, Integer> count = new Hashtable<>();
        for (Entrance i : e) {
            i.patronEntered(r.nextInt(10));
        }
        for (Gallery i : g) {
            i.patronEntered(r.nextInt(10));
        }
        count = m.callCounts(false);
        System.out.println(count);
        count = m.callCounts(true);
        System.out.println(count);

    }
}
