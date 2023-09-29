package com.example.parkinglot;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Models
        Ticket ticket = new Ticket();
        ParkingLot parkingLot=new ParkingLot(ticket);

        // View
        ParkingLotUI parkingLotUI = new ParkingLotUI(stage);

        // Controller
        Controller controller = new Controller(parkingLotUI, parkingLot, ticket);
        controller.runApplication();
    }

    public static void main(String[] args) {
        launch();
    }
}