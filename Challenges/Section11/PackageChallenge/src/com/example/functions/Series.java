package com.example.functions;

public class Series {

    public static int nSum (int ceiling) {
        int total = 0;
        for (int i = 1; i <= ceiling; i ++) {
            total += i;
        }
        return total;
    }

    public static int factorial (int ceiling) {
        int total = 1;
        for (int i = 1; i <= ceiling; i ++) {
            total *= i;
        }
        return total;
    }

    public static int fibonacci (int ceiling) {
        if (ceiling == 0) {
            return 0;
        } else if (ceiling == 1) {
            return 1;
        } else {
            return (fibonacci(ceiling - 1) + fibonacci (ceiling - 2));
        }
    }

}
