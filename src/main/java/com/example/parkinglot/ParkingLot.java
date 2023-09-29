package com.example.parkinglot;

public class ParkingLot {
    Ticket parkingTicket = new Ticket();


    public double calculateFees() {
        int durationDays = parkingTicket.getDurationDays();
        int durationHours = parkingTicket.getDurationHours();
        int durationMinutes = parkingTicket.getDurationMinutes();
        int fee = 0;

        if (durationDays == 0 && durationHours == 0 && durationMinutes <= 30) {
            return fee;
        } else {
            fee += 15 * durationDays;
            int remainingHours = durationHours - (durationDays * 24);
            int remainingMins = durationMinutes - (durationDays * 1440) - (durationHours * 60);
            int lastDaysFee = 2 * remainingHours;

            if (remainingMins > 0) {
                lastDaysFee += 2;
            }

            fee += Math.min(lastDaysFee, 15);

            return fee;
        }
    }
}
