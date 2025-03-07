package Posrednie;

import Ludzie.Serwisant;
import Pojazdy.Pojazd;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;


public class Przeglad {
    private static final HashMap<Integer, Przeglad> wszystkiePrzeglady = new HashMap<>();
    private static int forID = 1;
    private Serwisant ktoWykonuje;
    private Pojazd pojazd;
    private LocalDateTime dataRozpoczecia;
    private LocalDateTime dataZakonczenia;
    private String opisProblemu;
    private String typPrzegladu;

    private Przeglad(LocalDateTime dataRozpoczecia, String opisProblemu, String typPrzegladu, Pojazd pojazd) {
        this.dataRozpoczecia = dataRozpoczecia;
        this.opisProblemu = opisProblemu;
        this.typPrzegladu = typPrzegladu;
        this.pojazd = pojazd;
    }

    public Serwisant getKtoWykonuje() {
        return ktoWykonuje;
    }
    public static HashMap<Integer, Przeglad> getWszystkiePrzeglady(){
        return wszystkiePrzeglady;
    }

    public static void setWszystkiePrzeglady(Map<Integer, Przeglad> mapa){
        wszystkiePrzeglady.putAll(mapa);
    }

    public static Przeglad utworzPrzeglad(LocalDateTime dataRozpoczecia, String opisProblemu, String typPrzegladu, Pojazd pojazd){
        Przeglad przegladtmp = new Przeglad(dataRozpoczecia, opisProblemu, typPrzegladu, pojazd);
        wszystkiePrzeglady.put(forID, przegladtmp);
        forID++;
        return przegladtmp;
    }

    public Pojazd getPojazd() {
        return pojazd;
    }

    public static int getForID() {
        return forID;
    }

    public void setPojazd(Pojazd pojazd) {
        pojazd.dodajPrzeglad(this);
        this.pojazd = pojazd;
    }

    public LocalDateTime getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public void setDataRozpoczecia(LocalDateTime dataRozpoczecia) {
        this.dataRozpoczecia = dataRozpoczecia;
    }

    public LocalDateTime getDataZakonczenia() {
        return dataZakonczenia;
    }

    public void setDataZakonczenia(LocalDateTime dataZakonczenia) {
        this.dataZakonczenia = dataZakonczenia;
    }

    public String getOpisProblemu() {
        return opisProblemu;
    }

    public void setOpisProblemu(String opisProblemu) {
        this.opisProblemu = opisProblemu;
    }

    public String getTypPrzegladu() {
        return typPrzegladu;
    }

    public void setTypPrzegladu(String typPrzegladu) {
        this.typPrzegladu = typPrzegladu;
    }

    public void zakonczPrzeglad() {

        ZoneId z = ZoneId.systemDefault();
        dataZakonczenia=LocalDateTime.now(z);
    }

    public Serwisant getKtoWykonal() {
        return ktoWykonuje;
    }

    public void rozpocznijPrzeglad(Serwisant serwisant) {
        ktoWykonuje=serwisant;
    }
}
