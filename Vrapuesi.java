public class Vrapuesi extends Atleti {
    private float distanca;

    public Vrapuesi(int i, String e, byte m, char g, byte nrM, Float d) {
        super(i, e, m, g, nrM);
        distanca = d;
    }

    public Float getDistanca() {
        return distanca;
    }

    public void setDistanca(Float d) {
        distanca = d;
    }

    public boolean garonIndividualisht() {
        return true;
    }

    public String toString() {
        return "Vrapuesi i distances " + distanca + "m - " + super.toString();
    }
}
