package com.example.alrijneziekenhuisapp;

import java.util.ArrayList;
import java.util.Scanner;
public class Menu {

    private static ArrayList<Maaltijd> ochtendEtenKeuze = new ArrayList<Maaltijd>();
    private static ArrayList<Maaltijd> middagEtenKeuze = new ArrayList<Maaltijd>();
    private static ArrayList<Maaltijd> avondEtenKeuze = new ArrayList<Maaltijd>();
    private static ArrayList<Maaltijd> keuzeDrinken = new ArrayList<Maaltijd>();
    private static ArrayList<Maaltijd> keuzeExtra = new ArrayList<Maaltijd>();

    public static ArrayList<Maaltijd> keuzesOchtendEten() {
        ochtendEtenKeuze.add(new Maaltijd("een broodje met appelstroop en een broodje met kaas"));
        ochtendEtenKeuze.add(new Maaltijd("een broodje met hagelslag en een broodje met ham"));
        ochtendEtenKeuze.add(new Maaltijd("een broodje met ham en een broodje met kaas"));
        ochtendEtenKeuze.add(new Maaltijd("een broodje met ham en een broodje met salami"));
        return ochtendEtenKeuze;
    }

    public static ArrayList<Maaltijd> keuzesMiddagEten() {
        middagEtenKeuze.add(new Maaltijd("een broodje hete kip"));
        middagEtenKeuze.add(new Maaltijd("twee ham kaas tosti's"));
        middagEtenKeuze.add(new Maaltijd("twee kaas tosti's"));
        middagEtenKeuze.add(new Maaltijd("twee vlam tosti's"));
        middagEtenKeuze.add(new Maaltijd("een broodje gezond"));
        return middagEtenKeuze;
    }

    public static ArrayList<Maaltijd> keuzesAvondEten() {
        avondEtenKeuze.add(new Maaltijd("spaghetti met tomatensaus, gehaktballen en kaas"));
        avondEtenKeuze.add(new Maaltijd("spinazie stampot met jus en worst"));
        avondEtenKeuze.add(new Maaltijd("twee broodjes shoarma met knoflooksaus en ijsbergsla"));
        avondEtenKeuze.add(new Maaltijd("rijst met kip, groenten en een zoete saus"));
        avondEtenKeuze.add(new Maaltijd("aardappels met bloemkool, kipfilet en een romige saus"));
        avondEtenKeuze.add(new Maaltijd("pizza margherita"));
        avondEtenKeuze.add(new Maaltijd("pizza salami"));
        return avondEtenKeuze;
    }

    public static ArrayList<Maaltijd> keuzesDrinken() {
        keuzeDrinken.add(new Maaltijd("", "water"));
        keuzeDrinken.add(new Maaltijd("", "koffie"));
        keuzeDrinken.add(new Maaltijd("", "thee"));
        keuzeDrinken.add(new Maaltijd("", "chocolademelk"));
        keuzeDrinken.add(new Maaltijd("", "geen drinken"));
        return keuzeDrinken;
    }

    public static ArrayList<Maaltijd> keuzesExtra() {
        keuzeExtra.add(new Maaltijd("", "", "kippensoep"));
        keuzeExtra.add(new Maaltijd("", "", "tomatensoep"));
        keuzeExtra.add(new Maaltijd("", "", "groentensoep"));
        keuzeExtra.add(new Maaltijd("", "", "yoghurt"));
        keuzeExtra.add(new Maaltijd("", "", "banaan"));
        keuzeExtra.add(new Maaltijd("", "", "appel"));
        keuzeExtra.add(new Maaltijd("", "", "vanille ijs"));
        keuzeExtra.add(new Maaltijd("", "", "geen extraatje"));

        return keuzeExtra;
    }

