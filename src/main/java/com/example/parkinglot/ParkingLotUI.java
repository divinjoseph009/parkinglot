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
    TextField entryDateText;
    TextField entryTimeText;
    Label exitTimeLabel;
    TextField exitDateText;
    TextField exitTimeText;
    Button submitButton;
    Label durationResultLabel;
    Text durationResult;
    Label feeResultLabel;
    Text feeResult;


//    public ParkingLotUI(Stage stage){
//        this.stage = stage;
//        openWindow();
//        if(this.stage != null){
//            System.out.println("setting the stage worked");
//        }
//    }
//
//    private void openWindow(){
//        createUIElements();
//        setUpWindowLayout();
//    }
//
//    private void createUIElements(){
//        entryTimeLabel = new Label("Please enter the date and time the car entered the parking lot");
//
//        entryDateText = new TextField();
//        entryDateText.setPromptText("YYYY-MM-DD");
//
//        entryTimeText = new TextField();
//        entryTimeText.setPromptText("HH:mm");
//
//        exitTimeLabel = new Label("Please enter the date and time the car exited the parking lot");
//
//        exitDateText = new TextField();
//        exitDateText.setPromptText("YYYY-MM-DD");
//
//        exitTimeText = new TextField();
//        exitTimeText.setPromptText("HH:mm");
//
//        submitButton = new Button("Submit");
//        submitButton.setStyle("-fx-font-size: 14px; -fx-background-color: #4CAF50; -fx-text-fill: white;");
//
//        durationResultLabel = new Label("Duration: ");
//
//        durationResult = new Text();
//        durationResult.setStyle("-fx-font-size: 14px; -fx-text-fill: white;");
//
//        feeResultLabel = new Label("Fee: ");
//
//        feeResult = new Text();
//        feeResult.setStyle("-fx-font-size: 14px; -fx-text-fill: white;");
//    }
//
//    private void setUpWindowLayout(){
//        VBox vBox = new VBox(20, entryTimeLabel,entryDateText, entryTimeText, exitTimeLabel, exitDateText, exitTimeText, submitButton, durationResultLabel, durationResult, feeResultLabel, feeResult);
//        vBox.setPadding(new Insets(20));
//        vBox.setAlignment(Pos.CENTER);
//        BackgroundFill backgroundFill = new BackgroundFill(javafx.scene.paint.Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY);
//        vBox.setBackground(new Background(backgroundFill));
//        Scene scene = new Scene(vBox, 400, 400);
//        stage.setTitle("Parking Lot Management");
//        stage.setScene(scene);
//        stage.show();
//    }

    public String getUserEntryTime() { return  entryTimeText.getText(); }
    public String getUserEntryDate() { return  entryDateText.getText(); }
    public String getUserExitTime() { return  exitTimeText.getText(); }
    public String getUserExitDate() { return  exitDateText.getText(); }
    public Button getSubmitButton() { return submitButton; }
    public Text getDurationResult() { return durationResult; }
    public Text getFeeResult() { return feeResult; }



}
