public class Entrance implements Counted {
    private String name;
    private int count;

    public Entrance(String name) {
        this.name = name;
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
}
