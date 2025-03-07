package Miejsca;

import Pojazdy.Pojazd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Przystanek {

    private static int forId = 1;
    private int id;
    protected static final HashMap<Integer, Przystanek> wszystkiePrzystanki = new HashMap<>();
    private boolean czyAktywny;
    private String adres;

    private Przystanek(boolean czyAktywny, String adres) {
        this.czyAktywny = czyAktywny;
        this.adres = adres;
        id=forId;
    }
    public Przystanek stworzPrzystanek(boolean czyAktywny, String adres){
        Przystanek przystanek = new Przystanek(czyAktywny, adres);
        wszystkiePrzystanki.put(forId, przystanek);
        forId++;
        return przystanek;
    }

    public boolean CzyAktywny() {
        return czyAktywny;
    }

    public void setCzyAktywny(boolean czyAktywny) {
        this.czyAktywny = czyAktywny;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    public void zmienAktywnosc(){
        czyAktywny=!czyAktywny;
    }

    @Override
    public String toString() {
        return "przystanek \nid:" + id + "\nadres: " + adres + "\n";
    }

    public int getId() {
        return id;
    }

    public static HashMap<Integer, Przystanek> getWszystkiePrzystanki() {
        return wszystkiePrzystanki;
    }
    public static void setWszystkiePrzystanki(Map<Integer, Przystanek> map){
        wszystkiePrzystanki.putAll(map);
        ArrayList<Przystanek> list = new ArrayList<>();
    }
}
