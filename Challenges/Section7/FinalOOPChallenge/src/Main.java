import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Burger burger = new Burger("wheat", "beef");
        HealthyBurger healthyBurger = new HealthyBurger("chicken");
        DeluxeBurger deluxeBurger = new DeluxeBurger("wheat", "beef");


        burger.addToppings(scanner);
        burger.clarifyOrder();

        healthyBurger.addToppings(scanner);
        healthyBurger.clarifyOrder();

        deluxeBurger.clarifyOrder();
        scanner.close();
    }
}
