package com.engeto.du_l02;

import java.time.LocalDate;

public class Booking {
    private int room;
    private String guest;
    private String otherGuests;
    private LocalDate arrival;
    private LocalDate departure;

    public Booking(int room, String guest, String otherGuests, LocalDate arrival, LocalDate departure) {
        this.room = room;
        this.guest = guest;
        this.otherGuests = otherGuests;
        this.arrival = arrival;
        this.departure = departure;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(String otherGuests) {
        this.otherGuests = otherGuests;
    }

    public LocalDate getArrival() {
        return arrival;
    }

    public void setArrival(LocalDate arrival) {
        this.arrival = arrival;
    }

    public LocalDate getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDate departure) {
        this.departure = departure;
    }
}
