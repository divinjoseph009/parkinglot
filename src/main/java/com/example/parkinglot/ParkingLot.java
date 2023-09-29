package com.example.parkinglot;

public class ParkingLot {

    Ticket ticket;
    int durationDays;
    int remainingHours;
    int remainingMinutes;


    ParkingLot(Ticket ticket) {
        this.ticket = ticket;
    }


    public double calculateFees() {

        durationDays = ticket.getDurationDays();
        int durationHours = ticket.getDurationHours();
        int durationMinutes = ticket.getDurationMinutes();
        remainingHours = durationHours - (durationDays * 24);
        remainingMinutes = durationMinutes - (durationDays * 1440) - (remainingHours * 60);
        int fee = 0;

        if (durationDays == 0 && durationHours == 0 && durationMinutes <= 30) {
            return fee;
        } else {
            fee += 15 * durationDays;

            int lastDaysFee = 2 * remainingHours;

            if (remainingMinutes > 0) {
                lastDaysFee += 2;
            }

            fee += Math.min(lastDaysFee, 15);

            return fee;
        }
    }
}
