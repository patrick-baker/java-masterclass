public class LargestPrime {

    public static int getLargestPrime (int number) {
        // 0 and 1 cannot contain prime numbers
        if (number < 2)
            return -1;
        //sets largestPrime initially to -1 in case of no prime factor
        int largestPrime = -1;
        // loops through all numbers between 2 and the number
        for (int i = 2; i <= number; i++) {
            // checks whether i is a factor of number
            if (number % i == 0) {
                boolean isPrime = true;
                // loops through all number between 2 and the factor-1 to check if it is prime
                for (int j = 2; j < i; j++) {
                    // if a factor that is not one or the number itself is found, then the number is not prime,
                    // which sets isPrime to false
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                // if the number is indeed prime, then largestPrime is set to that number
                if (isPrime)
                    largestPrime = i;
            }
        }
        return largestPrime;
    }

}
