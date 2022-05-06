package com.company;

import java.util.Scanner;
import com.company.Bestelling;
public class Menu {
        public void selecteerOchtendMaaltijd() {
            System.out.println("Bij de ochtendmaaltijd horen de volgende keuzes: ");
            System.out.println("1) Een broodje met zoetigheid en een broodje met kaas");
            System.out.println("2) Een broodje met zoetigheid en een broodje met ham");
            System.out.println("3) Een broodje met ham en een broodje met kaas");
            System.out.println("4) Een broodje met ham en een broodje met salami");
            System.out.println("Kies een maaltijdnummer: ");
            Scanner scanner = new Scanner(System.in);
            int keuzeOchtendEten = scanner.nextInt();
            if (keuzeOchtendEten == 1) {
                System.out.println("U heeft gekozen voor een broodje met zoetigheid en een broodje met kaas");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw ochtendmaaltijd afgerond");
            } else if (keuzeOchtendEten == 2) {
                System.out.println("U heeft gekozen voor een broodje met zoetigheid en een broodje met ham");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw ochtendmaaltijd afgerond");
            } else if (keuzeOchtendEten == 3) {
                System.out.println("U heeft gekozen voor een broodje met ham en een broodje met kaas");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw ochtendmaaltijd afgerond");
            } else if (keuzeOchtendEten == 4) {
                System.out.println("U heeft gekozen voor een broodje met ham en een broodje met salami");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw ochtendmaaltijd afgerond");
            } else {
                System.out.println("Kies alleen 1 tot 4!");
                selecteerOchtendMaaltijd();
            }
        }
        public void selecteerMiddagMaaltijd() {
            System.out.println("");
            System.out.println("Bij de middagmaaltijd horen de volgende keuzes: ");
            System.out.println("1) Een broodje hete kip");
            System.out.println("2) Twee ham kaas tosti's");
            System.out.println("3) Twee kaas tosti's");
            System.out.println("4) Twee vlam tosti's");
            System.out.println("5) Een broodje gezond");
            System.out.println("Kies een maaltijdnummer: ");
            Scanner scanner = new Scanner(System.in);
            int keuzeMiddagEten = scanner.nextInt();
            if (keuzeMiddagEten == 1) {
                System.out.println("U heeft gekozen voor een broodje hete kip");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw middagmaaltijd afgerond");
            } else if (keuzeMiddagEten == 2) {
                System.out.println("U heeft gekozen voor twee ham kaas tosti's");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw middagmaaltijd afgerond");
            } else if (keuzeMiddagEten == 3) {
                System.out.println("U heeft gekozen voor twee kaas tosti's");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw middagmaaltijd afgerond");
            } else if (keuzeMiddagEten == 4) {
                System.out.println("U heeft gekozen voor twee vlam tosti's");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw middagmaaltijd afgerond");
            } else if (keuzeMiddagEten == 5) {
                System.out.println("U heeft gekozen voor een een broodje gezond");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw middagmaaltijd afgerond");
            } else {
                System.out.println("Kies alleen 1 tot 5!");
                selecteerMiddagMaaltijd();
            }
        }
        public void selecteerAvondMaaltijd(){
            System.out.println("");
            System.out.println("Bij de avondmaaltijd horen de volgende keuzes: ");
            System.out.println("1) Spaghetti met tomatensaus, gehaktballen en kaas");
            System.out.println("2) Spinazie stampot met jus en worst");
            System.out.println("3) Twee broodjes shoarma met knoflooksaus en ijsbergsla");
            System.out.println("4) Aardappels met broccoli, schnitzel en kerriesaus");
            System.out.println("5) Rijst met kip, groenten en een zoete saus");
            System.out.println("6) Aardappels met bloemkool, kipfilet en een romige saus");
            System.out.println("7) Pizza margherita");
            System.out.println("8) Pizza salami");
            System.out.println("Kies een maaltijdnummer: ");
            Scanner scanner = new Scanner(System.in);
            int keuzeAvondEten = scanner.nextInt();
            if (keuzeAvondEten == 1) {
                System.out.println("U heeft gekozen voor spaghetti met tomatensaus en gehaktballen");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
            } else if (keuzeAvondEten == 2) {
                System.out.println("U heeft gekozen voor spinazie stampot met worst");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
            } else if (keuzeAvondEten == 3) {
                System.out.println("U heeft gekozen voor twee Broodjes shoarma met knoflooksaus en ijsbergsla");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
            } else if (keuzeAvondEten == 4) {
                System.out.println("Aardappels met broccoli, schnitzel en kerriesaus");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
            } else if (keuzeAvondEten == 5) {
                System.out.println("Rijst met kip, groenten en een zoete saus");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
            } else if (keuzeAvondEten == 6) {
                System.out.println("Aardappels met bloemkool, kipfilet en een romige saus");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
            } else if (keuzeAvondEten == 7) {
                System.out.println("Pizza margherita");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
            } else if (keuzeAvondEten == 8) {
                System.out.println("Pizza margherita");
                selecteerDrinken();
                selecteerExtra();
                System.out.println("");
                System.out.println("U heeft uw avondmaaltijd gekozen, hierdoor is heel uw bestelling afgerond");
            } else {
                System.out.println("Kies alleen 1 tot 8!");
                selecteerAvondMaaltijd();
            }
        }
        public void selecteerDrinken() {
            System.out.println("");
            System.out.print("U kan uw drinken hieruit kiezen: ");
            System.out.println("");
            System.out.println("1) Water");
            System.out.println("2) Koffie");
            System.out.println("3) Thee");
            System.out.println("4) Chocolademelk");
            System.out.println("0) Geen drinken");
            System.out.println("Kies een dranknummer: ");
            Scanner scanner = new Scanner(System.in);
            int keuzeOchtendDrinken = scanner.nextInt();
            if (keuzeOchtendDrinken == 1) {
                System.out.println("U heeft water gekozen");
            } else if (keuzeOchtendDrinken == 2) {
                System.out.println("U heeft koffie gekozen");
            } else if (keuzeOchtendDrinken == 3) {
                System.out.println("U heeft thee gekozen");
            } else if (keuzeOchtendDrinken == 4) {
                System.out.println("U heeft chocolademelk gekozen");
            } else if (keuzeOchtendDrinken == 5) {
                System.out.println("U heeft melk gekozen");
            } else if (keuzeOchtendDrinken == 0) {
                System.out.println("U heeft geen drinken gekozen");
            } else {
                System.out.println("Kies alleen 0 tot 5!");
                selecteerDrinken();
            }
        }

