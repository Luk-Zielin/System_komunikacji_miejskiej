package Ludzie;


import Bilety.Bilet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pasazer {

    public static Bilet KupBilet(){
        System.out.println("Podaj który z biletów chcesz kupić");
        System.out.println("1) Krótko okresowy");
        System.out.println("2) Długo okresowy imienny");
        Bilet bilet= null;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            String wybor = reader.readLine();
            if(wybor.equals("1")){
                //todo wywołąj konstruktor
                System.out.println("1");
            }
            if(wybor.equals("2")){
                System.out.println("2");
                //todo wywołąj konstruktor
            }else{
                throw new RuntimeException("Zły input lol");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //todo wstaw format kupienia biletu
        return bilet;
    }
    public static Bilet aktywujBilet(Bilet bilet){
        bilet.aktywujBilet();
        return bilet;
    }
}
