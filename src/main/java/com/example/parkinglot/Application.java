package com.example.parkinglot;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        ParkingLotUI parkingLotUI = new ParkingLotUI(stage);
        Ticket ticket = new Ticket();
        ParkingLot parkingLot=new ParkingLot(ticket);
        new Controller(parkingLotUI, parkingLot, ticket);
    }

    public static void main(String[] args) {
        launch();
    }
}