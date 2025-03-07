package Ludzie;

import Inne.Kwalifikacja;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public abstract class Pracownik {
    private BigInteger wiek;
    protected static int forIDPracownik=1;
    protected static final HashMap<Integer, Pracownik> wszyscyPracownicy = new HashMap<>();
    private LocalDateTime dataUrodzenia;
    private String pesel;
    private String adres;
    private ArrayList<String> poprzedniaPraca;
    private final ArrayList<Kwalifikacja> kwalifikacje;

    protected Pracownik( BigInteger wiek, LocalDateTime dataUrodzenia, String pesel, String adres, ArrayList<String> poprzedniaPraca) {
        this.wiek = wiek;
        this.dataUrodzenia = dataUrodzenia;
        this.pesel = pesel;
        this.adres = adres;
        this.poprzedniaPraca = new ArrayList<>(poprzedniaPraca);
        this.kwalifikacje = new ArrayList<Kwalifikacja>();
    }

    protected Pracownik( BigInteger wiek, LocalDateTime dataUrodzenia, String pesel, String adres) {
        this.wiek = wiek;
        this.dataUrodzenia = dataUrodzenia;
        this.pesel = pesel;
        this.adres = adres;
        this.poprzedniaPraca = new ArrayList<String>();
        this.kwalifikacje = new ArrayList<Kwalifikacja>();
    }

    public BigInteger getWiek() {
        return wiek;
    }

    public void setWiek(BigInteger wiek) {
        this.wiek = wiek;
    }

    public LocalDateTime getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDateTime dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    public void dodajDoMiejscPracy(String miejscePracy){
        poprzedniaPraca.add(miejscePracy);
    }
    public void usunZMiejscPracy(String miejscePracy){
        if (!poprzedniaPraca.contains(miejscePracy)){
            poprzedniaPraca = new ArrayList<>(poprzedniaPraca.stream().filter(praca -> !praca.equals(miejscePracy)).toList());
        }else{
            poprzedniaPraca.remove(miejscePracy);
        }

    }
    public void dodajDoKwalifikacji(Kwalifikacja kwalifikacja){
        kwalifikacje.add(kwalifikacja);
    }
    public void usunZKwalifikacji(Kwalifikacja kwalifikacja){
        kwalifikacje.remove(kwalifikacja);

    }

    public ArrayList<String> getPoprzedniaPraca() {
        return poprzedniaPraca;
    }

    public ArrayList<Kwalifikacja> getKwalifikacje() {
        return kwalifikacje;
    }

    public static HashMap<Integer, Pracownik> getWszyscyPracownicy() {
        return wszyscyPracownicy;
    }
    public static void setWszyscyPracownicy(Map<Integer, Pracownik> map){
        wszyscyPracownicy.putAll(map);
    }
}
