package Bilety;

import java.util.HashMap;
import java.util.Map;

public class BiletKrotki extends Bilet {
    private static int forIdKrotkie = 1;
    private int id;

    protected static final HashMap<Integer, BiletKrotki> wszystkieBiletyKrotkie = new HashMap<>();
    public BiletKrotki() {
        this.dlugoscWaznosciBiletuMinuty = 75;
        id= forIdKrotkie;
    }
    public BiletKrotki stworzBiletKrotki(){
        BiletKrotki biletKrotki = new BiletKrotki();
        wszystkieBilety.put(forId,biletKrotki);
        forId++;
        wszystkieBiletyKrotkie.put(forIdKrotkie,biletKrotki);
        forIdKrotkie++;
        return biletKrotki;
    }
    public int getId() {
        return id;
    }

    public static HashMap<Integer, BiletKrotki> getWszystkieBiletyKrotkie() {
        return wszystkieBiletyKrotkie;
    }
    public static void getWszystkieBiletyKrotkie(Map<Integer, BiletKrotki> map) {
        wszystkieBiletyKrotkie.putAll(map);
    }
}
