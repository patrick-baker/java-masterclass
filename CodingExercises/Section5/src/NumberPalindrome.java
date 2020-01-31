public class NumberPalindrome {

    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int originalNumber = number;
        if (number > 0) {
            while (number > 0) {
                reverse *= 10;
                reverse += number % 10;
                number /= 10;
            }
        }
        else if (number < 0) {
            while (number < 0) {
                reverse *= 10;
                reverse -= number % 10 * -1;
                number /= 10;
            }
        }
        System.out.println("original Number = " + originalNumber);
        System.out.println("reverse Number = " + reverse);
        if (reverse == originalNumber)
            return true;
        else
            return false;
    }

}
