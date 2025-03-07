package Ludzie;

import Inne.Przejazd;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Kierowca extends Pracownik{
    private static final HashMap<Integer, Kierowca> wszyscyKierowcy = new HashMap<>();
    private static int forID = 1;
    ArrayList<Przejazd> przejazdy = new ArrayList<>();


    private Kierowca(BigInteger wiek, LocalDateTime dataUrodzenia, String pesel, String adres, ArrayList<String> poprzedniaPraca) {
        super(wiek, dataUrodzenia, pesel, adres, poprzedniaPraca);

    }

    public static Kierowca stworzKierowce(BigInteger wiek, LocalDateTime dataUrodzenia, String pesel, String adres, ArrayList<String> poprzedniaPraca){
        Kierowca kierowca = new Kierowca(wiek, dataUrodzenia, pesel, adres, poprzedniaPraca);
        wszyscyKierowcy.put(forID, kierowca);
        forID++;
        wszyscyPracownicy.put(forIDPracownik,kierowca);
        forIDPracownik++;
        return kierowca;
    }
    public void rozpocznijPrzejazd(Przejazd przejazd){
        przejazd.rozpocznijPrzejazd(this);
    }
    public void zakonczPrzejazd(Przejazd przejazd){
        przejazd.zakonczPrzejazd();
    }
    public void dodajPrzejazd(Przejazd przejazd){
        przejazdy.add(przejazd);
    }

    public static HashMap<Integer, Kierowca> getWszyscyKierowcy() {
        return wszyscyKierowcy;
    }
    public static void setWszyscyKierowcy(Map<Integer, Kierowca> map){
        wszyscyKierowcy.putAll(map);
    }
}
