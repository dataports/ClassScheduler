package com.example.a774261.classscheduler;

import java.lang.*;
import java.util.Date;

//Class for handling the schedule data for the classroom
public class Classroom {

    private String roomNumber; //classrooms number
    private String roomLocation; //building
    private String roomName; //building and room number

    public Classroom(String roomNumber, String roomLocation, String roomName) {
        this.roomNumber = roomNumber;
        this.roomLocation = roomLocation;
        this.roomName = roomName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomLocation() {
        return roomLocation;
    }

    public void setRoomLocation(String roomLocation) {
        this.roomLocation = roomLocation;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "Room Booked is:'" + roomName + '\'' +
                '}';
    }
}
