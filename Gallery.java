public class Gallery {
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
    }

    public int patronCount(boolean reset) {
        if (reset) {
            int c = this.count;
            this.count = 0;
            return c;
        }
        return this.count;
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
