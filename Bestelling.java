package com.company;

import java.util.ArrayList;

public class Bestelling {

    public int bestellingsnummer;
    private ArrayList<MaaltijdInhoud> alleMaaltijden = initialiseerMaaltijden();

    private ArrayList<MaaltijdInhoud> initialiseerMaaltijden() {
        ArrayList<MaaltijdInhoud> lijstMetMaaltijden = new ArrayList<>();
        MaaltijdInhoud ochtendMaaltijd = new OchtendMaaltijd();
        MaaltijdInhoud middagMaaltijd = new MiddagMaaltijd();
        MaaltijdInhoud avondMaaltijd = new AvondMaaltijd();
        lijstMetMaaltijden.add(ochtendMaaltijd);
        lijstMetMaaltijden.add(middagMaaltijd);
        lijstMetMaaltijden.add(avondMaaltijd);
        return lijstMetMaaltijden;
    }
    public void verstuurBestellingen() {
        for(MaaltijdInhoud maaltijd : alleMaaltijden) {
            maaltijd.verstuurMaaltijd();
        }
    }
}

interface MaaltijdInhoud {
    public void verstuurMaaltijd();
}

class OchtendMaaltijd extends Maaltijd implements MaaltijdInhoud {
    public String eten;
    public String drinken;
    public String extra;

    @Override
    public void verstuurMaaltijd() {
        System.out.println("Ochtendmaaltijd verstuurd!");
    }
}

class MiddagMaaltijd extends Maaltijd implements MaaltijdInhoud{
    public String eten;
    public String drinken;
    public String extra;

    @Override
    public void verstuurMaaltijd() {
        System.out.println("Middagmaaltijd verstuurd!");
    }
}

class AvondMaaltijd extends Maaltijd implements MaaltijdInhoud{
    public String eten;
    public String drinken;
    public String extra;

    @Override
    public void verstuurMaaltijd() {
        System.out.println("Avondmaaltijd verstuurd!");
    }
}