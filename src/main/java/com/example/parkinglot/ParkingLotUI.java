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

    }

    private void setUpWindowLayout(){

    }



}
