public class Customer {

    private String name;
    private Account account;

    Customer(String n, Account a) {

        name = n;
        account = a;
    }

    public String display() {

        return "Name: " + name + "\nAccount: " + account.getAccountNumber() + "\nBalance: " + account.getBalance();
    }

    public String getName() {

        return name;
    }

    public Account getAccount() {

        return account;
    }
}
