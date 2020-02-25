import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branchList;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchList = new ArrayList <Branch>();
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }

    public boolean addBranch (Branch branch) {
        if (findBranch(branch.getBranchName()) >= 0) {
            System.out.println("That branch already exists at " + this.bankName);
            return false;
        }
        branchList.add(branch);
        System.out.println(branch.getBranchName() + " was added to " + this.bankName);
        return true;
    }

    public boolean addCustomer (Branch branch, Customer customer, double initialTransaction) {
        if (findBranch(branch.getBranchName()) >= 0) {
            branch.addCustomer(customer, initialTransaction);
            return true;
        }
        System.out.println("That branch does not exist at " + this.bankName);
        return false;
    }

    public boolean newTransaction (Branch branch, Customer customer, double transactionAmount) {
        if (findBranch(branch.getBranchName()) >= 0) {
            branch.newTransaction(customer, transactionAmount);
            return true;
        }
        System.out.println("That branch does not exist at " + this.bankName);
        return false;
    }

    private int findBranch (String branchName) {
        for (int i = 0; i<this.branchList.size(); i++) {
            Branch branch = this.branchList.get(i);
            if (branch.getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean printCustomers (Branch branch, boolean showTransactions) {
        if (findBranch(branch.getBranchName()) >= 0) {
            branch.printCustomers(showTransactions);
            return true;
        }
        System.out.println("That branch does not exist at " + this.bankName);
        return false;
    }
}
