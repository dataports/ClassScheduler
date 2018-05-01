package com.example.a774261.classscheduler;

import java.util.Date;

//define a 10 hour day schedule for classroom time, implement methods for filling hour blocks of time
//Classroom class is used to access variables for the room number and location of the schedule
public class FullDaySchedule extends Classroom {

        private Classroom currentRoom;
        private int dayOfSchedule;
        private int monthOfSchedule;
        private int yearOfSchedule;
        //hour is not booked if true
        private boolean eightAM = true;
        private boolean nineAM = true ;
        private boolean tenAM = true;
        private boolean elevenAM = true;
        private boolean twelvePM = true;
        private boolean onePM = true;
        private boolean twoPM = true;
        private boolean threePM = true;
        private boolean fourPM = true;
        private boolean fivePM = true;
        private boolean sixPM = true;
        private boolean sevenPM = true;
        private boolean eightPM = true;
        private boolean ninePM = true;

    public boolean isEightAM() {
        return eightAM;
    }

    public void setEightAM(boolean eightAM) {
        this.eightAM = eightAM;
    }

    public boolean isNineAM() {
        return nineAM;
    }

    public void setNineAM(boolean nineAM) {
        this.nineAM = nineAM;
    }

    public boolean isTenAM() {
        return tenAM;
    }

    public void setTenAM(boolean tenAM) {
        this.tenAM = tenAM;
    }

    public boolean isElevenAM() {
        return elevenAM;
    }

    public void setElevenAM(boolean elevenAM) {
        this.elevenAM = elevenAM;
    }

    public boolean isTwelvePM() {
        return twelvePM;
    }

    public void setTwelvePM(boolean twelvePM) {
        this.twelvePM = twelvePM;
    }

    public boolean isOnePM() {
        return onePM;
    }

    public void setOnePM(boolean onePM) {
        this.onePM = onePM;
    }

    public boolean isTwoPM() {
        return twoPM;
    }

    public void setTwoPM(boolean twoPM) {
        this.twoPM = twoPM;
    }

    public boolean isThreePM() {
        return threePM;
    }

    public void setThreePM(boolean threePM) {
        this.threePM = threePM;
    }

    public boolean isFourPM() {
        return fourPM;
    }

    public void setFourPM(boolean fourPM) {
        this.fourPM = fourPM;
    }

    public boolean isFivePM() {
        return fivePM;
    }

    public void setFivePM(boolean fivePM) {
        this.fivePM = fivePM;
    }

    public boolean isSixPM() {
        return sixPM;
    }

    public void setSixPM(boolean sixPM) {
        this.sixPM = sixPM;
    }

    public boolean isSevenPM() {
        return sevenPM;
    }

    public void setSevenPM(boolean sevenPM) {
        this.sevenPM = sevenPM;
    }

    public boolean isEightPM() {
        return eightPM;
    }

    public void setEightPM(boolean eightPM) {
        this.eightPM = eightPM;
    }

    public boolean isNinePM() {
        return ninePM;
    }

    public void setNinePM(boolean ninePM) {
        this.ninePM = ninePM;
    }
}
