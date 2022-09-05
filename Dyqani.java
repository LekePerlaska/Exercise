public class Dyqani {
    private String emri;
    private Pajisja[] pajisjet;
    int index = 0;

    public Dyqani(String e, byte nr) {
        emri = e;
        pajisjet = new Pajisja[nr];
    }

    public boolean ekziston(Pajisja p) {
        for(int i=0; i<index; i++) {
            if(p.equals(pajisjet[i])) {
                return true;
            }
        }
        return false;
    }

    public void shtoPajisjen(Pajisja p) {
        if(ekziston(p)){
            System.out.println("Ekziston!");
        }else if(index == pajisjet.length) {
            System.out.println("Nuk ka vend!");
        }else {
            pajisjet[index++] = p;
        }
    }

    public void shtypBaterite(boolean b) {
        for(int i=0; i<index; i++) {
            if(b == pajisjet[i].getKaBateri()) {
                System.out.println(pajisjet[i]);
            }
        }
    }

    public Pajisja minVoltazha() {
        Pajisja minV = null;

        for(int i=0; i<index; i++) {
            if(minV == null) {
                minV = pajisjet[i];
            }else if (minV.getVoltazhi() >= pajisjet[i].getVoltazhi()) {
                minV = pajisjet[i];
            }
        }
        return minV;
    }
    
    public Pajisja[] ktheSipasProdhuesit(String pr) {
        Pajisja[] ksp;
        int count = 0;

        for(int i=0; i<index; i++) {
            if(pr.contains(pajisjet[i].getProdhuesi())) {
                count++;
            }
        }
        ksp = new Pajisja[count];
        int pro = 0;
        for(int i=0; i<index; i++) {
            if (pr.equals(pajisjet[i].getProdhuesi())){
                ksp[pro++] = pajisjet[i];
            }
        }
        return ksp;
    }

    public void fshijPajisjen(Pajisja p) {
        for(int i=0; i<index; i++) {
            if(p.equal(pajisjet[i])) {
                for(int j = i; j<index-1; j++){
                    pajisjet[j] = pajisjet[j+1];
                    }
                pajisjet[--index] = null;
                i--;
            }
        }
    }

    public static void main(String[] args) {
        Dyqani dq1 = new Dyqani("ABC Shop", (byte)50);

        Pajisja p1 = new Pajisja((short)12187, "AAA", (short)123, true);
        Pajisja p2 = new Pajisja((short)23235, "BBB", (short)111, true);
        Pajisja p3 = new Pajisja((short)21235, "CCC", (short)152, false);
        Pajisja p4 = new Pajisja((short)26332, "AAA", (short)154, true);
        Pajisja p5 = new Pajisja((short)34252, "DDD", (short)113, false);
        Pajisja p6 = new Pajisja((short)12523, "AAA", (short)111, true);

        dq1.shtoPajisjen(p1);
        dq1.shtoPajisjen(p2);
        dq1.shtoPajisjen(p3);
        dq1.shtoPajisjen(p4);
        dq1.shtoPajisjen(p5);
        dq1.shtoPajisjen(p6);

        dq1.fshijPajisjen(p4);

        dq1.shtypBaterite(true);

        System.out.println(dq1.minVoltazha());

        Pajisja[] pA = dq1.ktheSipasProdhuesit("AAA");
        for(Pajisja p : pA) {
            System.out.println(p);
        }

        
    }
}