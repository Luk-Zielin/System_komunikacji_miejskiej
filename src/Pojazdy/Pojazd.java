package Pojazdy;


import Ludzie.Serwisant;
import Posrednie.Przeglad;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;


public abstract class Pojazd {
    protected static int forIdPojazd=1;
    protected static final HashMap<Integer, Pojazd> wszystkiePojazdy = new HashMap<>();
    private final HashMap<Integer, Przeglad> historiaPrzegladow = new HashMap<>();
    public String wypiszWszystkiePojazdy(){
        return wszystkiePojazdy.toString();
    }
    public String wypiszWszystkiePojazdy(Serwisant serwisant){
        ArrayList<Pojazd> Pojazdy = new ArrayList<>();
        for (Map.Entry<Integer, Przeglad> przegladEntry:
        Przeglad.getWszystkiePrzeglady().entrySet()){
            if(przegladEntry.getValue().getKtoWykonal().equals(serwisant)){
                Pojazdy.add(przegladEntry.getValue().getPojazd());
            }
        };
        return Pojazdy.toString();
    }

    public void dodajPrzeglad(Przeglad przeglad){
        historiaPrzegladow.put(Przeglad.getForID(),przeglad);
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "historiaPrzegladow=" + historiaPrzegladow +
                '}';
    }
    public static void setWszystkiePojazdy(Map<Integer, Pojazd> pojazdy){
        wszystkiePojazdy.putAll(pojazdy);
    }
}
