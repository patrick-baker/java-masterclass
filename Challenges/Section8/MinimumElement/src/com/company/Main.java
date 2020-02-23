package com.company;
import java.util.Scanner;

// TASK - write a method that creates an array from user entered numbers, and another method that finds the minimum in that array

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of numbers you want in your array.");
        int count = scanner.nextInt();
        
        int[] arrayToTest = readIntegers(count, scanner);
        System.out.println(findMin(arrayToTest));
        scanner.close();

    }

    public static int[] readIntegers (int count, Scanner scanner) {
        // initializes array of length count
        int[] array = new int[count];
        // creates counter that increments as values are assigned in array
        int arrayCount = 0;
        // runs until all values in array have been assigned by user
        while (arrayCount < count) {
            System.out.println("What is the next number in the array?");
            // only assigns number values
            if (scanner.hasNextInt()) {
                array[arrayCount] = scanner.nextInt();
                arrayCount ++;
                scanner.nextLine();
                // notifies the user of error if a non integer has been entered
            } else {
                System.out.println("I am sorry, that is not a number. Please enter a number.");
                scanner.nextLine();
            }
        }
        return array;
    }

    public static int findMin(int[] array) {
        // sets the current lowestInt to the first integer of the array
        int lowestInt = array[0];
        for (int i = 1; i < array.length; i++) {
            // if the next int is lower, lowestInt is reassigned that integer as its value
            if (array[i] < lowestInt) {
                lowestInt = array[i];
            }
        }
        return lowestInt;
    }


}
