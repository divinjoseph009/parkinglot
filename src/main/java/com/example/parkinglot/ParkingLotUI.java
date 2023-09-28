package com.example.parkinglot;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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

    }



}
