package com.company;

public class Main {

    public static void main(String[] args) {
	    calcFeetAndInchesToCentimeters(3, 6);
	    calcFeetAndInchesToCentimeters(2);
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet < 0 | inches > 12 | inches < 0) {
            return -1;
        }
        double centimeters = (feet * 12 * 2.54) + (inches * 2.54);
        System.out.println("There are " + centimeters + "centimeters in " + feet + " feet and " + inches + " inches." );
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches < 0) {
            return -1;
        } else if (inches <= 12) {
            return calcFeetAndInchesToCentimeters(0, inches);
        }
        double feet = (int)(inches / 12);
        inches = inches % 12;
        return calcFeetAndInchesToCentimeters(feet, inches);
    }
}
