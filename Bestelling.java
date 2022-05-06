package com.company;

import java.util.ArrayList;

public class Bestelling {

    public int bestellingsnummer;
    private ArrayList<Maaltijd> alleMaaltijden = initialiseerMaaltijden();

    private ArrayList<Maaltijd> initialiseerMaaltijden() {
        ArrayList<Maaltijd> lijstMetMaaltijden = new ArrayList<>();
        Maaltijd ochtendMaaltijd = new OchtendMaaltijd();
        Maaltijd middagMaaltijd = new MiddagMaaltijd();
        Maaltijd avondMaaltijd = new AvondMaaltijd();
        lijstMetMaaltijden.add(ochtendMaaltijd);
        lijstMetMaaltijden.add(middagMaaltijd);
        lijstMetMaaltijden.add(avondMaaltijd);
        return lijstMetMaaltijden;
    }
    public void verstuurBestellingen() {
        for(Maaltijd maaltijd : alleMaaltijden) {
            maaltijd.verstuurMaaltijd();
        }
    }
}

interface Maaltijd {
    public void verstuurMaaltijd();
}

class OchtendMaaltijd implements Maaltijd {
    public String eten;
    public String drinken;
    public String extra;

    @Override
    public void verstuurMaaltijd() {
        System.out.println("Ochtendmaaltijd verstuurd!");
    }
}

class MiddagMaaltijd implements Maaltijd {
    public String eten;
    public String drinken;
    public String extra;

    @Override
    public void verstuurMaaltijd() {
        System.out.println("Middagmaaltijd verstuurd!");
    }
}

class AvondMaaltijd implements Maaltijd {
    public String eten;
    public String drinken;
    public String extra;

    @Override
    public void verstuurMaaltijd() {
        System.out.println("Avondmaaltijd verstuurd!");
    }
}