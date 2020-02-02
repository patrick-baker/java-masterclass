public class NumberToWords {

    public static void numberToWords (int number) {
        // sets the digit count to add trailing zeros
        int digitCount = getDigitCount(number);
        // reverses the input so that the output is in the correct order
        number = reverse(number);
        if (number < 0)
            System.out.println("Invalid Value");
        int count = 0;
        while (number > 0) {
            int numberToWord = number % 10;
            number /= 10;
            count ++;
            switch (numberToWord) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
            }
        }
        while (count < digitCount) {
            count++;
            System.out.println("Zero");
        }
    }

    // reverses the input
    public static int reverse (int number) {
        int reversedNumber = 0;
        while (number != 0) {
            // moves current variable back by ten
            reversedNumber *= 10;
            // adds final digit of number onto reversedNumber
            reversedNumber += number % 10;
            // removes final digit of number
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount (int number) {
        if (number < 0)
            return -1;
        int digitCount = 1;
        while (number >= 10) {
            number /= 10;
            digitCount++;
        }
        return digitCount;
    }

}
