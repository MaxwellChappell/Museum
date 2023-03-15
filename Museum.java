import java.util.Hashtable;

public class Museum {
    private String name;
    private Gallery[] galleries;

    public Museum(String name, Gallery[] galleries) {
        this.name = name;
        this.galleries = galleries;
    }

    public Hashtable<String, Integer> callCounts(boolean reset) {
        Hashtable<String, Integer> counts = new Hashtable<>();
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