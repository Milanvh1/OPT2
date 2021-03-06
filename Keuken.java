package com.example.alrijneziekenhuisapp;

import java.util.ArrayList;
import java.util.Scanner;

import static com.example.alrijneziekenhuisapp.HelloApplication.scanner;

public class Keuken extends Bestelling {


    public static ArrayList<Maaltijd> maaltijdlijst = new ArrayList<>();

    public static ArrayList<Maaltijd> BesteldeMaaltijdenLijst() {
        maaltijdlijst.add(new Maaltijd("Een broodje met ham en een broodje met kaas", "Koffie", "Kippensoep"));
        maaltijdlijst.add(new Maaltijd("Twee ham kaas tosti's", "Melk", "Geen extraatje"));
        maaltijdlijst.add(new Maaltijd("Aardappels met bloemkool, kipfilet en een romige saus", "Thee", "Vanille ijs"));

        return maaltijdlijst;
    }

    public static void totaalOverzichtMaaltijden() {
        printTotaalOverzichtMaaltijden();
    }

    public static void printTotaalOverzichtMaaltijden() {

        System.out.println("Bestellingen: ");
        for (Maaltijd maaltijd : maaltijdlijst) {

            System.out.println("Eten: " + maaltijd.getEten() + "\nDrinken: " + maaltijd.getDrinken()
                    + "\nExtra: " + maaltijd.getExtra());
        }
        scanner.nextLine();
        System.out.println("Druk enter als u terug wilt naar het menu.");
        scanner.nextLine();
        Menu.keuzePatiënt();
    }

    public static void addMaaltijd(String eten, String drinken, String extra) {

        maaltijdlijst.add(new Maaltijd(eten, drinken, extra));
        System.out.println("Maaltijd succesvol toegevoegd.");

    }

    public static boolean removeMaaltijd(String eten, String drinken, String extra) {
        for (int i = 0; i < maaltijdlijst.size(); i++) {
            if (eten.equals(maaltijdlijst.get(i).getEten()) && drinken.equals(maaltijdlijst.get(i).getDrinken()) &&
                    extra.equals(maaltijdlijst.get(i).getExtra())) {
                System.out.printf("Maaltijd: %s (%d) Drinken: %s (%d) Extra: %d succesvol verwijderd.", maaltijdlijst.get(i).getEten(),
                        maaltijdlijst.get(i).getDrinken(), maaltijdlijst.get(i).getExtra());
                maaltijdlijst.remove(i);
                return true;
            }
        }
        System.out.println("Maaltijd niet gevonden.");
        return false;
    }

    public static void printBeschrijvingMaaltijden() {
        System.out.println("Wat voor soort maaltijd is het? ");
        System.out.println("1) Ochtend");
        System.out.println("2) Middag");
        System.out.println("3) Avond");
        Scanner scanner = new Scanner(System.in);
        int keuze = scanner.nextInt();
        if (keuze == 1) {
            Menu.stappenplanBereidenOchtendEten();
        }
        else if (keuze == 2) {
            Menu.stappenplanBereidenMiddagEten();
        }
        else if (keuze == 3) {
            Menu.stappenplanBereidenAvondEten();
        } else {
            System.out.println("Kies alleen 1 tot 3!");
            printBeschrijvingMaaltijden();
        }
        scanner.nextLine();
        System.out.println("");
        System.out.println("Druk enter als u terug wilt naar het menu.");
        scanner.nextLine();
        Menu.keuzePatiënt();
    }
}
