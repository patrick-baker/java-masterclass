public class barkingDog {

    public static boolean shouldWakeUp  (boolean barking, int hourOfDay) {
        if (hourOfDay >= 0 & hourOfDay < 8 & barking == true) {
            System.out.println("true");
            return true;
        }
        else if (hourOfDay > 22 & hourOfDay <= 24 & barking == true) {
            System.out.println("true");
            return true;
        }
        else
            return false;
    }
}
