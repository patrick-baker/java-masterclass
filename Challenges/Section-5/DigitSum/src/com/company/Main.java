package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(473));
        System.out.println(sumDigits(29));
        System.out.println(sumDigits(-3));
        System.out.println(sumDigits(34589));
    }

    public static int sumDigits (int number) {
        // doesn't allow any integers that are only one digit or less than zero
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            // adds the last digit of number to sum variable
            sum += number % 10;
            // drops that digit from number
            number = number / 10;
        }
        return sum;
    }
}
