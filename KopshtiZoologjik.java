public class KopshtiZoologjik {
    private String emri;
    private Kafsha[] kafshet;
    int index = 0;

    public KopshtiZoologjik(String e, int nr) {
        emri = e;
        kafshet = new Kafsha[nr];
    }

    public boolean ekziston(Kafsha k) {
        for(int i=0; i<index; i++) {
            if(k.equal(kafshet[i])) {
                return true;
            }
        }
        return false;
    }

    public void shtoKafshen(Kafsha k) {
        if(index == kafshet.length) {
            System.out.println("Nuk ka vend!");
        }else if(ekziston(k)) {
            System.out.println("Ekziston!");
        }else {
            kafshet[index++] = k; 
        }
    }

    public void shtypTigratLloji(String l) {
        for(int i=0; i<index; i++) {
            if(kafshet[i] instanceof Tigri && ((Tigri)kafshet[i]).getLloji().equals(l)) {
                System.out.println(kafshet[i]);
            }
        }
    }

    public Kafsha[] khteTrajnuarGjinia(char g) {
        Kafsha[] kTG = null;
        int count = 0;

        for(int i=0; i<index; i++) {
            if(kafshet[i] instanceof KafshaShtepiake && ((KafshaShtepiake)kafshet[i]).eshteITrajnuar() && ((KafshaShtepiake)kafshet[i]).getGjinia() == g) {
                count++;
            }
        }
        kTG = new Kafsha[count];
        int pozita = 0;

        for(int i=0; i<index; i++) {
            if(kafshet[i] instanceof KafshaShtepiake && ((KafshaShtepiake)kafshet[i]).eshteITrajnuar() && ((KafshaShtepiake)kafshet[i]).getGjinia() == g) {
                kTG[pozita++] = kafshet[i];
            }
        }

        return kTG;
    }

    public Macja macjaMeERe() {
        Macja mRe = null;
        for(int i=0; i<index; i++) {
            if(mRe == null && kafshet[i] instanceof Macja) {
                mRe = (Macja)kafshet[i];
            }else if(kafshet[i] instanceof Macja && mRe.getMosha() >= ((Macja)kafshet[i]).getMosha()) {
                mRe = (Macja)kafshet[i];
            }
        }

        return mRe;
    }

    public void shtypQenteEVaksinuar(int nrVaksinave) {
        for(int i=0; i<index; i++) {
            if(kafshet[i] instanceof Qeni && ((Qeni)kafshet[i]).getNrVaksinave() > nrVaksinave) {
                System.out.println(kafshet[i]);
            }
        }
    }

    public static void main(String[] args) {
        KopshtiZoologjik kZoo = new KopshtiZoologjik("Zoo", 25);

        Kafsha t1 = new Tigri(1214122, "AAA", (byte)8, 'M', "tiger normal");
        Kafsha t2 = new Tigri(1242432, "BBB", (byte)5, 'F', "tiger jo normal");
        Kafsha q1 = new Qeni(212412, "CCC", (byte)6, 'F', 3, false);
        Kafsha q2 = new Qeni(214242, "DDD", (byte)4, 'M', 1, true);
        Kafsha m1 = new Macja(31342, "EEE", (byte)9, 'M', 5, "Natyral");
        Kafsha m2 = new Macja(31325, "FFF", (byte)4, 'M', 3, "I Blere");

        kZoo.shtoKafshen(t1);
        kZoo.shtoKafshen(t2);
        kZoo.shtoKafshen(q1);
        kZoo.shtoKafshen(q2);
        kZoo.shtoKafshen(m1);
        kZoo.shtoKafshen(m2);

        kZoo.shtypTigratLloji("tiger normal");
        
        Kafsha[] tG = kZoo.khteTrajnuarGjinia('F');
        for(Kafsha kTG : tG) {
            System.out.println(kTG);
        }

        System.out.println(kZoo.macjaMeERe());
        kZoo.shtypQenteEVaksinuar(1);
    }
}
