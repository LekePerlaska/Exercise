public class Anime {
    private String emri;
    private String autori;
    private short viti;
    private boolean favorite;

    public Anime(String e, String a, short v, boolean f) {
        emri = e;
        autori = a;
        viti = v;
        favorite = f;
    }

    public String getEmri() {
        return emri;
    }
    public String getAutori() {
        return autori;
    }
    public short getViti() {
        return viti;
    }
    public boolean getFavorite() {
        return favorite;
    }

    public String toString() {
        return emri + " : " + autori + " - " + viti;
    }

    public boolean equal(Object o) {
        return o instanceof Anime? ((Anime)o).getEmri().equals(emri): false;
    }
}
