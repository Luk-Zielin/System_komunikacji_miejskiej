package Inne;

import Ludzie.Kierowca;
import Miejsca.Trasa;
import Pojazdy.Pojazd;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

public class Przejazd {
    private static final HashMap<Integer, Przejazd> wszystkiePrzejazdy = new HashMap<>();
    private Kierowca kierowca;
    private Pojazd pojazd;
    private Trasa trasa;
    private LocalDateTime dataRozpoczecia;
    private LocalDateTime dataZakonczenia;
    public Przejazd rozpocznijPrzejazd(Kierowca aktualnyKierowca) {
        ZoneId z = ZoneId.systemDefault();
        dataRozpoczecia = LocalDateTime.now(z);
        kierowca=aktualnyKierowca;
        return this;
    }
    public void zakonczPrzejazd() {
        ZoneId z = ZoneId.systemDefault();
        dataZakonczenia = LocalDateTime.now(z);
    }
    public LocalDateTime getDataRozpoczecia() {
        return dataRozpoczecia;
    }
    public LocalDateTime getDataZakonczenia() {
        return dataZakonczenia;
    }
    public Przejazd(Pojazd pojazd, Trasa trasa) {
        this.pojazd = pojazd;
        this.trasa = trasa;
    }

    public Kierowca getKierowca() {
        return kierowca;
    }

    public Pojazd getPojazd() {
        return pojazd;
    }

    public Trasa getTrasa() {
        return trasa;
    }

    public void setKierowca(Kierowca kierowca) {
        this.kierowca = kierowca;
    }

    public void setPojazd(Pojazd pojazd) {
        this.pojazd = pojazd;
    }

    public void setTrasa(Trasa trasa) {
        this.trasa = trasa;
    }

    public static HashMap<Integer, Przejazd> getWszystkiePrzejazdy() {
        return wszystkiePrzejazdy;
    }
    public static void setWszystkiePrzejazdy(Map<Integer, Przejazd> map) {
        wszystkiePrzejazdy.putAll(map);
    }
}
