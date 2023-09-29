package com.example.parkinglot;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.ZoneId;


public class Ticket {
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;



    //getters for the entry and exit time
    public LocalDateTime getEntryTime() {
        return entryTime;
    }



    public LocalDateTime getExitTime() {
        return exitTime;
    }

    //parse the strings that the user inputs into the correct int format.
    public void setEntryTime(String userEntryTime) {
        entryTime = LocalDateTime.parse(userEntryTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }

    public void setExitTime(String userExitTime) {
        exitTime = LocalDateTime.parse(userExitTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }



    //Calculate Duration from Entry and Exit Time
    public int getDurationDays() {


        ZonedDateTime entryZonedDateTime = entryTime.atZone(ZoneId.systemDefault());
        ZonedDateTime exitZonedDateTime = exitTime.atZone(ZoneId.systemDefault());
        long durationDays = Duration.between(entryZonedDateTime, exitZonedDateTime).toDays();
        return (int) durationDays;
    }

    public int getDurationHours() {
        ZonedDateTime entryZonedDateTime = entryTime.atZone(ZoneId.systemDefault());
        ZonedDateTime exitZonedDateTime = exitTime.atZone(ZoneId.systemDefault());
        long durationHours = Duration.between(entryZonedDateTime, exitZonedDateTime).toHours();
        return (int) durationHours;
    }

    public int getDurationMinutes() {
        ZonedDateTime entryZonedDateTime = entryTime.atZone(ZoneId.systemDefault());
        ZonedDateTime exitZonedDateTime = exitTime.atZone(ZoneId.systemDefault());
        long durationMinutes = Duration.between(entryZonedDateTime, exitZonedDateTime).toMinutes();
        return (int) durationMinutes;
    }
}
