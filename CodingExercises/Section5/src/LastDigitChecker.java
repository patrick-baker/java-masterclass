public class LastDigitChecker {

    public static boolean hasSameLastDigit (int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3))
            return false;
        if (num1 % 10 == num2 % 10 || num1 % 10 == num3 % 10 || num2 % 10 == num3 % 10)
            return true;
        return false;
    }

    public static boolean isValid (int number) {
        // returns false if the number is not within the valid range
        if (number < 10 || number > 1000)
            return false;
        return true;
    }

}