    public static void selecteerOchtendMaaltijd() {
        keuzesOchtendEten();
        System.out.println("Bij de ochtendmaaltijd horen de volgende keuzes: ");
        System.out.println("1) " + ochtendEtenKeuze.get(0).getEten());
        System.out.println("2) " + ochtendEtenKeuze.get(1).getEten());
        System.out.println("3) " + ochtendEtenKeuze.get(2).getEten());
        System.out.println("4) " + ochtendEtenKeuze.get(3).getEten());
        System.out.println("Kies een maaltijdnummer: ");
        Scanner scanner = new Scanner(System.in);
        int keuzeOchtendEten = scanner.nextInt();
        if (keuzeOchtendEten == 1) {
            System.out.println("U heeft gekozen voor " + ochtendEtenKeuze.get(0).getEten());
            selecteerDrinken();
            selecteerExtra();
            System.out.println("");
            System.out.println("U heeft uw ochtendmaaltijd afgerond");
        } else if (keuzeOchtendEten == 2) {
            System.out.println("U heeft gekozen voor " + ochtendEtenKeuze.get(1).getEten());
            selecteerDrinken();
            selecteerExtra();
            System.out.println("");
            System.out.println("U heeft uw ochtendmaaltijd afgerond");
        } else if (keuzeOchtendEten == 3) {
            System.out.println("U heeft gekozen voor " + ochtendEtenKeuze.get(2).getEten());
            selecteerDrinken();
            selecteerExtra();
            System.out.println("");
            System.out.println("U heeft uw ochtendmaaltijd afgerond");
        } else if (keuzeOchtendEten == 4) {
            System.out.println("U heeft gekozen voor " + ochtendEtenKeuze.get(3).getEten());
            selecteerDrinken();
            selecteerExtra();
            System.out.println("");
            System.out.println("U heeft uw ochtendmaaltijd afgerond");
        } else {
            System.out.println("Kies alleen 1 tot 4!");
            selecteerOchtendMaaltijd();
        }
    }

    public static void selecteerMiddagMaaltijd() {
        keuzesMiddagEten();
        System.out.println("");
        System.out.println("Bij de middagmaaltijd horen de volgende keuzes: ");
        System.out.println("1) " + middagEtenKeuze.get(0).getEten());
        System.out.println("2) " + middagEtenKeuze.get(1).getEten());
        System.out.println("3) " + middagEtenKeuze.get(2).getEten());
        System.out.println("4) " + middagEtenKeuze.get(3).getEten());
        System.out.println("5) " + middagEtenKeuze.get(4).getEten());
        System.out.println("Kies een maaltijdnummer: ");
        Scanner scanner = new Scanner(System.in);
        int keuzeMiddagEten = scanner.nextInt();
        if (keuzeMiddagEten == 1) {
            System.out.println("U heeft gekozen voor " + middagEtenKeuze.get(0).getEten());
            selecteerDrinken();
            selecteerExtra();
            System.out.println("");
            System.out.println("U heeft uw middagmaaltijd afgerond");
        } else if (keuzeMiddagEten == 2) {
            System.out.println("U heeft gekozen voor " + middagEtenKeuze.get(1).getEten());
            selecteerDrinken();
            selecteerExtra();
            System.out.println("");
            System.out.println("U heeft uw middagmaaltijd afgerond");
        } else if (keuzeMiddagEten == 3) {
            System.out.println("U heeft gekozen voor " + middagEtenKeuze.get(2).getEten());
            selecteerDrinken();
            selecteerExtra();
            System.out.println("");
            System.out.println("U heeft uw middagmaaltijd afgerond");
        } else if (keuzeMiddagEten == 4) {
            System.out.println("U heeft gekozen voor " + middagEtenKeuze.get(3).getEten());
            selecteerDrinken();
            selecteerExtra();
            System.out.println("");
            System.out.println("U heeft uw middagmaaltijd afgerond");
        } else if (keuzeMiddagEten == 5) {
            System.out.println("U heeft gekozen voor " + middagEtenKeuze.get(4).getEten());
            selecteerDrinken();
            selecteerExtra();
            System.out.println("");
            System.out.println("U heeft uw middagmaaltijd afgerond");
        } else {
            System.out.println("Kies alleen 1 tot 5!");
            selecteerMiddagMaaltijd();
        }
    }

