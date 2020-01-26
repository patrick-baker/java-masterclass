package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(137, 43));
        System.out.println(getDurationString(36963));
    }

    public static String getDurationString (int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid values";
        }
        int hours = minutes / 60;
        int newMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0"+hoursString;
        }
        String minutesString = newMinutes + "m";
        if (newMinutes < 10) {
            minutesString = "0"+minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0"+secondsString;
        }
        return (minutes+"m"+seconds+"s"+" = "+hoursString+minutesString+secondsString);
    }

    public static String getDurationString (int seconds) {
        if (seconds < 0) {
            return "Invalid values";
        }
        int minutes = seconds / 60;
        int newSeconds = seconds % 60;
        return getDurationString(minutes, newSeconds);
    }

}
