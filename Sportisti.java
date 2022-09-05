abstract class Sportisti {
    private int id;
    private String emri;
    private byte mosha;
    private char gjinia;

    public Sportisti(int i, String e, byte m, char g) {
        id = i;
        emri = e;
        mosha = m;
        gjinia = g;
    }

    public int getID() {
        return id;
    }
    public String getEmri() {
        return emri;
    }
    public byte getMosha() {
        return mosha;
    }
    public char getGjinia() {
        return gjinia;
    }

    public void setEmri(String e) {
        emri = e;
    }
    public void setMosha(byte m) {
        mosha = m;
    }
    public void setGjinia(char g) {
        gjinia = g;
    }

    public abstract boolean garonIndividualisht();

    public String toString() {
        return id + " : " + emri + " " + (gjinia == 'M'? "Mashkull" : "Femer") + " " + mosha + " vjec";
    }

    public boolean equals(Object o) {
        return o instanceof Sportisti? ((Sportisti)o).getID() == id : false;
    }
}
