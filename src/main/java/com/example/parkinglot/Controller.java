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
            try{
                String userEntryTime = window.getUserEntryTime();
                String userExitTime = window.getUserExitTime();
                ticket.setEntryTime(userEntryTime);
                ticket.setExitTime(userExitTime);
                LocalDateTime entryTime=ticket.getEntryTime();
                LocalDateTime exitTime=ticket.getExitTime();

                if(entryTime.isBefore(exitTime)) {
                    int durationInDays = ticket.getDurationDays();
                    int durationInHours = ticket.getDurationHours();
                    int durationInMinutes= ticket.getDurationMinutes();
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




