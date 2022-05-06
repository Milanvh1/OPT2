package com.company;

public class Maaltijd {
    private String eten;
    private String drinken;
    private String extra;

    public Maaltijd() {

    }
    public Maaltijd(String eten) {
        this.eten = eten;
    }

    public Maaltijd(String eten, String drinken) {
        this.eten = eten;
        this.drinken = drinken;
    }

    public Maaltijd(String eten, String drinken, String extra) {
        this.eten = eten;
        this.drinken = drinken;
        this.extra = extra;
    }

    public String getEten() {
        return eten;
    }

    public String getDrinken() {
        return drinken;
    }

    public String getExtra() {
        return extra;
    }
}
