package com.example.parkinglot;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
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

        durationResultLabel = new Label("Duration: ");
        durationResult = new Text();

        feeResultLabel = new Label("Fee: ");
        feeResult = new Text();
    }

    private void setUpWindowLayout(){
        VBox vBox = new VBox(20, entryTimeLabel, entryTimeText, exitTimeLabel, exitTimeText, submitButton, durationResultLabel, durationResult, feeResultLabel, feeResult);
        Scene scene = new Scene(vBox, 400, 400);
        stage.setTitle("Parking Lot Management");
        stage.setScene(scene);
        stage.show();
    }

    public String getUserEntryTime() { return  entryTimeText.getText(); }
    public String getUserExitTime() { return  entryTimeText.getText(); }
    public Button getSubmitButton() { return submitButton; }



}
