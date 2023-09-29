package com.example.parkinglot;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.time.DateTimeException;
import java.time.LocalDateTime;

public class Controller {
    //reference to UI elements
    private ParkingLotUI window;
    ParkingLot parkingLot;
    Ticket ticket;

    public Controller(Ticket ticket, ParkingLot parkingLot, ParkingLotUI parkingLotUI ){
        this.ticket=ticket;
        this.parkingLot=parkingLot;
        this.window=parkingLotUI;
    }

    public void runApplication(){
        setUpHandlers();
    }


    public void setUpHandlers(){
        window.getSubmitButton().setOnAction(e->{
            Text durationResult = window.getDurationResult();
            Text feeResult = window.getFeeResult();

            try{
                String userEntryTime = window.getUserEntryTime();
                String userExitTime = window.getUserExitTime();
                String userEntryDate = window.getUserEntryDate();
                String userExitDate = window.getUserExitDate();
                String userEntryDateTime = userEntryDate + " " + userEntryTime;
                String userExitDateTime = userExitDate + " " + userExitTime;
                ticket.setEntryTime(userEntryDateTime);
                ticket.setExitTime(userExitDateTime);
                LocalDateTime entryTime=ticket.getEntryTime();
                LocalDateTime exitTime=ticket.getExitTime();


                if(entryTime.isBefore(exitTime)) {
                    double fees=parkingLot.calculateFees();
                    int days = parkingLot.durationDays;
                    int hours = parkingLot.remainingHours;
                    int minutes = parkingLot.remainingMinutes;

                    durationResult.setText("Days: " + days + "     Hours: " + hours + "     Minutes: " + minutes);
                    feeResult.setText("$ " + fees);
                }

                }catch (DateTimeException exception){
                durationResult.setText("This is not a valid date");
                durationResult.setFill(Color.RED);
            }
        });
    }
}




