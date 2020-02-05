public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        //calls the Constructor method for new BankAccount class that is not initialized with any data, so this is the default Constructor call
        this("Default accountNumber", 00.00, "Default customerName", "Default email", "Default phone number");
        System.out.println("Empty constructor called");
    }

    // creates Constructor method for the BankAccount Class
    public BankAccount (String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with values called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber (String accountNumber) {
            this.accountNumber = accountNumber;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber () {
        return this.accountNumber;
    }

    public double getBalance () {
        return this.balance;
    }

    public String getCustomerName () {
        return this.customerName;
    }

    public String getEmail () {
        return this.email;
    }

    public String getPhoneNumber () {
        return this.phoneNumber;
    }

    public void withdrawFunds (double withdrawAmount) {
        if (this.balance > withdrawAmount) {
            this.balance = this.balance - withdrawAmount;
            System.out.println("Successful transaction! You have withdrawn $" + withdrawAmount + ". You have $" + balance + " left in your account.");
        }
        else
            System.out.println("You do not have enough money in your account to withdraw that amount of money!");
    }

    public void depositFunds (double depositAmount) {
        this.balance = this.balance + depositAmount;
        System.out.println("Successful transaction! You have deposited $" + depositAmount + ". You now have $" + balance + " in your account.");
    }
}
