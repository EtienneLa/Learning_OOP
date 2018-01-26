public class Account {

    private double balance;
    private String accountNumber;
    private boolean firstTime = true;

    public Account(double bal, String acc) {

        if (bal >= 100) {
            balance = bal;
            System.out.println("Account has been created successfully.");
        }
        else
            System.err.println("Initial balance has to be at least 100.");

        accountNumber = acc;
    }

    public void deposit(double depo) {

        if (depo > 0) {
            balance += depo;
            System.out.println(depo + " has been added to balance." +
            "\nNew balance: " + balance);
        }
        else
            System.err.println("Please ensure the amount to be deposited is not negative.");
    }

    public void withdraw(double withdr) {

        if (withdr > 0 && withdr < balance) {
            if (firstTime) {
                double tempBalance = balance - withdr;
                if ( tempBalance >= 100) {
                    balance -= withdr;
                    System.out.println(withdr + " has been successfully withdrawn." +
                            "\nNew balance: " + balance);
                    firstTime = false;
                }
                else
                    System.err.println("The minimum balance on your account must be at least 100.");
            }
            else {
                Bank bank = new Bank();
                double tempBalance = balance;
                tempBalance = tempBalance - withdr - bank.getTransactionFees();
                if ( tempBalance >= 100) {
                    balance = tempBalance;
                    System.out.println(withdr + " has been successfully withdrawn." +
                            "\nNew balance: " + balance);
                }
                else
                    System.err.println("The minimum balance on your account must be at least 100.");
            }

        }
        else if (withdr < 0)
            System.err.println("Please ensure the amount to be withdrawn is not negative.");
        else if (withdr > balance)
            System.err.println("Amount to be withdrawn is higher than your balance.");
    }

    public double getBalance() {

        return balance;
    }

    public String getAccountNumber() {

        return accountNumber;
    }
}
