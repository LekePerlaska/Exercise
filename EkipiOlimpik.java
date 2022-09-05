public class EkipiOlimpik {
    private String emri;
    private Sportisti[] sportistet;
    int index = 0;
    static int nrS;

    public EkipiOlimpik(String e) {
        emri = e;
    }

    private class HedhesiGjyles extends Atleti{
        private float peshaTrupore;

        public HedhesiGjyles(int i, String e, byte m, char g, byte nrM, float pT) {
            super(i, e, m, g, nrM);
            peshaTrupore = pT;
        }

        public float getPeshaTrupore() {
            return peshaTrupore;
        }

        public void setPeshaTrupore(float p) {
            peshaTrupore = p;
        }

        public boolean garonIndividualisht() {
            return true;
        }

        public String toString() {
            return "Hedhesi i gjyles me " + peshaTrupore + "kg - " + super.toString();
        }
        
    }

    static class Mundesi extends Sportisti {
        private char kategoria;

        public  Mundesi(int i, String e, byte m, char g, char k) {
            super(i, e, m, g);
            kategoria = k;
        }

        public char getKategoria() {
            return kategoria;
        }

        public void setKategoria(char k) {
            kategoria = k;
        }

        public boolean garonIndividualisht() {
            return true;
        }

        public String toString() {
            return "Mundesi i kategorise se " + (kategoria == 'L'? "Lehte": kategoria == 'M'? "Mesem": "rende") + " - " + super.toString();
        }
        
    }

    static {
        nrS = 25;
    }

    {
        sportistet = new Sportisti[nrS];
        Mundesi m1 = new Mundesi(121321, "emer", (byte)21, 'M', 'L');
        shtoSportistin(m1);
    }

    public boolean ekziston(Sportisti s) {
        for(int i=0; i<index; i++) {
            if(s.equals(sportistet[i])){
                return true;
            }
        }
        return false;
    }

    public void shtoSportistin(Sportisti s) {
        if(index == sportistet.length) {
            System.out.println("Nuk ka vend!");
        }else if(ekziston(s)) {
            System.out.println("Ekziston!");
        }else {
            sportistet[index++] = s;
        }
    }

    public void shtypKategorine(char k) {
        for(int i=0; i<index; i++) {
            if(sportistet[i] instanceof Mundesi && ((Mundesi)sportistet[i]).getKategoria() == k) {
                System.out.println(sportistet[i]);
            }
        }
    }

    public HedhesiGjyles[] hedhesitPesha(float p) {
        HedhesiGjyles[] heP = null;
        int count = 0;

        for(int i=0; i<index; i++) {
            if(sportistet[i] instanceof HedhesiGjyles && ((HedhesiGjyles)sportistet[i]).getPeshaTrupore() == p) {
                count++;
            }
        }
        heP = new HedhesiGjyles[count];
        int pozita = 0;

        for(int i=0; i<index; i++) {
            if(sportistet[i] instanceof HedhesiGjyles && ((HedhesiGjyles)sportistet[i]).getPeshaTrupore() == p) {
                heP[pozita++] = (HedhesiGjyles)sportistet[i];
            }
        }

        return heP;
    }

    public void shtypFutbollistetGjinia(char g) {
        for(int i=0; i<index; i++) {
            if(sportistet[i] instanceof Futbollisti && g == ((Futbollisti)sportistet[i]).getGjinia()) {
                System.out.println(sportistet[i]);
            }
        }
    }

    public Sportisti[] ktheIndividualitetGjinia(char g) {
        Sportisti[] indGj = null;
        int count = 0;

        for(int i=0; i<index; i++) {
            if(g == sportistet[i].getGjinia() && sportistet[i].garonIndividualisht()) {
                count++;
            }
        }
        indGj = new Sportisti[count];
        int poz = 0;

        for(int i=0; i<index; i++) {
            if(g == sportistet[i].getGjinia() && sportistet[i].garonIndividualisht()) {
                indGj[poz++] = sportistet[i];
            }
        }
        return indGj;
    }

    public Sportisti vrapuesiDistanca() {
        Sportisti disM = null;

        for(int i=0; i<index; i++) {
            if(disM == null && sportistet[i] instanceof Vrapuesi) {
                disM = sportistet[i];
            }else if(sportistet[i] instanceof Vrapuesi && ((Vrapuesi)disM).getDistanca() <= ((Vrapuesi)sportistet[i]).getDistanca()) {
                disM = sportistet[i];
            }
        }

        return disM;
    }

    public void shtypKarateistetMeTeRi(byte m) {
        for(int i=0; i<index; i++) {
            if(sportistet[i] instanceof Karateisti && m > ((Karateisti)sportistet[i]).getMosha()) {
                System.out.println(sportistet[i]);
            }
        }
    }

    public Sportisti[] ktheNumrat(byte nr) {
        Sportisti[] sNr = null;
        int count = 0;

        for(int i=0; i<index; i++) {
            if(sportistet[i] instanceof Futbollisti && nr < ((Futbollisti)sportistet[i]).getNumri()) {
                count++;
            }
        }
        sNr = new Sportisti[count];

        int pozita = 0;
        for(int i=0; i<index; i++) {
            if(sportistet[i] instanceof Futbollisti && nr < ((Futbollisti)sportistet[i]).getNumri()) {
                sNr[pozita++] = sportistet[i];
            }
        }

        return sNr;
    }

    public void shtypAtletetMeMedalje() {
        for(int i=0; i<index; i++) {
            if(sportistet[i] instanceof Atleti && ((Atleti)sportistet[i]).getNrMedaljeve() > 0) {
                System.out.println(sportistet[i]);
            }
        }
    }

    public int fshijSipasStilit(String s) {
        int count =0;
        for(int i=0; i<index; i++) {
            if(sportistet[i] instanceof Karateisti && s.equals(((Karateisti)sportistet[i]).getStili())) {
                for(int j=i; j<index-1; j++) {
                    sportistet[j] = sportistet[j+1];
                }
                sportistet[--index] = null;
                i--;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        EkipiOlimpik eKp = new EkipiOlimpik("Kosova Team");

        Sportisti f1 = new Futbollisti(1992812, "BBB", (byte)18, 'M', (byte)11);
        Sportisti f2 = new Futbollisti(1592812, "CCC", (byte)20, 'M', (byte)7);
        Sportisti f3 = new Futbollisti(1129412, "DDD", (byte)19, 'M', (byte)10);
        Sportisti f4 = new Futbollisti(1919212, "EEE", (byte)17, 'F', (byte)8);
        Sportisti k1 = new Karateisti(2012144, "FFF", (byte)18, 'M', "Karate");
        Sportisti k2 = new Karateisti(2003434, "GGG", (byte)23, 'M', "Judo");
        Sportisti k3 = new Karateisti(2132324, "HHH", (byte)19, 'F', "Taekwondo");
        Sportisti k4 = new Karateisti(2002224, "III", (byte)20, 'M', "Karate");
        Atleti a1 = new Vrapuesi(3121312, "AAA", (byte)24, 'M', (byte)3, 100.00f);
        Atleti a2 = new Vrapuesi(3135312, "ABB", (byte)28, 'F', (byte)1, 40.00f);
        Atleti a3 = new Vrapuesi(3121334, "ACC", (byte)20, 'M', (byte)0, 20.00f);
        HedhesiGjyles h1 = eKp.new HedhesiGjyles(4121412, "adsaaf", (byte)25, 'M', (byte)5, 84.30f);
        Sportisti h2 = eKp.new HedhesiGjyles(4123452, "adsefd", (byte)28, 'M', (byte)8, 84.30f);
        HedhesiGjyles h3 = eKp.new HedhesiGjyles(4126432, "sgdsaf", (byte)23, 'M', (byte)3, 68.10f);
        Mundesi m1 = new Mundesi(53523, "xzvxcx", (byte)19, 'M', 'L');
        Mundesi m2 = new Mundesi(55323, "xzvwet", (byte)21, 'M', 'M');
        Mundesi m3 = new Mundesi(53542, "xzvfgh", (byte)28, 'M', 'R');

        eKp.shtoSportistin(f1);
        eKp.shtoSportistin(f2);
        eKp.shtoSportistin(f3);
        eKp.shtoSportistin(f4);
        eKp.shtoSportistin(k1);
        eKp.shtoSportistin(k2);
        eKp.shtoSportistin(k3);
        eKp.shtoSportistin(k4);
        eKp.shtoSportistin(a1);
        eKp.shtoSportistin(a2);
        eKp.shtoSportistin(a3);
        eKp.shtoSportistin(h1);
        eKp.shtoSportistin(h2);
        eKp.shtoSportistin(h3);
        eKp.shtoSportistin(m1);
        eKp.shtoSportistin(m2);
        eKp.shtoSportistin(m3);

        eKp.shtypKategorine('M');
        HedhesiGjyles[] hGP = eKp.hedhesitPesha(84.30f);
        for(HedhesiGjyles h: hGP) {
            System.out.println(h);
        }

        //eKp.fshijSipasStilit("Taekwondo");

        //eKp.shtypFutbollistetGjinia('F');
        //eKp.shtypKarateistetMeTeRi((byte)20);
        
        /** 
        Sportisti[] arr = eKp.ktheIndividualitetGjinia('M');
        for(Sportisti sp: arr) {
            System.out.println(sp);
        }
        
        System.out.println(eKp.vrapuesiDistanca());
        eKp.shtypAtletetMeMedalje();
        */
    }
}
