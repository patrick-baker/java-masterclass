import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList <Customer> customerList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerList = new ArrayList <Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public String getBranchName() {
        return branchName;
    }

    // could cut out a line by simply creating a newInstance of Customer when adding to customerList
    public boolean addCustomer (String customerName, double initialTransaction) {
        if (findCustomer(customerName) >= 0) {
            System.out.println("That customer already exists at " + this.branchName);
            return false;
        }
        Customer newCustomer = Customer.createCustomer(customerName);
        customerList.add(newCustomer);
        System.out.println(customerName + " was added to " + this.branchName);
        newCustomer.newTransaction(initialTransaction);
        return true;
    }


    public boolean newTransaction (Customer customer, double transactionAmount) {
        if (queryCustomer(customer.getName()) != null) {
            customer.newTransaction(transactionAmount);
            System.out.println("A transaction of " + transactionAmount + " was executed for " + customer.getName() + " at " + this.branchName);
            return true;
        }
        System.out.println("That customer does not exist at " + this.branchName);
        return false;
    }

    // no reasons to have both findCustomer and queryCustomer, can have simply queryCustomer and return Customer
    private int findCustomer (String customerName) {
        for (int i = 0; i<this.customerList.size(); i++) {
            Customer customer = this.customerList.get(i);
            if (customer.getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }

    public Customer queryCustomer (String name) {
        int position = findCustomer(name);
        if (position >= 0) {
            return this.customerList.get(position);
        }
        return null;
    }

    public static Branch createBranch (String name) {
        return new Branch (name);
    }

    public void printCustomers (boolean showTransactions) {
        System.out.println(this.branchName + "'s list of customers:");
        for (int i = 0; i < this.customerList.size(); i++) {
            Customer customer = customerList.get(i);
            System.out.println((i + 1) + "). " + customer.getName());
            if (showTransactions) {
                customer.printTransactions();
            }
        }
    }
}
