public class TheList {
    private String emri;
    private Anime[] animes;
    int index = 0;

    public TheList(String e, int nrA) {
        emri = e;
        animes = new Anime[nrA];
    }

    public boolean ekziston(Anime a) {
        for(int i=0; i<index; i++) {
            if(a.equal(animes[i])) {
                return true;
            }
        }
        
        return false;
    }

    public void shtoAnime(Anime a) {
        if(index == animes.length) {
            System.out.println("Nuk ka vend!");
        }else if(ekziston(a)) {
            System.out.println("Ekziston!");
        }else {
            animes[index++] = a;
        }
    }

    public void printoje() {
        Anime temp = null;
        for(int i=0; i<index; i++) {
            for(int j=i+1; j<index; j++) {
                if((animes[i].getEmri()).compareTo(animes[j].getEmri())>0) {
                    temp = animes[i];
                    animes[i] = animes[j];
                    animes[j] = temp;
                }
            }
            System.out.println(animes[i]);
        }
    }

    public Anime[] favorite() {
        Anime[] favoriteAnime = null;
        int count = 0;
        Anime temp = null;
        for(int i=0; i<index; i++) {
            for(int j=i+1; j<index; j++) {
                if((animes[i].getEmri()).compareTo(animes[j].getEmri())>0) {
                    temp = animes[i];
                    animes[i] = animes[j];
                    animes[j] = temp;
                }
            }
            if(animes[i].getFavorite() == true) {
                count++;
            }
        }
        int p = 0;
        favoriteAnime = new Anime[count];

        for(int i=0; i<index; i++) {
            if(animes[i].getFavorite() == true) {
                favoriteAnime[p++] = animes[i];
            }
        }

        return favoriteAnime;
    }

    public static void main(String[] args) {
        TheList animeList = new TheList("Lista e Animeve", 10);
        Anime a1 = new Anime("Monster", "Naoki Urasawa", (short)2004, true);
        Anime a2 = new Anime("Dragon Ball", "Akira Toriama", (short)1986, true);
        Anime a3 = new Anime("Vinland Saga", "Makoto Yukimura", (short)2019, true);
        Anime a4 = new Anime("Akira", "Katsuhiro Otomo", (short)1988, true);
        Anime a5 = new Anime("Re:Zero", "Nagtsuki Tappei", (short)2016, true);
        Anime a6 = new Anime("One Punch-Man", "ONE/Ysuke Murata", (short)2015, true);
        Anime a7 = new Anime("Hunter x Hunter", "Yoshihiro Togashi", (short)2011, true);
        Anime a8 = new Anime("Death Note", "Tsugumi Ohba/Takeshi Obata", (short)2006, false);
        Anime a9 = new Anime("Arcane", "Riot Games", (short)2021, true);
        Anime a10 = new Anime("Castlevania", "???", (short)2017, true);

        animeList.shtoAnime(a1);
        animeList.shtoAnime(a2);
        animeList.shtoAnime(a3);
        animeList.shtoAnime(a4);
        animeList.shtoAnime(a5);
        animeList.shtoAnime(a6);
        animeList.shtoAnime(a7);
        animeList.shtoAnime(a8);
        animeList.shtoAnime(a9);
        animeList.shtoAnime(a10);

        //animeList.printoje();

        Anime faA[] = animeList.favorite();
        for(Anime fav: faA) {
            System.out.println(fav);
        }

    }
}
