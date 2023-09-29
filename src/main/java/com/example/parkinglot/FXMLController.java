package com.example.parkinglot;

import java.net.URL;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text durationResult;

    @FXML
    private TextField entryTimeText;

    @FXML
    private TextField entryTimeText1;

    @FXML
    private Text feeResult;

    @FXML
    private Button submitButton;

//    private ParkingLotUI window;
//    ParkingLot parkingLot;
//    Ticket ticket;
//
//    public FXMLController(Ticket ticket, ParkingLot parkingLot, ParkingLotUI parkingLotUI ){
//        this.ticket=ticket;
//        this.parkingLot=parkingLot;
//        this.window=parkingLotUI;
//    }




    @FXML
    void initialize() {
        assert durationResult != null : "fx:id=\"durationResult\" was not injected: check your FXML file 'parkinglot-ui.fxml'.";
        assert entryTimeText != null : "fx:id=\"entryTimeText\" was not injected: check your FXML file 'parkinglot-ui.fxml'.";
        assert entryTimeText1 != null : "fx:id=\"entryTimeText1\" was not injected: check your FXML file 'parkinglot-ui.fxml'.";
        assert feeResult != null : "fx:id=\"feeResult\" was not injected: check your FXML file 'parkinglot-ui.fxml'.";
        assert submitButton != null : "fx:id=\"submitButton\" was not injected: check your FXML file 'parkinglot-ui.fxml'.";

    }

    public void setUpHandlers(ActionEvent event) {
        ParkingLotUI window=new ParkingLotUI();
        Ticket ticket=new Ticket();
        ParkingLot parkingLot=new ParkingLot(ticket);


        window.getSubmitButton().setOnAction(e -> {
            Text durationResult = window.getDurationResult();
            Text feeResult = window.getFeeResult();

            try {
                String userEntryTime = window.getUserEntryTime();
                String userExitTime = window.getUserExitTime();
                String userEntryDate = window.getUserEntryDate();
                String userExitDate = window.getUserExitDate();
                String userEntryDateTime = userEntryDate + " " + userEntryTime;
                String userExitDateTime = userExitDate + " " + userExitTime;
                ticket.setEntryTime(userEntryDateTime);
                ticket.setExitTime(userExitDateTime);
                LocalDateTime entryTime = ticket.getEntryTime();
                LocalDateTime exitTime = ticket.getExitTime();


                if (entryTime.isBefore(exitTime)) {
                    double fees = parkingLot.calculateFees();
                    int days = parkingLot.durationDays;
                    int hours = parkingLot.remainingHours;
                    int minutes = parkingLot.remainingMinutes;

                    durationResult.setText("Days: " + days + "     Hours: " + hours + "     Minutes: " + minutes);
                    feeResult.setText("$ " + fees);
                }

            } catch (DateTimeException exception) {
                durationResult.setText("This is not a valid date");
                durationResult.setFill(Color.RED);
            }
        });
    }

}


