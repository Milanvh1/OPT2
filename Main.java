package com.company;

import java.awt.*;
import java.util.Scanner;
import com.company.Menu;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.selecteerOchtendMaaltijd();
        menu.selecteerMiddagMaaltijd();
        menu.selecteerAvondMaaltijd();
        Bestelling Persoon = new Bestelling();
        Persoon.verstuurBestellingen();
    }
}
