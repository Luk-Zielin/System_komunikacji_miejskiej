package Pojazdy;

import java.util.HashMap;
import java.util.Map;

public class PociagMetra extends Pojazd {
    protected static int forId=1;
    private int id;
    protected static final HashMap<Integer, PociagMetra> wszystkiePociagi = new HashMap<>();

    public PociagMetra() {
    }
    public PociagMetra stworzPociag(){
        PociagMetra pociag = new PociagMetra();
        wszystkiePociagi.put(forId,pociag);
        id = forId;
        forId++;
        wszystkiePojazdy.put(forIdPojazd,pociag);
        forIdPojazd++;
        return pociag;
    }

    @Override
    public String toString() {
        return "Pociag Metra " +
                id + "\n";
    }

    public static HashMap<Integer, PociagMetra> getWszystkiePociagi() {
        return wszystkiePociagi;
    }
    public static void setWszystkiePociagi(Map<Integer, PociagMetra> map) {
        wszystkiePociagi.putAll(map);
    }

    public int getId() {
        return id;
    }
}
