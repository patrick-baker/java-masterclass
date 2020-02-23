import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] firstIntArray = getIntegers.getIntegers(scanner, 5);
        System.out.println("The integers in firstIntArray: ");
        printArray(firstIntArray);

        int[] sortedFirstIntArray = SortArray.SortArray(firstIntArray);
        System.out.println("The integers in sortedFirstIntArray: ");
        printArray(sortedFirstIntArray);

    }

    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("The array at location " + i + " = " + array[i]);
        }
    }
}
