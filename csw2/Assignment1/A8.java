package Assignment1;

abstract class Account {
    private String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /*
     * public String getAccountNumber() {
     * return accountNumber;
     * }
     * public double getBalance() {
     * return balance;
     * }
     */
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("--------------------------------");
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount + (amount * interestRate / 100);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    /*
     * public void displayAccountDetails() {
     * super.displayAccountDetails();
     * System.out.println("Interest Rate: " + interestRate + "%");
     * System.out.println("--------------------------------");
     * }
     * }
     */
    class CurrentAccount extends Account {
        private double overdraftLimit;

        public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
            super(accountNumber, balance);
            this.overdraftLimit = overdraftLimit;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (balance - amount >= -overdraftLimit) {
                balance -= amount;
            } else {
                System.out.println("Withdrawal exceeds overdraft limit.");
            }
        }

        public void displayAccountDetails() {
            super.displayAccountDetails();
            System.out.println("Overdraft Limit: " + overdraftLimit);
            System.out.println("--------------------------------");
        }
    }

public class A8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SavingsAccount savings = new SavingsAccount("PNB12634326", 1000.0, 5.0);
	        CurrentAccount current = new CurrentAccount("HDFC765432980", 2000.0, 500.0);

	        savings.deposit(500);
	        savings.withdraw(200);
	        current.deposit(1000);
	        current.withdraw(2800);

	        savings.displayAccountDetails();
	        current.displayAccountDetails();
	}
}
