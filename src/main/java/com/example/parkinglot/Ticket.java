package com.example.parkinglot;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    LocalDateTime entryTime;
    LocalDateTime exitTime;

//    Ticket(LocalDateTime entryTime, LocalDateTime exitTime){
//        this.entryTime = entryTime;
//        this.exitTime = exitTime;
//
//    }

    //Calculate Duration from Entry and Exit Time
    public int getDurationDays() {
        return Duration.between(entryTime,exitTime).toDays();
    }

    public int getDurationHours() {
        return Duration.between(entryTime,exitTime).toHours();
    }

    public int getDurationMinutes() {
        return Duration.between(entryTime,exitTime).toMinutes();
    }





}
