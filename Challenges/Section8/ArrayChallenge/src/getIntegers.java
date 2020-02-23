import java.util.Scanner;

public class getIntegers {

    public static int[] getIntegers(Scanner scanner, int number) {
        System.out.println("Enter " + number + " integers.\r" );
        int[] intArray = new int[number];
        for (int i = 0; i < number; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

}
