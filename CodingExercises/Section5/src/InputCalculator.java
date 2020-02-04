import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        long avg = 0;
        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int nextInt = scanner.nextInt();
                sum += nextInt;
                counter ++;
                avg = Math.round((double)sum /counter);
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }

}
