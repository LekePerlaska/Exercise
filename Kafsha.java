public abstract class Kafsha {
    private int id;
    private String emri;
    private byte mosha;
    private char gjinia;

    public Kafsha(int i, String e, byte m, char g) {
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

    public abstract float shpejtesiaMaksimale();

    public boolean equal(Object o) {
        return o instanceof Kafsha? ((Kafsha)o).getID() == id : false;
    }

    public String toString() {
        return id + " : " + emri + " " + (gjinia == 'M'? "Mashkull" : "Femer") + " " + mosha + " vjec";
    }
}
