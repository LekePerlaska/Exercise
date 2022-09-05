public class Automjeti {
    String nrShasise;
    String prodhuesi;
    int vitiProdhimit;

    public Automjeti(String nrShasise, String prodhuesi, int i) {
        this.nrShasise = nrShasise;
        this.prodhuesi = prodhuesi;
        this.vitiProdhimit = i;
    }

    public String getNrShasise() {
        return nrShasise;
    }
    public String getProdhuesi() {
        return prodhuesi;
    }
    public int getVitiProdhimit() {
        return vitiProdhimit;
    }

    public void setProdhuesi(String p) {
        p = prodhuesi;
    }
    public void setVitiProdhimit(int v) {
        v = vitiProdhimit;
    }

    public String toString() {
        return nrShasise + " : " + prodhuesi + " - " + vitiProdhimit;
    }

    public boolean krahaso(Object o){
        if(o instanceof Automjeti) {
            return nrShasise == ((Automjeti)o).getNrShasise();
        }
        return false;
    }
}
