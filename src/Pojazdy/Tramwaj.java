package Pojazdy;

import java.util.HashMap;
import java.util.Map;

public class Tramwaj extends Pojazd {
    protected static int forId=1;
    private int id;
    protected static final HashMap<Integer, Tramwaj> wszystkieTramwaje = new HashMap<>();

    public Tramwaj() {
    }
    public Tramwaj stworzTramwaj(){
        Tramwaj tramwaj = new Tramwaj();
        wszystkieTramwaje.put(forId,tramwaj);
        id = forId;
        forId++;
        wszystkiePojazdy.put(forIdPojazd,tramwaj);
        forIdPojazd++;
        return tramwaj;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Tramwaj " +
                id + "\n";
    }

    public static HashMap<Integer, Tramwaj> getWszystkieTramwaje() {
        return wszystkieTramwaje;
    }
    public static void setWszystkieTramwaje(Map<Integer, Tramwaj> map) {
        wszystkieTramwaje.putAll(map);
    }
}
