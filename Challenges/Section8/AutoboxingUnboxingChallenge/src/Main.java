import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank westconsin = new Bank ("Westconsin");

    public static void main(String[] args) {

        boolean quit = false;
        startApplication();
        printActions();
        // want to instill a way for the user to choose which bank they want to work with, just one for now
        Bank bank = westconsin;
        while (!quit) {
            System.out.println("\n Enter action: (6 to show available actions.");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Shutting down the application.");
                    quit = true;
                    break;
                case 1:
                    bank.printBranches();
                    break;
                case 2:
                    printCustomers(bank);
                    break;
                case 3:
                    addNewBranch(bank);
                    break;
                case 4:
                    addNewCustomer(bank);
                    break;
                case 5:
                    newTransaction(bank);
                    break;
                case 6:
                    printActions();
                    break;
            }
        }


    }

    private static void addNewBranch(Bank bank) {
        System.out.println("Please enter the location of the branch.");
        String branchName = scanner.nextLine();
        Branch branch = Branch.createBranch(branchName);
        bank.addBranch(branch);
    }

    private static void addNewCustomer (Bank bank) {
        System.out.println("Which branch location would you like to add a new customer to?");
        String branchName = scanner.nextLine();
        System.out.println("What is the name of the Customer you would like to add?");
        String customerName = scanner.nextLine();
        System.out.println("What is the initial transaction amount for " + customerName + "?");
        double initialTransaction = scanner.nextInt();
        scanner.nextLine();
        bank.addCustomer(bank.queryBranch(branchName), customerName, initialTransaction);
    }

    private static void newTransaction (Bank bank) {
        System.out.println("What branch location does the customer belong to?");
        String branchName = scanner.nextLine();
        Branch branch = bank.queryBranch(branchName);
        if (branch == null) {
            System.out.println("That branch does not exist at this bank.");
            return;
        }
        System.out.println("What is the name of the customer that you would like to make a transaction for?");
        String customerName = scanner.nextLine();
        Customer customer = bank.queryCustomer(customerName, branch);
        if (customer == null) {
            System.out.println("That customer does not exist at the specified branch.");
            return;
        }
        System.out.println("What amount is the transaction for?");
        double transactionAmount = scanner.nextInt();
        scanner.nextLine();
        bank.newTransaction(branch, customer, transactionAmount);
    }

    private static void printCustomers (Bank bank) {
        System.out.println("Please enter the location of the branch for which you want the customer list.");
        String branchName = scanner.nextLine();
        boolean showTransactions;
        while (true) {
            System.out.println("Would you also like to see their transactions? (y/n)");
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("y")) {
                showTransactions = true;
                break;
            } else if (response.equals("n")){
                showTransactions = false;
                break;
            } else {
                System.out.println("Sorry, that response is not valid. Please answer (y/n).");
            }
        }
        bank.printCustomers(bank.queryBranch(branchName), showTransactions);
    }

    private static void startApplication() {
        System.out.println("Starting up banking application.");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print branches\n" +
                "2 - to print customers for a specific branch\n" +
                "3 - to add a new branch\n" +
                "4 - to add a new customer for a specific branch\n" +
                "5 - to make a new bank transaction\n" +
                "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }

}
