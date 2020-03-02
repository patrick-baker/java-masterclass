import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList <Double> transactions;

    // makes more sense to put initialAmount as a constructor argument,
    // and run newTransaction when a new instance of Customer is created
    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }


    public static Customer createCustomer (String name) {
        return new Customer (name);
    }

    public boolean newTransaction (double amount) {
        this.transactions.add(amount);
        System.out.println("A transaction amount of " + amount + "was made for the account of " + this.name);
        return true;
    }

    public void printTransactions () {
        System.out.println(this.name + "'s transaction history:");
        for (int i = 0; i < this.transactions.size(); i++) {
            double transaction = transactions.get(i);
            System.out.println(i + "). " + transaction);
        }
    }
}
