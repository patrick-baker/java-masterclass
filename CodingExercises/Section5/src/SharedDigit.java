public class SharedDigit {

    public static boolean hasSharedDigit (int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }
        // first digits of num1 and num2 respectively
        int firstNum1 = num1 / 10;
        int firstNum2 = num2 / 10;
        // second digits of num1 and num2 respectively
        int secondNum1 = num1 % 10;
        int secondNum2 = num2 % 10;
        if (firstNum1 == firstNum2 || firstNum1 == secondNum2 || secondNum1 == firstNum2 || secondNum1 == secondNum2)
            return true;
        else
            return false;
    }

}