    public void selecteerExtra() {
        System.out.println("");
        System.out.print("U kan iets extra's kiezen: ");
        System.out.println("");
        System.out.println("1) Kippensoep");
        System.out.println("2) Tomatensoep");
        System.out.println("3) Groentensoep");
        System.out.println("4) Yoghurt");
        System.out.println("5) Banaan");
        System.out.println("6) Appel");
        System.out.println("7) Vanille ijs");
        System.out.println("0) Geen extraatje");
        System.out.println("Kies een nummer: ");
        Scanner scanner = new Scanner(System.in);
        int keuzeOchtendDrinken = scanner.nextInt();
        if (keuzeOchtendDrinken == 1) {
            System.out.println("U heeft kippensoep gekozen");
        } else if (keuzeOchtendDrinken == 2) {
            System.out.println("U heeft tomatensoep gekozen");
        } else if (keuzeOchtendDrinken == 3) {
            System.out.println("U heeft groentensoep gekozen");
        } else if (keuzeOchtendDrinken == 4) {
            System.out.println("U heeft yoghurt gekozen");
        } else if (keuzeOchtendDrinken == 5) {
            System.out.println("U heeft een banaan gekozen");
        } else if (keuzeOchtendDrinken == 6) {
            System.out.println("U heeft een Appel gekozen");
        } else if (keuzeOchtendDrinken == 7) {
            System.out.println("U heeft vanille ijs gekozen");
        } else if (keuzeOchtendDrinken == 0) {
            System.out.println("U heeft geen drinken gekozen");
        } else {
            System.out.println("Kies alleen 0 tot 7!");
            selecteerExtra();
        }
    }
}




