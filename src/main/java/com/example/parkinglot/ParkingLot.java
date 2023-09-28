package com.example.parkinglot;

public class ParkingLot {
    Ticket parkingTicket = new Ticket();

    private double calculateFees() {
        int durationDays = parkingTicket.getDurationDays();
        int durationHours = parkingTicket.getDurationHours();
        int durationMinutes = parkingTicket.getDurationMinutes();

        if(durationDays==0 && durationHours==0 && durationMinutes<=30) {
            return 0;
        }
        int totalHours = (durationDays * 24) + durationHours;
        int totalFee = totalHours * 2;

        if(totalFee > 15 && durationDays>=1) {
            totalFee = 15 * durationDays ;
            return totalFee;
        } else if (totalFee > 15) {
            totalFee = 15;
            return totalFee;
        } else return totalFee;
    }
}
