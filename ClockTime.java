/**
 * Name: Jovanni maya
 * Course: CSCI 241- Computer Science I
 * Assignment 9
 * 
 * Project/ Class Description: 
 * This class instantiates varibles, checks for errors, formats
 * and compares clocks/times.
 * 
 * Known Bugs:
 * None!
 */

public class ClockTime{
    // keeps time in the 24hr fomat
    private int hour;
    private int minute;
    private int second;
    //constructor w/o parameter to set each instance variable to 0
    public ClockTime(){
        hour = 0;
        minute = 0;
        second = 0;
    }

    //alternate constructor verion of top constructor
    public ClockTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        //if-else statement for seconds
        if(second> 59){
            minute+= second / 60;
            second %= 60;
        } else if ( second < 0 ){
            second = 0;
        }

        //if-else statement for minutes 
        if(minute > 59){
            hour += minute / 60;
            minute %= 60;
        } else if ( minute < 0 ){
            minute = 0;
        }

        //if-else statement for hours
        if( hour > 23) {
            hour %= 24;

        } else if( hour < 0) {
            hour = 0;
        }
    }

    //getter methods
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    //Setter method for range checks 
    public void setHour(int hour) {
        if(hour >=0 && hour<=23) {
            this.hour = hour;
        } else if( hour < 0) {
            this.hour = 0;
        } else {
            this.hour = 23;
        }
    }

    public void setMinute(int minute) {
        if(minute >= 0 && minute <=59) {
            this.minute = minute;
        } else if (minute < 0) {
            this.minute = 0;
        } else {
            this.minute = 59;
        }
    }

    public void setSecond(int second) {
        if(second >= 0 && second <=59) {
            this.second = second;
        } else if(second < 0) {
            this.second= 0;
        } else {
            this.second = 59;
        }
    }

    //methods to create theh string
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString12() {
        int formattedHour =(hour == 0 || hour == 12) ? 12 : hour%12;
        String amPm = (hour < 12) ? "A.M." : "P.M.";
        return String.format("%02d:%02d:%02d %s", formattedHour, minute, second, amPm);
    }

    //methods to calculate
    public void advance( int seconds) {
        int totalSeconds = hour * 3600 +minute * 60 + second + seconds;
        //to mak sure its not negative
        totalSeconds = (totalSeconds + 86400) % 86400;
        hour = totalSeconds/ 3600;
        minute = (totalSeconds % 3600) / 60;
        second = totalSeconds % 60;
    }

    //method to compare
    public boolean equals(ClockTime otherTime) { 
        return this.hour == otherTime.getHour() && this.minute == otherTime.getMinute() && this.second == otherTime.getSecond();
    }
}