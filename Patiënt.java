package com.company;

public class Patiënt {
    
        private String naam;
        private Integer patiëntnummer;

        public Patiënt(String naam, Integer patiëntnummer) {
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


