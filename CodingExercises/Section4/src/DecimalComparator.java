public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
        if ((int)(num1 * 1000) == (int)(num2 * 1000))
            return true;
        else {
            System.out.println("Num1" + Math.round(num1 * 1000) + "Num2" + Math.round(num2 * 1000));
            return false;
        }
    }
}
