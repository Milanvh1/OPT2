package com.example.alrijneziekenhuisapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;


public class HelloApplication extends Application {

    private static Stage stg;
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void start(Stage primaryStage) throws IOException {
        stg = primaryStage;
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("Alrijne Ziekenhuis Bestellingsapplicatie");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch(args);
        Menu.keuzePatiënt();
    }

    public static void nieuwMaaltijdInschrijven() {
        System.out.println("Voer de naam van de eten in die u wilt toevoegen:");
        String eten = scanner.nextLine();
        System.out.println("Voer de naam van het drinken in die u wilt toevoegen:");
        String drinken = scanner.nextLine();
        System.out.println("Voer de naam van het extraatje in die u wilt toevoegen:");
        String extra = scanner.nextLine();
        Keuken.addMaaltijd(eten, drinken, extra);
        scanner.nextLine();
        System.out.println("Druk enter als u terug wilt naar het menu.");
        scanner.nextLine();
        Menu.keuzePatiënt();
    }

    public static void maaltijdVerwijderen() {
        System.out.println("Voer de naam van het eten in die u wilt verwijderen:");
        String eten = scanner.nextLine();
        System.out.println("Voer de naam van het drinken in die u wilt verwijderen:");
        String drinken = scanner.nextLine();
        System.out.println("Voer de naam van het extraatje in die u wilt verwijderen:");
        String extra = scanner.nextLine();
        Keuken.removeMaaltijd(eten, drinken, extra);
        scanner.nextLine();
        System.out.println("Druk enter als u terug wilt naar het menu.");
        scanner.nextLine();
        Menu.keuzePatiënt();
    }
}

