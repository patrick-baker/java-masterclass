public class SpeedConverter {

    public static long toMilesPerHour (double kilometersPerHour) {
        long result = 0;
        if (kilometersPerHour < 0)
            result = -1;
        else if (kilometersPerHour >= 0)
            result =  Math.round(kilometersPerHour / 1.609);
        return result;
    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

}
