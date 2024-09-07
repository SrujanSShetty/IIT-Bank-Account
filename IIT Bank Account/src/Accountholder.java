import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Accountholder {
	static double annualInterestRate = 0.04; // Allowing the interest for the bank to be initially set at 4%.
	public double balance;
	public ArrayList<String> transactionHistory = new ArrayList<>(); // Creating a list to track transactions #BONUSFEATURE 

	// Constructor
	public Accountholder(double initialBalance) {
		if (initialBalance < 0) {
			throw new IllegalArgumentException("balance must be non-negative");// Throws an exception if entered initial
																				// balance is negative(Error Trappings)
		} else {
			this.balance = initialBalance;// Avoiding self-referential assigning using this.balance
			transactionHistory.add("Account created with initial balance: $" + this.balance);
		}
	}

	// Deposit method
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			transactionHistory.add("Deposited: $" + amount);
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}

	// Withdrawal method
	public void withdrawal(double amount) {
		if (this.balance - amount >= 50) {
			this.balance -= amount;
			transactionHistory.add("Withdrew: $" + amount);
		} else {
			// Disallowing a withdrawal attempts to drive account balance to drop below $50.
			System.out.println("Withdrawal denied. Balance must stay above $50.");
		}
	}

	// Monthly interest calculation
	public void monthlyInterest() {
		double interest = this.balance * (annualInterestRate / 12.0);
		this.balance += interest;
		// Interest amount formatted to two decimal places.
		transactionHistory.add("Interest added: $" + String.format("%.2f", interest));
	}

	// Getter for balance
	public double getBalance() {
		return this.balance;
	}

	// Method to display transaction history
	public void displayTransactionHistory() {
		System.out.println("Transaction History:");
		for (String transaction : transactionHistory) {
			System.out.println(transaction);
		}
	}

	// Method to display 12-month interest report
	public void displayInterestReport() {
		// Display the initial balance as 'initial base balance'
		System.out.printf("%-10s %-25s\n", "initialbasebalance", String.format("$%.2f", this.balance));
		System.out.println("Monthly Interest Report");
		System.out.printf("%-10s %-25s\n", "Month", "New Balance");//Format specifiers used to align the output

		

		// Loop through 12 months, calculate and display the new balance each month
		for (int month = 1; month <= 12; month++) {
			double interest = this.balance * (annualInterestRate / 12.0);
			this.balance += interest;
			System.out.printf("%-10d %-25s\n", month, String.format("$%.2f", this.balance));
		}

		// To display time and date with name at the end of output.
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println("Cur dt=" + timeStamp + "\nProgrammed by Srujan Shekar Shetty");
	}
}
