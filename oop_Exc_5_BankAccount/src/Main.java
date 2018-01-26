import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfCustomers = 0;
        Bank bank = new Bank();
        Customer[] c = bank.getCustomer();

        while (true) {
            System.out.println("\nPlease enter your number of choice.");
            System.out.println("1) Add Customer");
            System.out.println("2) Deposit Money");
            System.out.println("3) Withdraw Money");
            System.out.println("4) Check Account Details");
            System.out.println("5) Calculate Interest");
            System.out.println("6) Exit");
            System.out.print("> ");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {

                case 1:
                    System.out.println("Creating an account for a new customer.");
                    Random rng = new Random();
                    char cacc = (char)(1 + rng.nextInt(26) + 'a');
                    int accountnum = rng.nextInt(5000);
                    String acc = "" + cacc + accountnum;
                    System.out.print("Please enter your name: ");
                    String name = br.readLine();
                    System.out.println("This is your Account Number, " + name + ": " + acc);
                    System.out.print("Please enter the initial amount in your account: ");
                    double bal = Double.parseDouble(br.readLine());
                    Account account = new Account(bal, acc);
                    Customer customer = new Customer(name, account);
                    c[numOfCustomers] = customer;
                    numOfCustomers++;
                    break;

                case 2:
                    System.out.print("Please enter your Account Number: ");
                    acc = br.readLine();
                    if (numOfCustomers == 0)
                        System.err.println("Account Number not found.");
                    else {
                        boolean found = false;
                        for (int i = 0; i < numOfCustomers; i++) {
                            Account temp = c[i].getAccount();
                            String accTemp = temp.getAccountNumber();
                            if (accTemp.equals(acc)) {
                                System.out.print("Please enter the amount to deposit: ");
                                double depo = Double.parseDouble(br.readLine());
                                temp.deposit(depo);
                                found = true;
                            }
                        }
                        if (!found)
                            System.err.println("Account Number not found.");
                    }
                    break;

                case 3:
                    System.out.print("Please enter your Account Number: ");
                    acc = br.readLine();
                    if (numOfCustomers == 0)
                        System.err.println("Account Number not found.");
                    else {
                        boolean found = false;
                        for (int i = 0; i < numOfCustomers; i++) {
                            Account temp = c[i].getAccount();
                            String accTemp = temp.getAccountNumber();
                            if (accTemp.equals(acc)) {
                                System.out.print("Please enter the amount to withdraw: ");
                                double withdr = Double.parseDouble(br.readLine());
                                temp.withdraw(withdr);
                                found = true;
                            }
                        }
                        if (!found)
                            System.err.println("Account Number not found.");
                    }
                    break;

                case 4:
                    System.out.print("Please enter your Account Number: ");
                    acc = br.readLine();
                    if (numOfCustomers == 0)
                        System.err.println("Account Number not found.");
                    else {
                        boolean found = false;
                        for (int i = 0; i < numOfCustomers; i++) {
                            Customer cTemp = c[i];
                            Account aTemp = c[i].getAccount();
                            String accTemp = aTemp.getAccountNumber();
                            if (accTemp.equals(acc)) {
                                cTemp.display();
                                found = true;
                            }
                        }
                        if (!found)
                            System.err.println("Account Number not found.");
                    }
                    break;

                case 5:
                    System.out.print("Please enter your Account Number: ");
                    acc = br.readLine();
                    if (numOfCustomers == 0)
                        System.out.print("Account Number not found.");
                    else {
                        boolean found = false;
                        for (int i = 0; i < numOfCustomers; i++) {
                            Account aTemp = c[i].getAccount();
                            String accTemp = aTemp.getAccountNumber();
                            if (accTemp.equals(acc)) {
                                bank.calculateInterest(c[i]);
                                found = true;
                            }
                        }
                        if (!found)
                            System.err.println("Account Number not found.");
                    }
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}
