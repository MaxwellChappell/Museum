import java.util.Hashtable;

public class Museum {
    private String name;
    private Gallery[] galleries;
    private Entrance[] entrances;

    public Museum(String name, Gallery[] galleries, Entrance[] entrances) {
        this.name = name;
        this.galleries = galleries;
        this.entrances = entrances;
    }

    public Hashtable<String, Integer> callCounts(boolean reset) {
        Hashtable<String, Integer> counts = new Hashtable<>();
        for (Entrance e: entrances) {
            counts.put(e.getName(), e.patronCount(reset));
        }
        for (Gallery g : galleries) {
            counts.put(g.getName(), g.patronCount(reset));
        }
        return counts;
    }

    public String toString() {
        String rString = this.name + "\n\n";
        for (Gallery g : galleries) {
            rString += g + "\n\n";
        }
        return rString;
    }

}