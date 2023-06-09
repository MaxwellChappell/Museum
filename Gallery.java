public class Gallery implements Counted {
    private String name;
    private Art[] art;
    private int count;

    public Gallery(String name, Art[] art) {
        this.name = name;
        this.art = art;
        this.count = 0;
    }

    public void patronEntered(int people) {
        this.count += people;
        if (people == 1) {
            System.out.printf("%d person entered at %s\n", people, this.name);
        } else {
            System.out.printf("%d people entered at %s\n", people, this.name);
        }
    }

    public int patronCount(boolean reset) {
        if (reset) {
            int c = this.count;
            this.count = 0;
            return c;
        } else {
            return this.count;
        }
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        String rString = name + "\n";
        for (Art a : art) {
            rString += "\t" + a + "\n";
        }
        return rString;
    }
}
