package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	// initializes min and max values
    int minimum = 0;
    int maximum = 0;
    // sets variable which allows min and max to be set to first entered number
    boolean firstNumber = true;

    while (true) {
        System.out.println("Enter Number:");
        // boolean checking if value entered is an integer
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int nextInt = scanner.nextInt();
            // sets min and max to first number entered
            if (firstNumber) {
                maximum = nextInt;
                minimum = nextInt;
                firstNumber = false;
            }
            // resets max if entered is larger than previous max value
            if (nextInt > maximum) {
                maximum = nextInt;
                // resets min if entered is larger than previous min value
            } else if (nextInt < minimum) {
                minimum = nextInt;
            }
        } else
            break;
        scanner.nextLine();
    }
    System.out.println("The maximum value you entered was:" + maximum);
    System.out.println("The minimum value you entered was:" + minimum);
    scanner.close();
    }
}
