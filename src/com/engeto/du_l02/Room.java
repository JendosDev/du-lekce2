package com.engeto.du_l02;

import java.math.BigDecimal;

public class Room {
    private int roomNumber;
    private int beds;
    private boolean hasBalcony;
    private boolean seeView;
    private BigDecimal valueOfRoom;

    public Room(int roomNumber, int beds, boolean hasBalcony, boolean seeView, BigDecimal valueOfRoom) {
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.hasBalcony = hasBalcony;
        this.seeView = seeView;
        this.valueOfRoom = valueOfRoom;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isSeeView() {
        return seeView;
    }

    public void setSeeView(boolean seeView) {
        this.seeView = seeView;
    }

    public BigDecimal getValueOfRoom() {
        return valueOfRoom;
    }

    public void setValueOfRoom(BigDecimal valueOfRoom) {
        this.valueOfRoom = valueOfRoom;
    }
}
