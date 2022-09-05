public class Futbollisti extends Sportisti{
    private byte numri;

    public Futbollisti(int i, String e, byte m, char g, byte nr) {
        super(i, e, m, g);
        numri = nr;
    }

    public byte getNumri() {
        return numri;
    }

    public void setNumri(byte n) {
        numri = n;
    }

    public boolean garonIndividualisht() {
        return false;
    }

    public String toString() {
        return "Futbollisti " + super.toString() + " - nr: " + numri;
    }
}
