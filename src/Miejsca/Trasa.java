package Miejsca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Trasa {
    private String nazwa;

    private static int forID=1;
    private int id;
    protected static final HashMap<Integer, Trasa> wszystkieTrasy = new HashMap<>();
    private final ArrayList<Przystanek> listaPrzystankow = new ArrayList<>();

    private Trasa(String nazwa){
        this.nazwa = nazwa;
        id=forID;
    }
    public Trasa stworzTrase(String nazwa){
        Trasa trasa = new Trasa(nazwa);
        wszystkieTrasy.put(forID,trasa);
        forID++;
        return trasa;
    }

    @Override
    public String toString() {
        return "Trasa{" +
                "nazwa='" + nazwa + '\'' +
                ", id=" + id +"\n"+
                ", listaPrzystankow=" + listaPrzystankow +
                '}';
    }

    public int getId() {
        return id;
    }

    public ArrayList<Przystanek> getListaPrzystankow() {
        return listaPrzystankow;
    }

    public static HashMap<Integer, Trasa> getWszystkieTrasy() {
        return wszystkieTrasy;
    }
    public static void setWszystkieTrasy(Map<Integer, Trasa> map){
        wszystkieTrasy.putAll(map);
    }

    public String getNazwa() {
        return nazwa;
    }
}
