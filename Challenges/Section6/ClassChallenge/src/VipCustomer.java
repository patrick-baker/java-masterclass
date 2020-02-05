public class VipCustomer {

    private String name;
    private long creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this ("Default Name", 10000, "1234@email.com");
        System.out.println("Empty contructor called;");
    }

    public VipCustomer(String name, String emailAddress) {
        this (name, 100000, emailAddress);
    }

    public VipCustomer(String name, long creditLimit, String emailAddress) {
        System.out.println("Constructor with all valid fields");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
