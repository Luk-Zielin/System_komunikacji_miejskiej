package Pojazdy;

import java.util.HashMap;
import java.util.Map;

public class Autobus extends Pojazd {
    protected static int forId=1;
    private int id;
    protected static final HashMap<Integer, Autobus> wszystkieAutobusy = new HashMap<>();

    public Autobus() {
    }
    public Autobus stworzAutobus(){
        Autobus autobus = new Autobus();
        wszystkieAutobusy.put(forId,autobus);
        id = forId;
        forId++;
        wszystkiePojazdy.put(forIdPojazd,autobus);
        forIdPojazd++;
        return autobus;
    }
    public HashMap<Integer, Autobus> getwszystkieAutobusy(){
        return wszystkieAutobusy;
    }
    public void setwszystkieAutobusy(Map<Integer, Autobus> map){
        wszystkieAutobusy.putAll(map);
    }

    @Override
    public String toString() {
        return "Autobus " +
                 id + "\n";
    }

    public int getId() {
        return id;
    }
}
