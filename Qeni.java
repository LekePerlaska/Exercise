public class Qeni extends KafshaShtepiake {
    private boolean rritet;

    public Qeni(int i, String e, byte m, char g, int nrV, boolean r) {
        super(i, e, m, g, nrV);
        rritet = r;
    }

    public boolean getRritja() {
        return rritet;
    }

    public void setRritjia(boolean r) {
        rritet = r;
    }

    public float shpejtesiaMaksimale() {
        return 70.00f;
    }

    public boolean eshteITrajnuar() {
        return true;
    }

    public String toString() {
        return super.toString() + " dhe eshte lloj i qenit qe " + (rritet? "rritet": "nuk rritet");
    }
}
