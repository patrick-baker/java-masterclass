public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int num1, int num2) {
        // falsey if either number is below 10
        if (num1 < 10 || num2 < 10)
            return -1;
        // variable to be changed when each higher match is found in loop
        int greatestDivisor = 0;
        // set equal to lowest argument, so loop ends there
        int maxDivisor = 0;
        if (num1 > num2)
            maxDivisor = num2;
        else
            maxDivisor = num1;

        for (int i = 1; i <= maxDivisor; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                greatestDivisor = i;
        }
        return greatestDivisor;
    }

}
