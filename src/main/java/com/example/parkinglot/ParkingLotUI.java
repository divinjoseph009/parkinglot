package com.example.parkinglot;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ParkingLotUI {

    Stage stage;
    Label entryTimeLabel;
    TextField entryTimeText;
    Label exitTimeLabel;
    TextField exitTimeText;
    Button submitButton;
    Label durationResultLabel;
    Text durationResult;
    Label feeResultLabel;
    Text feeResult;


    public ParkingLotUI(Stage stage){
        this.stage = stage;
        openWindow();
    }

    private void openWindow(){
        createUIElements();
        setUpWindowLayout();
    }

    private void createUIElements(){
        entryTimeLabel = new Label("Please enter the date and time the car entered the parking lot");

        entryTimeText = new TextField();
        entryTimeText.setPromptText("YYYY-MM-DD HH:mm");

        exitTimeLabel = new Label("Please enter the date and time the car exited the parking lot");

        exitTimeText = new TextField();
        exitTimeText.setPromptText("YYYY-MM-DD HH:mm");

        submitButton = new Button("Submit");
        submitButton.setStyle("-fx-font-size: 14px; -fx-background-color: #4CAF50; -fx-text-fill: white;");

        durationResultLabel = new Label("Duration: ");

        durationResult = new Text();
        durationResult.setStyle("-fx-font-size: 14px; -fx-text-fill: white;");

        feeResultLabel = new Label("Fee: ");

        feeResult = new Text();
        feeResult.setStyle("-fx-font-size: 14px; -fx-text-fill: white;");
    }

    private void setUpWindowLayout(){
        VBox vBox = new VBox(20, entryTimeLabel, entryTimeText, exitTimeLabel, exitTimeText, submitButton, durationResultLabel, durationResult, feeResultLabel, feeResult);
        vBox.setPadding(new Insets(20));
        vBox.setAlignment(Pos.CENTER);
        BackgroundFill backgroundFill = new BackgroundFill(javafx.scene.paint.Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY);
        vBox.setBackground(new Background(backgroundFill));
        Scene scene = new Scene(vBox, 400, 400);
        stage.setTitle("Parking Lot Management");
        stage.setScene(scene);
        stage.show();
    }

    public String getUserEntryTime() { return  entryTimeText.getText(); }
    public String getUserExitTime() { return  exitTimeText.getText(); }
    public Button getSubmitButton() { return submitButton; }
    public Text getDurationResult() { return durationResult; }
    public Text getFeeResult() { return feeResult; }



}
