package com.company;

public class Gebruiker {
    private String naam;
    private Integer patiëntnummer;

    public Gebruiker(String naam, Integer patiëntnummer) {
        this.naam = naam;
        this.patiëntnummer = patiëntnummer;
    }

    public String getNaam() {
        return naam;
    }

    public Integer getPatiëntnummer() {
        return patiëntnummer;
    }

}

