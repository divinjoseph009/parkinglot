package com.example.parkinglot;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.time.DateTimeException;
import java.time.LocalDateTime;

public class Controller {
    //reference to UI elements
    private ParkingLotUI window;
    Ticket ticket;
    ParkingLot parkingLot;
    Ticket ticketCalculation=new Ticket();
    LocalDateTime entryTime=ticketCalculation.getEntryTime();

    LocalDateTime exitTime=ticketCalculation.getExitTime();


    public Controller(ParkingLotUI parkingLotUI, ParkingLot parkingLot){
        this.window=parkingLotUI;
        this.parkingLot=parkingLot;
    }

    public void setUpHandlers(){
        window.getSubmitButton().setOnAction(e->{
            try{
                if(entryTime.isBefore(exitTime)) {
                    int durationInDays = ticketCalculation.getDurationDays();
                    int durationInHours = ticketCalculation.getDurationHours();
                    int durationInMinutes= ticketCalculation.getDurationMinutes();
                    double fees=parkingLot.calculateFees();
                    System.out.println("Duration: "+durationInDays + " "+ durationInHours +" "+durationInMinutes);
                    System.out.printf("Fee: "+fees);
                }

                }catch (DateTimeException exception){
                System.out.println("This is not a valid date");

            }
        });
    }
}




