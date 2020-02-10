import java.util.Scanner;

public class Burger {

    private String bunType;
    private String meatType;
    private boolean toppingsAvailable;
    private double price;
    public boolean hasLettuce = false;
    public boolean hasTomato = false;
    public boolean hasOnion = false;
    public boolean hasCheese = false;

    public Burger(String bunType, String meatType) {
        this.bunType = bunType;
        this.meatType = meatType;
        this.price = 5.99;
    }

    public String getBunType() {
        return bunType;
    }

    public String getMeatType() {
        return meatType;
    }

    public double getPrice() {
        return price;
    }

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
        if (hasCheese)
            toppings += " and cheese";
        toppings += ".";
        return toppings;
    }

    public void clarifyOrder() {
        System.out.println( "You have ordered a " + getMeatType() + " burger on a " + getBunType() + " bun " + getToppings()
    + " It costs $" + getPrice() + ".");}

    public void recalculatePrice(double toppingPrice) {
        this.price += toppingPrice;
    }

    public void addToppings(Scanner scanner) {
        addLettuce(scanner);
        addTomato(scanner);
        addOnion(scanner);
        addCheese(scanner);
    }

    public void addLettuce(Scanner scanner) {
        String answer;
        System.out.println("Would you like to add lettuce to your burger? (y/n)");
        while (true) {
            answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("y")) {
                this.hasLettuce = true;
                recalculatePrice(.75);
                System.out.println("Lettuce has been added to your burger.");
                break;
            } else if (answer.equals("n")) {
                break;
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer y/n");
            }
        }
    }

    public void addTomato(Scanner scanner) {
        String answer;
        System.out.println("Would you like to add tomatoes to your burger? (y/n)");
        while (true) {
            answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("y")) {
                this.hasTomato = true;
                recalculatePrice(.75);
                System.out.println("Tomato has been added to your burger.");
                break;
            } else if (answer.equals("n")) {
                break;
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer y/n");
            }
        }
    }

    public void addOnion(Scanner scanner) {
        String answer;
        System.out.println("Would you like to add onion to your burger? (y/n)");
        while (true) {
            answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("y")) {
                this.hasOnion = true;
                recalculatePrice(.75);
                System.out.println("Onion has been added to your burger.");
                break;
            } else if (answer.equals("n")) {
                break;
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer y/n");
            }
        }
    }

    public void addCheese(Scanner scanner) {
        String answer;
        System.out.println("Would you like to add cheese to your burger? (y/n)");
        while (true) {
            answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("y")) {
                this.hasCheese = true;
                recalculatePrice(.75);
                System.out.println("Cheese has been added to your burger.");
                break;
            } else if (answer.equals("n")) {
                break;
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer y/n");
            }
        }
    }
}
