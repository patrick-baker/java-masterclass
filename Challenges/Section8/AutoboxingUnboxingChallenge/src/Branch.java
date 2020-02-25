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

    public boolean addCustomer (Customer customer, double initialTransaction) {
        if (findCustomer(customer.getName()) >= 0) {
            System.out.println("That customer already exists at " + this.branchName);
            return false;
        }
        customerList.add(customer);
        System.out.println(customer.getName() + " was added to " + this.branchName);
        customer.newTransaction(initialTransaction);
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

    private int findCustomer (Customer customer) {
        return this.customerList.indexOf(customer);
    }

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

    public Branch createBranch (String name) {
        return new Branch (name);
    }

    public void printCustomers (boolean showTransactions) {
        System.out.println(this.branchName + "'s list of customers:");
        for (int i = 0; i < this.customerList.size(); i++) {
            Customer customer = customerList.get(i);
            System.out.println(i + "). " + customer.getName());
            if (showTransactions) {
                customer.printTransactions();
            }
        }
    }
}
