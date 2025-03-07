package Ludzie;

import Posrednie.Przeglad;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Serwisant extends Pracownik{
    private static final HashMap<Integer, Serwisant> wszyscySerwisanci = new HashMap<>();
    private static int forID = 1;
    ArrayList<Przeglad> przeglady;

    private Serwisant(BigInteger wiek, LocalDateTime dataUrodzenia, String pesel, String adres) {
        super( wiek, dataUrodzenia, pesel, adres);
    }
    public static Serwisant utworzSerwisant(BigInteger wiek, LocalDateTime dataUrodzenia, String pesel, String adres){
        Serwisant serwisant = new Serwisant(wiek, dataUrodzenia, pesel, adres);
        wszyscyPracownicy.put(forIDPracownik,serwisant);
        forIDPracownik++;
        wszyscySerwisanci.put(forID,serwisant);
        forID++;
        return serwisant;
    }

    public static HashMap<Integer, Serwisant> getWszystcySerwisanci() {
        return wszyscySerwisanci;
    }
    public static void setWszystcySerwisanci(Map<Integer, Serwisant> map) {
        wszyscySerwisanci.putAll(map);
    }

    public void rozpocznijPrzeglad(Przeglad przeglad){
        przeglad.rozpocznijPrzeglad(this);
        przeglady.add(przeglad);
    }
    public void dokonczPrzeglad(Przeglad przeglad){
        przeglad.zakonczPrzeglad();
    }
}
