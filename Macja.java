public class Macja extends KafshaShtepiake {
    private String llojiUshqimit;

    public Macja(int i, String e, byte m, char g, int nrV, String llU) {
        super(i, e, m, g, nrV);
        llojiUshqimit = llU;
    }

    public String getLlojiUshqimor() {
        return llojiUshqimit;
    }

    public void setLlojiUshqimor(String llU) {
        llojiUshqimit = llU;
    }

    public float shpejtesiaMaksimale() {
        return 47.00f;
    }

    public boolean eshteITrajnuar() {
        return false;
    }

    public String toString() {
        return super.toString() + " dhe ushqehet me ushqim " + llojiUshqimit;
    }
}
