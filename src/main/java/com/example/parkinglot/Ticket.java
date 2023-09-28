package com.example.parkinglot;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.ZoneId;


public class Ticket {
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    int year =2023;
    boolean isLeapYear= Year.of(year).isLeap();

//    Ticket(LocalDateTime entryTime, LocalDateTime exitTime){
//        this.entryTime = entryTime;
//        this.exitTime = exitTime;
//
//    }

    //parse the strings that the user inputs into the correct int format.
    public void setEntryTime(String entryTime){
        this.entryTime=LocalDateTime.parse(entryTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }
    public void setExitTime(String exitTime){
        this.exitTime=LocalDateTime.parse(exitTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }

    //Calculate Duration from Entry and Exit Time
    public int getDurationDays() {
        return (int) Duration.between(entryTime,exitTime).toDays();
    }

    public int getDurationHours() {
        return (int) Duration.between(entryTime,exitTime).toHours();
    }

    public int getDurationMinutes() {
        return (int) Duration.between(entryTime,exitTime).toMinutes();
    }


//method to calculate duration on the first day
    public int calculateDurationOnFirstDay(){
        int minutes=getDurationMinutes();
        if (minutes<=30){
            return 0;
        }
        return minutes;
    }
    
    ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
    //boolean isDaylightSavings=zonedDateTime.isDaylightSavings();



}
