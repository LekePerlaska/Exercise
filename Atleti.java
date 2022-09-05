public abstract class Atleti extends Sportisti {
    private byte nrMedaljeve;

    public Atleti(int i, String e, byte m, char g, byte nrM) {
        super(i, e, m, g);
        nrMedaljeve = nrM;
    }

    public byte getNrMedaljeve() {
        return nrMedaljeve;
    }

    public void setNrMedaljeve(byte m) {
        nrMedaljeve = m;
    }

    public String toString() {
        return super.toString() + " me " + nrMedaljeve + " medalje";
    }
}
