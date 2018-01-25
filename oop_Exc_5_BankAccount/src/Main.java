import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int numOfCustomers = 0;
        Bank bank = new Bank();
        Customer[] c = bank.getCustomer();

        while (true) {
            System.out.println("Please enter your number of choice.");
            System.out.println("1) Add Customer");
            System.out.println("2) Deposit Money");
            System.out.println("3) Withdraw Money");
            System.out.println("4) Check Balance");
            System.out.println("5) Calculate Interest");
            System.out.println("6) Exit");
            System.out.print("> ");
            int choice = Integer.parseInt(kb.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Creating an account for a new customer.");
                    Random rng = new Random();
                    char cacc = (char)(1 + rng.nextInt(26) + 'a');
                    int accountnum = rng.nextInt(5000);
                    String acc = "" + cacc + accountnum;
                    System.out.print("Please enter your name: ");
                    String name = kb.nextLine();
                    System.out.println("This is your Account Number, " + name + ": " + acc);
                    System.out.print("Please enter the initial amount in your account: ");
                    double bal = kb.nextDouble();
                    Account account = new Account(bal, acc);
                    Customer customer = new Customer(name, account);
                    c[numOfCustomers] = customer;
                    numOfCustomers++;


                    break;
               /* case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;*/
                case 6:
                    System.exit(0);
            }
        }
    }
}
