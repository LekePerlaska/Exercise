public abstract class KafshaShtepiake extends Kafsha {
    private int nrVaksinave;

    public KafshaShtepiake(int i, String e,  byte m, char g, int nrV) {
        super(i, e, m, g);
        nrVaksinave = nrV;
    }

    public int getNrVaksinave() {
        return nrVaksinave;
    }

    public void setNrVaksinave(int v) {
        nrVaksinave = v;
    }

    public abstract boolean eshteITrajnuar();

    public String toString() {
        return super.toString() + " me " + nrVaksinave + " vaksina";
    }
}
