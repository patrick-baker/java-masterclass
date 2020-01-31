package com.company;

public class Main {

    public static void main(String[] args) {
        // sum all numbers that are divisible by both 3 and 5, and only allow 5 numbers to summed
        int sum = 0;
        int count = 0;
	    for (int i = 1; i <= 1000; i++) {
	        if (count == 5)
	            break;
	        if (i%3==0 && i%5==0) {
	            count ++;
                sum += i;
                System.out.println("Sum = " + sum + " + " + i);
            }
        }
        System.out.println("Final Sum = " + sum);
    }
}
