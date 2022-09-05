public class Autosalloni {
    String emri;
    Automjeti[] automjetet;
    int index = 0;

    public Autosalloni(String emri, int nr) {
        this.emri = emri;
        automjetet = new Automjeti[nr];
    }

    public boolean ekziston(Automjeti a) {
        for(int i=0; i<automjetet.length; i++){
            if(a.krahaso(automjetet[i])){
                return true;
            }
        }
        return false;
    }

    public void shtoAutomjeti(Automjeti a) {
        if(ekziston(a)){
            System.out.println("Ekziston!");
        }else {
            automjetet[index++] = a;
        }
    }

    public void shtypAutomjetet(String p) {
        for(int i=0;i<automjetet.length; i++){
            if(automjetet[i].getProdhuesi().equals(p)){
                System.out.println(automjetet[i]);
            }
        }
    }

    public Automjeti meIVjetri() {
        if(index==0) {
            return null;
        }

        Automjeti meIVjeter = null;
        for(int i=0; i<automjetet.length; i++) {
            if(meIVjeter==null) {
                meIVjeter = automjetet[i];
            }else if(meIVjeter.getVitiProdhimit()<automjetet[i].getVitiProdhimit()) {
                meIVjeter = automjetet[i];
            }
        }
        return meIVjeter;
    }

    public void fshijAutomjein(int a){
        for(int i=0; i<automjetet.length; i++){
            if(automjetet[i].getVitiProdhimit()<a) {
                automjetet[i] = null;
                
            }
            automjetet[index--] = automjetet[i];
        }
    }

    public static void main(String[] args) {
        Autosalloni a = new Autosalloni("Salloni ABC", 50);
        Automjeti a1 = new Automjeti("asd2323dad", "OPEL", 1212);
        Automjeti a2 = new Automjeti("XYZABC123409873CDE", "Mercedes-Benz", 2015);
        a.shtoAutomjeti(a1);
        a.shtoAutomjeti(a2);
        System.out.println(a.ekziston(a1));
        a.shtypAutomjetet("OPEL");
        System.out.println(a.meIVjetri());
        a.fshijAutomjein(2000);
    }
}
