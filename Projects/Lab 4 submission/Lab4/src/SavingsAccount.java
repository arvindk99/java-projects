
public class SavingsAccount {
	private static double annualInterestRate = 0;
	private double savingsBalance = 0;

	public SavingsAccount() {
	}

	public SavingsAccount(double newBalance) {
		this.savingsBalance = newBalance;
	}

	protected void calculateMonthlyInterest() {
		System.out.printf("Initial Savings Balance: " + savingsBalance);
		double monthlyInterest;
		monthlyInterest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance += monthlyInterest;

	}

	public double getBalance() {
		return savingsBalance;
	}

	protected static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}

	public void deposit(double money) {
		savingsBalance += money;
		System.out.printf("Your total bank statement after adding $%.2f is now $%.2f", money, savingsBalance);

	}

	public void withdraw(double money) {
		savingsBalance -= money;
		System.out.printf("Your total bank statement after deducting $%.2f is now $%.2f", money, savingsBalance);
	}

}