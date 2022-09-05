public class Tigri extends Kafsha {
    private String lloji;

    public Tigri(int i, String e, byte m, char g, String l) {
        super(i, e, m, g);
        lloji = l;
    }

    public String getLloji() {
        return lloji;
    }

    public void setLloji(String l) {
        lloji = l;
    }

    public float shpejtesiaMaksimale() {
        return 64.5f;
    }

    public String toString() {
        return "Tigri " + super.toString() + ", i llojit: " + lloji;
    }
}
