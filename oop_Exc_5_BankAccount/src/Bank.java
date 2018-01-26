public class Bank {

    private static double interestRate = 6;
    private static double transactionFees = 4.5;
    private Customer[] customers = new Customer[100];

    public void calculateInterest(Customer customer) {

        Account a = customer.getAccount();
        double bal = a.getBalance();
        double interestAmount = bal*interestRate/100;
        double totalBalance = bal + interestAmount;
        System.out.println("Interest amount: " + interestAmount + "\nTotal balance after adding interest: " + totalBalance);
    }

    public double getInterestRate() {

        return interestRate;
    }

    static double transactionFees() {

        return transactionFees;
    }

    public Customer[] getCustomer() {

        return customers;
    }
}
