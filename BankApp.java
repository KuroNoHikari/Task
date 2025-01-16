import java.util.Scanner;

class AccountCredentials {
    private int accountId;
    private int accountPin;
    private String accountName;
    private double accountBalance;

    public AccountCredentials(int accountId, int accountPin, String accountName, double accountBalance) {
        this.accountId = accountId;
        this.accountPin = accountPin;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getAccountPin() {
        return accountPin;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void cashIn(double cashInAmount) {
        accountBalance += cashInAmount;
        System.out.println("You have successfully added " + cashInAmount + " to your account.");
    }

    public boolean moneyTransfer(AccountCredentials recipient, double amount) {
        if (this.accountBalance >= amount) {
            this.accountBalance -= amount;
            //recipient.cashIn(amount);
            System.out.println("Successfully transferred " + amount + " to " + recipient.accountName);
            return true;
        } else {
            System.out.println("Insufficient funds for transfer.");
            return false;
        }

    }
}


public class BankApp {

    private static boolean isLoggedIn;

    public static AccountCredentials logIn(AccountCredentials[] accountCredentials) {

        Scanner scan = new Scanner(System.in);
        int maxAttempt = 3;

        for (int attempts = 1; attempts <= maxAttempt; attempts++) {
            System.out.println("Attempt " + attempts + " out of " + maxAttempt);

            System.out.println("Please Log-In");
            System.out.print("Enter Account ID: ");
            int id = scan.nextInt();
            System.out.print("Enter Pin: ");
            int pin = scan.nextInt();
            System.out.println();

            for (AccountCredentials account : accountCredentials) {
                if (id == account.getAccountId() && pin == account.getAccountPin()) {
                    isLoggedIn = true;
                    return account;
                } else if (attempts == maxAttempt && !isLoggedIn) {
                    System.out.println("Maxed attempt reached.");
                    break;
                } else {
                    System.out.println();
                    System.out.println("Warning: Account Not Found!!!");
                    break;
                }
            }
        }
        return null;
    }
    private static AccountCredentials[] accountCredentials = new AccountCredentials[2];
    public static void main(String[] args) {
        accountCredentials[0] = new AccountCredentials(412435, 7452, "Chris Sandoval", 32000);
        accountCredentials[1] = new AccountCredentials(264863, 1349, "Marc Yim", 1000);
        //Login
        AccountCredentials currentUser = logIn(accountCredentials);

        boolean check = true;
        int operation;
        if (check == isLoggedIn) {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Account Logged-in: " + currentUser.getAccountName());
                System.out.println();
                System.out.println("Main Menu:");
                System.out.print("1. Check Balance" + "\n2. Cash-In" + "\n3: Money Transfer" + "\n4. Close Program" + "\nEnter Operation: ");
                operation = scanner.nextInt();
                System.out.println();
                switch (operation) {
                    case 1:
                        System.out.print("Current Balance: " + currentUser.getAccountBalance());
                        System.out.println();
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Enter amount to Cash-In: ");
                        double amount = scanner.nextInt();
                        currentUser.cashIn(amount);
                        System.out.println();
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("Enter account Id: ");
                        int recipientId = scanner.nextInt();
                        AccountCredentials recipient = findUserById(recipientId);
                        if (recipient != null) {
                            System.out.print("Enter amount to transfer: ");
                            double transferAmount = scanner.nextDouble();
                            currentUser.moneyTransfer(recipient, transferAmount);
                            System.out.println();
                            System.out.println();
                        } else {
                            System.out.println("Recipient not found.");
                        }
                        break;
                    case 4:
                        System.out.println("Closing Program");
                        break;
                    default:
                        System.out.print("Invalid Operation" + "\n" + "Try Again");

                }

            } while (operation != 4);
            scanner.close();
        }
    }
    public static AccountCredentials findUserById(int accountId) {
        for (AccountCredentials user : accountCredentials) {
            if (user != null && user.getAccountId() == accountId) {
                return user;
            }
        }
        return null;
    }
}
