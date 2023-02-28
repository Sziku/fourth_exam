package org.example;

/*
* Task1: készitsünk egy metodust ami egy map-ben vissza adja, hogy egy fájlba ami veszővel elválasztva tartalmaz számokat egy adott szám hányszor van meg.
* A fáj lehet több soros is, és csak a számokat tartalmaza.
* A map tartalmát írjuk ki. (elég main-be kiprobálni)*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        load();
    }

    private static void load() {
        String PATH = "src/main/java/org/example/text1.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(PATH));
            String st = br.readLine();
            Map<String, Integer> numberCount = new HashMap<>();
            while (st != null) {
                String[] loadRow = st.split(",");
                for (String number : loadRow){
                    if(numberCount.containsKey(number)){
                        numberCount.put(number,numberCount.get(number)+1);
                    }else {
                        numberCount.put(number, 1);
                    }
                }

                st = br.readLine();
            }
            System.out.println(numberCount);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}