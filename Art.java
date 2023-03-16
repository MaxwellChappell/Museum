public class Art {
    private String name;
    private int year;
    private String artistName;

    public Art(String name, int year, String artistName) {
        this.name = name;
        this.year = year;
        this.artistName = artistName;
    }

    public String toString() {
        String rString = this.name + ", " + this.year + ", " + this.artistName;
        return rString;
    }
}
