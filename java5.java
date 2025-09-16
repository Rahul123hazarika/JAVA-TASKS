//5.	Classes and Objects : Create a simple banking system with features like deposit, withdraw, and check balance using method overriding and overloading concept  in  Java. Provide proper validations, comments


// Base class for Bank Account
class BankAccount {
    protected String accountHolder;
    protected double balance;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0; // Negative initial balance not allowed
        }
    }

    // Method to deposit money (Overloading Example)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount. Must be positive.");
        }
    }

    // Overloaded deposit method (with reference/description)
    public void deposit(double amount, String reference) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | Reference: " + reference);
        } else {
            System.out.println("Invalid deposit amount. Must be positive.");
        }
    }

    // Withdraw money (can be overridden by subclasses)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}

// Derived class for Savings Account (Overriding withdraw with minimum balance rule)
class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 500; // Savings account must keep 500 balance

    public SavingsAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    // Overriding withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " from Savings Account");
        } else {
            System.out.println("Withdrawal denied! Must maintain minimum balance of " + MIN_BALANCE);
        }
    }
}

// Main class to test the system
class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a savings account with initial balance
        SavingsAccount acc = new SavingsAccount("Rahul", 2000);

        int choice;
        do {
            System.out.println("\n=== Banking System Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Deposit with Reference");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depAmount = sc.nextDouble();
                    acc.deposit(depAmount); // Method Overloading Example (deposit(double))
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depAmt = sc.nextDouble();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter reference: ");
                    String ref = sc.nextLine();
                    acc.deposit(depAmt, ref); // Method Overloading Example (deposit(double, String))
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withAmount = sc.nextDouble();
                    acc.withdraw(withAmount); // Method Overriding Example
                    break;
                case 4:
                    acc.checkBalance();
                    break;
                case 5:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
