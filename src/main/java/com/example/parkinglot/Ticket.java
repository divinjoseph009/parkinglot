package com.example.parkinglot;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.ZoneId;


public class Ticket {
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;



//    Ticket(LocalDateTime entryTime, LocalDateTime exitTime){
//        this.entryTime = entryTime;
//        this.exitTime = exitTime;
//
//    }



    //getters for the entry and exit time
    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    //parse the strings that the user inputs into the correct int format.
    public void setEntryTime(String entryTime) {
        this.entryTime = LocalDateTime.parse(entryTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }

    public void setExitTime(String exitTime) {
        this.exitTime = LocalDateTime.parse(exitTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }


    //Calculate Duration from Entry and Exit Time
    public int getDurationDays() {
        ZonedDateTime entryZonedDateTime = entryTime.atZone(ZoneId.systemDefault());
        ZonedDateTime exitZonedDateTime = exitTime.atZone(ZoneId.systemDefault());
        long durationDays = Duration.between(entryTime, exitTime).toDays();
        return (int) durationDays;
    }

    public int getDurationHours() {
        ZonedDateTime entryZonedDateTime = entryTime.atZone(ZoneId.systemDefault());
        ZonedDateTime exitZonedDateTime = exitTime.atZone(ZoneId.systemDefault());
        long durationHours = Duration.between(entryTime, exitTime).toHours();
        return (int) durationHours;
    }

    public int getDurationMinutes() {
        ZonedDateTime entryZonedDateTime = entryTime.atZone(ZoneId.systemDefault());
        ZonedDateTime exitZonedDateTime = exitTime.atZone(ZoneId.systemDefault());
        long durationMinutes = Duration.between(entryTime, exitTime).toMinutes();
        return (int) durationMinutes;
    }


    //This method calculates the duration in minutes on the first day,
    // if the stay is less than or equal to 30 minutes,
    // the DURATION (not costs) is rounded down to zero.
    public int calculateDurationOnFirstDay() {
        int minutes = getDurationMinutes();
        if (minutes <= 30) {
            return 0;
        }
        return minutes;
    }
}
