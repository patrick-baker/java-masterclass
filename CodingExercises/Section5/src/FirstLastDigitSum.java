public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number) {
        // returns -1 if number is negative
        if (number < 0)
            return -1;
        int sum = 0;
        // adds last digit to sum
        sum += (number % 10);
        // alters the number down to just the first digit
        while (number >= 10) {
            number = (number / 10);
        }
        // adds first digit to sum and returns total sum
        sum += number;
        return sum;
    }
}
