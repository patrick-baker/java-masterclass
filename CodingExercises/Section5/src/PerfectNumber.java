public class PerfectNumber {

    public static boolean isPerfectNumber (int number) {
        // number returns false below zero
        if (number < 1)
            return false;
        // int variable to be sum of all positive divisors
        int sumOfDivisors = 0;

        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0)
                sumOfDivisors += i;
        }
        if (number == sumOfDivisors)
            return true;
        else
            return false;
    }

}
