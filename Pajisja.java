public class Pajisja {
    private short numriSerik;
    private String prodhuesi;
    private short voltazhi;
    private boolean kaBateri;

    public Pajisja(short numriSerik, String prodhuesi, short voltazhi, boolean kaBateri) {
        this.numriSerik = numriSerik;
        this.prodhuesi = prodhuesi;
        this.voltazhi = voltazhi;
        this.kaBateri = kaBateri;
    }

    public short getNumriSerik() {
        return numriSerik;
    }
    public String getProdhuesi() {
        return prodhuesi;
    }
    public short getVoltazhi() {
        return voltazhi;
    }
    public boolean getKaBateri() {
        return kaBateri;
    }

    public void setProdhuesi(String p) {
        prodhuesi = p;
    }
    public void setVoltazhi(short v) {
        voltazhi = v;
    }
    public void setKaBateri(boolean k) {
        kaBateri = k;
    }

    public String toString() {
        return numriSerik + " : " + prodhuesi + " " + voltazhi + "volt - " + (kaBateri? "me bateri": "pa Bateri");
    }

    public boolean equal(Object o) {
        return o instanceof Pajisja? ((Pajisja)o).getNumriSerik() ==numriSerik : false;
    }
}
