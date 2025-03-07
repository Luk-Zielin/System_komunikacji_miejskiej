package Bilety;

import java.util.HashMap;
import java.util.Map;

public class BiletDlugi extends Bilet{
    private static int forIdDlugie = 1;
    private int id;
    protected static final HashMap<Integer, BiletDlugi> wszystkieBiletyDlugie = new HashMap<>();

    public int getId() {
        return id;
    }

    public BiletDlugi() {
        this.dlugoscWaznosciBiletuMinuty = 44640;
        id= forIdDlugie;
    }

    public BiletDlugi stworzBiletKrotki(){
        BiletDlugi biletDlugi = new BiletDlugi();
        wszystkieBilety.put(forId,biletDlugi);
        forId++;
        wszystkieBiletyDlugie.put(forIdDlugie,biletDlugi);
        forIdDlugie++;
        return biletDlugi;
    }

    public static HashMap<Integer, BiletDlugi> getWszystkieBiletyDlugie() {
        return wszystkieBiletyDlugie;
    }
    public static void setWszystkieBiletyDlugie(Map<Integer, BiletDlugi> map) {
        wszystkieBiletyDlugie.putAll(map);
    }

}
