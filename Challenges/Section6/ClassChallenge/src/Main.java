public class Main {

    public static void main(String[] args) {
        // creates constructor with default values
        BankAccount bankAccount = new BankAccount();
        // sets values using Constructor
        BankAccount bankAccount1 = new BankAccount("123456", 5000.00, "Patrick", "example@gmail.com", "(123) 456-7890");
        // sets values using setters
//        bankAccount.setCustomerName("Patrick");
//        bankAccount.setAccountNumber("20010030");
//        bankAccount.setBalance(50000);
//        bankAccount.setEmail("example@gmail.com");
//        bankAccount.setPhoneNumber("123-456-7890");
        System.out.println("Account holder's name is" + bankAccount.getCustomerName());
        System.out.println("Account number is: " + bankAccount.getAccountNumber());
        System.out.println("Customer's email is:" + bankAccount.getEmail());
        System.out.println("Customer's phone number is: " + bankAccount.getPhoneNumber());
        System.out.println("Account balance = " + bankAccount.getBalance());
        bankAccount.depositFunds(20000.34);
        System.out.println("Account balance = " + bankAccount.getBalance());
        bankAccount.withdrawFunds(50000);
        System.out.println("Account balance = " + bankAccount.getBalance());

        System.out.println("Account holder's name is" + bankAccount1.getCustomerName());
        System.out.println("Account number is: " + bankAccount1.getAccountNumber());
        System.out.println("Customer's email is:" + bankAccount1.getEmail());
        System.out.println("Customer's phone number is: " + bankAccount1.getPhoneNumber());
        System.out.println("Account balance = " + bankAccount1.getBalance());
        bankAccount1.depositFunds(20000.34);
        System.out.println("Account balance = " + bankAccount1.getBalance());
        bankAccount1.withdrawFunds(50000);
        System.out.println("Account balance = " + bankAccount1.getBalance());


        System.out.println("To VIP account");
        VipCustomer VipCustomer1 = new VipCustomer();
        VipCustomer VipCustomer2 = new VipCustomer("Patrick", "patrick@gmail.com");
        VipCustomer VipCustomer3 = new VipCustomer("Julian", 10000000, "julian@email.com");
        System.out.println(VipCustomer1.getName());
        System.out.println(VipCustomer1.getEmailAddress());
        System.out.println(VipCustomer1.getCreditLimit());
        System.out.println(VipCustomer2.getName());
        System.out.println(VipCustomer2.getEmailAddress());
        System.out.println(VipCustomer2.getCreditLimit());
        System.out.println(VipCustomer3.getName());
        System.out.println(VipCustomer3.getEmailAddress());
        System.out.println(VipCustomer3.getCreditLimit());
    }

}
