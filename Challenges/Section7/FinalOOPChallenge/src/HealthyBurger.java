import java.util.Scanner;

public class HealthyBurger extends Burger {

    private boolean hasMushrooms = false;
    private boolean hasPickles = false;

    public HealthyBurger( String meatType) {
        super("brown rye", meatType);
    }

    @Override
    public String getToppings() {
        String toppings = "with";
        if (!hasLettuce && !hasCheese && !hasOnion && !hasTomato)
            toppings += " nothing on it.";
        if (hasLettuce)
            toppings += " lettuce,";
        if (hasTomato)
            toppings += " tomato,";
        if (hasOnion)
            toppings += " onions,";
        if (hasMushrooms)
            toppings += " mushrooms,";
        if (hasPickles)
            toppings += " pickles,";
        if (hasCheese)
            toppings += " and cheese";
        toppings += ".";
        return toppings;
    }

    @Override
    public void addToppings(Scanner scanner) {
        addLettuce(scanner);
        addTomato(scanner);
        addOnion(scanner);
        addCheese(scanner);
        addMushrooms(scanner);
        addPickles(scanner);
    }

    private void addMushrooms(Scanner scanner) {
        String answer;
        System.out.println("Would you like to add lettuce to your burger? (y/n)");
        while (true) {
            answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("y")) {
                this.hasMushrooms = true;
                recalculatePrice(.75);
                System.out.println("Mushrooms have been added to your burger.");
                break;
            } else if (answer.equals("n")) {
                break;
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer y/n");
            }
        }
    }

    private void addPickles(Scanner scanner) {
        String answer;
        System.out.println("Would you like to add tomatoes to your burger? (y/n)");
        while (true) {
            answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("y")) {
                this.hasPickles = true;
                recalculatePrice(.75);
                System.out.println("Pickles have been added to your burger.");
                break;
            } else if (answer.equals("n")) {
                break;
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer y/n");
            }
        }
    }
}
