public class TeenNumberChecker {

    public static boolean hasTeen (int num1, int num2, int num3) {
        if (num1 >= 13 & num1 < 20)
            return true;
        if (num2 >= 13 & num2 < 20)
            return true;
        if (num3 >= 13 & num3 < 20)
            return true;
        return false;
    }

    public static boolean isTeen (int num1) {
        if (num1 >= 13 & num1 < 20)
            return true;
        return false;
    }
}
