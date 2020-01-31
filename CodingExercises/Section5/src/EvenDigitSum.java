public class EvenDigitSum {

    public static int getEvenDigitSum (int number) {
        // excludes negative values
        if (number < 0)
            return -1;
        // the sum variable to be returned
        int sum = 0;
        // the digit in consideration in the while loop
        int currentDigit = 0;
        while (number > 0) {
            // sets current digit to final digit of number
            currentDigit = number % 10;
            // adds number if it is even
            if (currentDigit % 2 == 0)
                sum += currentDigit;
            // removes final digit
            number /= 10;
        }
        return sum;
    }

}
