public class Karateisti extends Sportisti{
    private String stili;

    public Karateisti (int i, String e, byte m, char g, String s) {
        super(i, e, m, g);
        stili = s;
    }

    public String getStili() {
        return stili;
    }

    public void setStili(String s) {
        stili = s;
    }

    public boolean garonIndividualisht() {
        return true;
    }

    public String toString() {
        return "Karateisti me stil " + stili + " - " + super.toString();
    }
}
