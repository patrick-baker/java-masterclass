public class DiagonalStar {
    // use a nested loop system to print out stars in a symmetrical pattern
    public static void printSquareStar (int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        // sets the number of rows to number argument
        for (int i = 1; i <= number; i++) {
            // sets the number of columns to number
            for (int j = 1; j <= number; j++) {
                // starts a new row at the end of the j loop
//                if (j == number + 1)
//                    System.out.println();
                // creates a star along the border
                if (i == 1 || i == number || j == 1 || j == number)
                    System.out.print("*");
                // creates a star from top left to bottom right corners
                else if (i == j)
                    System.out.print("*");
                // creates a star from top right to bottom left corners
                else if (j == (number - i + 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            // after the row is filled out, a new row is started for the next i iteration
            System.out.println();
        }
    }

}