    public static void selecteerAvondMaaltijd() {
        keuzesAvondEten();
        System.out.println("");
        System.out.println("Bij de avondmaaltijd horen de volgende keuzes: ");
        System.out.println("1) " + avondEtenKeuze.get(0).getEten());
        System.out.println("2) " + avondEtenKeuze.get(1).getEten());
        System.out.println("3) " + avondEtenKeuze.get(2).getEten());
        System.out.println("4) " + avondEtenKeuze.get(3).getEten());
        System.out.println("5) " + avondEtenKeuze.get(4).getEten());
        System.out.println("6) " + avondEtenKeuze.get(5).getEten());
        System.out.println("7) " + avondEtenKeuze.get(6).getEten());
        System.out.println("Kies een maaltijdnummer: ");
        Scanner scanner = new Scanner(System.in);
        int keuzeAvondEten = scanner.nextInt();
        if (keuzeAvondEten == 1) {
            System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(0).getEten());
            selecteerDrinken();
            selecteerExtra();
            System.out.println("");
            System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
        } else if (keuzeAvondEten == 2) {
            System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(1).getEten());
            selecteerDrinken();
            selecteerExtra();
            System.out.println("");
            System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
        } else if (keuzeAvondEten == 3) {
            System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(2).getEten());
            selecteerDrinken();
            selecteerExtra();
            System.out.println("");
            System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
        } else if (keuzeAvondEten == 4) {
            System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(3).getEten());
            selecteerDrinken();
            selecteerExtra();
            System.out.println("");
            System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
        } else if (keuzeAvondEten == 5) {
            System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(4).getEten());
            selecteerDrinken();
            selecteerExtra();
            System.out.println("");
            System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
        } else if (keuzeAvondEten == 6) {
            System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(5).getEten());
            selecteerDrinken();
            selecteerExtra();
            System.out.println("");
            System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
        } else if (keuzeAvondEten == 7) {
            System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(6).getEten());
            selecteerDrinken();
            selecteerExtra();
            System.out.println("");
            System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
        } else {
            System.out.println("Kies alleen 1 tot 7!");
            selecteerAvondMaaltijd();
        }
    }

    public static void selecteerDrinken() {
        keuzesDrinken();
        System.out.println("");
        System.out.print("U kan uw drinken hieruit kiezen: ");
        System.out.println("");
        System.out.println("1) " + keuzeDrinken.get(0).getDrinken());
        System.out.println("2) " + keuzeDrinken.get(1).getDrinken());
        System.out.println("3) " + keuzeDrinken.get(2).getDrinken());
        System.out.println("4) " + keuzeDrinken.get(3).getDrinken());
        System.out.println("0) " + keuzeDrinken.get(4).getDrinken());
        System.out.println("Kies een dranknummer: ");
        Scanner scanner = new Scanner(System.in);
        int keuzeOchtendDrinken = scanner.nextInt();
        if (keuzeOchtendDrinken == 1) {
            System.out.println("U heeft " + keuzeDrinken.get(0).getDrinken() + " gekozen");
        } else if (keuzeOchtendDrinken == 2) {
            System.out.println("U heeft " + keuzeDrinken.get(1).getDrinken() + " gekozen");
        } else if (keuzeOchtendDrinken == 3) {
            System.out.println("U heeft " + keuzeDrinken.get(2).getDrinken() + " gekozen");
        } else if (keuzeOchtendDrinken == 4) {
            System.out.println("U heeft " + keuzeDrinken.get(3).getDrinken() + " gekozen");
        } else if (keuzeOchtendDrinken == 0) {
            System.out.println("U heeft " + keuzeDrinken.get(4).getDrinken() + " gekozen");
        } else {
            System.out.println("Kies alleen 0 tot 4!");
            selecteerDrinken();
        }
    }

    public static void selecteerExtra() {
        keuzesExtra();
        System.out.println("");
        System.out.print("U kan iets extra's kiezen: ");
        System.out.println("");
        System.out.println("1) " + keuzeExtra.get(0).getExtra());
        System.out.println("2) " + keuzeExtra.get(1).getExtra());
        System.out.println("3) " + keuzeExtra.get(2).getExtra());
        System.out.println("4) " + keuzeExtra.get(3).getExtra());
        System.out.println("5) " + keuzeExtra.get(4).getExtra());
        System.out.println("6) " + keuzeExtra.get(5).getExtra());
        System.out.println("7) " + keuzeExtra.get(6).getExtra());
        System.out.println("0) " + keuzeExtra.get(7).getExtra());
        System.out.println("Kies een nummer: ");
        Scanner scanner = new Scanner(System.in);
        int keuzeOchtendDrinken = scanner.nextInt();
        if (keuzeOchtendDrinken == 1) {
            System.out.println("U heeft " + keuzeExtra.get(0).getExtra() + " gekozen");
        } else if (keuzeOchtendDrinken == 2) {
            System.out.println("U heeft " + keuzeExtra.get(1).getExtra() + " gekozen");
        } else if (keuzeOchtendDrinken == 3) {
            System.out.println("U heeft " + keuzeExtra.get(2).getExtra() + " gekozen");
        } else if (keuzeOchtendDrinken == 4) {
            System.out.println("U heeft " + keuzeExtra.get(3).getExtra() + " gekozen");
        } else if (keuzeOchtendDrinken == 5) {
            System.out.println("U heeft een " + keuzeExtra.get(4).getExtra() + " gekozen");
        } else if (keuzeOchtendDrinken == 6) {
            System.out.println("U heeft een " + keuzeExtra.get(5).getExtra() + "gekozen");
        } else if (keuzeOchtendDrinken == 7) {
            System.out.println("U heeft " + keuzeExtra.get(6).getExtra() + " gekozen");
        } else if (keuzeOchtendDrinken == 0) {
            System.out.println("U heeft " + keuzeExtra.get(7).getExtra() + " gekozen");
        } else {
            System.out.println("Kies alleen 0 tot 7!");
            selecteerExtra();
        }
    }

    public static void keuzePati??nt() {
        System.out.println("Menu: ");
        System.out.println("1) Een bestelling plaatsen");
        System.out.println("2) Overzicht bestellingen");
        System.out.println("3) Maaltijd toevoegen");
        System.out.println("4) Maaltijd verwijderen");
        System.out.println("5) Maaltijd stappenplan");
        Scanner scanner = new Scanner(System.in);
        int keuze = scanner.nextInt();
        if (keuze == 1) {
            Menu menu = new Menu();
            menu.selecteerOchtendMaaltijd();
            menu.selecteerMiddagMaaltijd();
            menu.selecteerAvondMaaltijd();
            Bestelling Persoon = new Bestelling();
            Persoon.verstuurMaaltijden();
            System.out.println();
            scanner.nextLine();
            System.out.println("Druk enter als u terug wilt naar het menu.");
            scanner.nextLine();
            Menu.keuzePati??nt();
        } else if (keuze == 2) {
            Keuken.BesteldeMaaltijdenLijst();
            Keuken.printTotaalOverzichtMaaltijden();
        } else if (keuze == 3) {
            HelloApplication.nieuwMaaltijdInschrijven();
        } else if (keuze == 4) {
            HelloApplication.maaltijdVerwijderen();
        } else if (keuze == 5) {
            Keuken.printBeschrijvingMaaltijden();
        } else {
            System.out.println("Kies alleen 1 tot 5!");
            keuzePati??nt();
        }
    }

    public static void stappenplanBereidenOchtendEten() {
            Scanner scanner = new Scanner(System.in);
            keuzesOchtendEten();
            System.out.println("Bij de ochtendmaaltijd horen de volgende keuzes: ");
            System.out.println("1) " + ochtendEtenKeuze.get(0).getEten());
            System.out.println("2) " + ochtendEtenKeuze.get(1).getEten());
            System.out.println("3) " + ochtendEtenKeuze.get(2).getEten());
            System.out.println("4) " + ochtendEtenKeuze.get(3).getEten());
            System.out.println("Kies een maaltijdnummer: ");
            int keuzeOchtendEten = scanner.nextInt();
            if (keuzeOchtendEten == 1) {
                System.out.println("U heeft gekozen voor " + ochtendEtenKeuze.get(0).getEten());
                System.out.println("");
                System.out.println("Stappenplan: Als eerst snijdt u beide broodjes open. Smeer daarna ????n wit broodje met een beetje boter en daarboven op appelstroop.");
                System.out.println("Pak dan het andere overige witte broodje en besmeer die met boter en leg een plakje belegen kaas erop. U bent nu klaar.");
            } else if (keuzeOchtendEten == 2) {
                System.out.println("U heeft gekozen voor " + ochtendEtenKeuze.get(1).getEten());
                System.out.println("");
                System.out.println("Stappenplan: ");
            } else if (keuzeOchtendEten == 3) {
                System.out.println("U heeft gekozen voor " + ochtendEtenKeuze.get(2).getEten());
                System.out.println("");
                System.out.println("Stappenplan: ");
            } else if (keuzeOchtendEten == 4) {
                System.out.println("U heeft gekozen voor " + ochtendEtenKeuze.get(3).getEten());
                System.out.println("");
                System.out.println("Stappenplan: ");
            } else {
                System.out.println("Kies alleen 1 tot 4!");
                stappenplanBereidenOchtendEten();
            }
        }

        public static void stappenplanBereidenMiddagEten () {
            Scanner scanner = new Scanner(System.in);
            keuzesMiddagEten();
            System.out.println("");
            System.out.println("Bij de middagmaaltijd horen de volgende keuzes: ");
            System.out.println("1) " + middagEtenKeuze.get(0).getEten());
            System.out.println("2) " + middagEtenKeuze.get(1).getEten());
            System.out.println("3) " + middagEtenKeuze.get(2).getEten());
            System.out.println("4) " + middagEtenKeuze.get(3).getEten());
            System.out.println("5) " + middagEtenKeuze.get(4).getEten());
            System.out.println("Kies een maaltijdnummer: ");
            int keuzeMiddagEten = scanner.nextInt();
            if (keuzeMiddagEten == 1) {
                System.out.println("U heeft gekozen voor " + middagEtenKeuze.get(0).getEten());
                System.out.println("");
                System.out.println("Stappenplan: ");
            } else if (keuzeMiddagEten == 2) {
                System.out.println("U heeft gekozen voor " + middagEtenKeuze.get(1).getEten());
                System.out.println("");
                System.out.println("Stappenplan: ");
            } else if (keuzeMiddagEten == 3) {
                System.out.println("U heeft gekozen voor " + middagEtenKeuze.get(2).getEten());
                System.out.println("");
                System.out.println("Stappenplan: ");
            } else if (keuzeMiddagEten == 4) {
                System.out.println("U heeft gekozen voor " + middagEtenKeuze.get(3).getEten());
                System.out.println("");
                System.out.println("Stappenplan: ");
            } else if (keuzeMiddagEten == 5) {
                System.out.println("U heeft gekozen voor " + middagEtenKeuze.get(4).getEten());
                System.out.println("");
                System.out.println("Stappenplan: ");
            } else {
                System.out.println("Kies alleen 1 tot 5!");
                stappenplanBereidenMiddagEten();
            }
        }

        public static void stappenplanBereidenAvondEten() {
            Scanner scanner = new Scanner(System.in);
            keuzesAvondEten();
            System.out.println("");
            System.out.println("Bij de avondmaaltijd horen de volgende keuzes: ");
            System.out.println("1) " + avondEtenKeuze.get(0).getEten());
            System.out.println("2) " + avondEtenKeuze.get(1).getEten());
            System.out.println("3) " + avondEtenKeuze.get(2).getEten());
            System.out.println("4) " + avondEtenKeuze.get(3).getEten());
            System.out.println("5) " + avondEtenKeuze.get(4).getEten());
            System.out.println("6) " + avondEtenKeuze.get(5).getEten());
            System.out.println("7) " + avondEtenKeuze.get(6).getEten());
            System.out.println("Kies een maaltijdnummer: ");
            int keuzeAvondEten = scanner.nextInt();
            if (keuzeAvondEten == 1) {
                System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(0).getEten());
                System.out.println("");
                System.out.println("Stappenplan: ");
            } else if (keuzeAvondEten == 2) {
                System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(1).getEten());
                System.out.println("");
                System.out.println("Stappenplan: ");
            } else if (keuzeAvondEten == 3) {
                System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(2).getEten());
                System.out.println("");
                System.out.println("Stappenplan: ");
            } else if (keuzeAvondEten == 4) {
                System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(3).getEten());
                System.out.println("");
                System.out.println("Stappenplan: ");
            } else if (keuzeAvondEten == 5) {
                System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(4).getEten());
                System.out.println("");
                System.out.println("Stappenplan: ");
            } else if (keuzeAvondEten == 6) {
                System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(5).getEten());
                System.out.println("");
                System.out.println("Stappenplan: ");
            } else if (keuzeAvondEten == 7) {
                System.out.println("U heeft gekozen voor " + avondEtenKeuze.get(6).getEten());
                System.out.println("");
                System.out.println("Stappenplan: ");
            } else {
                System.out.println("Kies alleen 1 tot 7!");
                stappenplanBereidenAvondEten();
            }
        }

    public static ArrayList<Maaltijd> getKeuzesOchtendEten() {
        return ochtendEtenKeuze;
    }
    public static ArrayList<Maaltijd> getKeuzesDrinken() {
        return keuzeDrinken;
    }
    public static ArrayList<Maaltijd> getKeuzesExtra() {
        return keuzeExtra;
    }

}







