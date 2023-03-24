package com.engeto.du_l02;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private Room room;
    private Guest guest;
    private Guest otherGuests;
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private boolean isCompanyStay;

    public Booking(Room room, Guest guest, Guest otherGuests, LocalDate arrivalDate, LocalDate departureDate, boolean isCompanyStay) {
        this.room = room;
        this.guest = guest;
        this.otherGuests = otherGuests;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.isCompanyStay = isCompanyStay;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Guest getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(Guest otherGuests) {
        this.otherGuests = otherGuests;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public boolean isCompanyStay() {
        return isCompanyStay;
    }

    public void setCompanyStay(boolean companyStay) {
        isCompanyStay = companyStay;
    }

    @Override
    public String toString() {
        return room + " " + guest + " " + arrivalDate + " " + departureDate + " " + isCompanyStay;
    }
}