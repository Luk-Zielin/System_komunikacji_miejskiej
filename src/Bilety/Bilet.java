package Bilety;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;

public abstract class Bilet {
    protected static final HashMap<Integer, Bilet> wszystkieBilety = new HashMap<>();
    protected static int forId=1;
    protected LocalDateTime dataWaznosci;

    protected int dlugoscWaznosciBiletuMinuty;

    public void aktywujBilet(){
        ZoneId z = ZoneId.systemDefault();
        dataWaznosci = LocalDateTime.now(z).plusMinutes(dlugoscWaznosciBiletuMinuty);
    }

    public LocalDateTime getDataWaznosci() {
        return dataWaznosci;
    }
}
