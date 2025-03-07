package Inne;



import Pojazdy.Pojazd;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Kwalifikacja {
    private static final HashMap<Integer, Kwalifikacja> wszystkieKwalifikacje = new HashMap<>();

    private static int forID = 1;
    private LocalDateTime dataWaznosci;
    private String opis;
    private final ArrayList<Pojazd> jakiPojazd = new ArrayList<>();

    private Kwalifikacja(LocalDateTime dataWaznosci, String opis) {
        this.dataWaznosci = dataWaznosci;
        this.opis = opis;
    }
    public static Kwalifikacja utworzKwalifikacja(LocalDateTime dataWaznosci, String opis){
        Kwalifikacja kwalifikacjatmp = new Kwalifikacja(dataWaznosci, opis);
        wszystkieKwalifikacje.put(forID,kwalifikacjatmp);
        forID++;
        return kwalifikacjatmp;
    }

    public static HashMap<Integer, Kwalifikacja> getWszystkieKwalifikacje() {
        return wszystkieKwalifikacje;
    }
    public static void setWszystkieKwalifikacje(HashMap<Integer, Kwalifikacja> wszystkieKwalifikacje){
        Kwalifikacja.wszystkieKwalifikacje.putAll(wszystkieKwalifikacje);
    }
    public LocalDateTime getDataWaznosci() {
        return dataWaznosci;
    }

    public void setDataWaznosci(LocalDateTime dataWaznosci) {
        this.dataWaznosci = dataWaznosci;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
    public void addPojazd(Pojazd pojazd){
        jakiPojazd.add(pojazd);
    }
    public Pojazd removePojazd(Pojazd pojazd){
        return jakiPojazd.remove(jakiPojazd.indexOf(pojazd));
    }
}
