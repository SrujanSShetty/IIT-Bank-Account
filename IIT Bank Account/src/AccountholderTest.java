import java.util.Scanner;

public class AccountholderTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Step 1: Create AccountHolder object with initial balance
		System.out.print("Enter initial account balance: ");
		// Prompt the user to enter the initial balance and store it as a double value
		double initialBalance = scanner.nextDouble(); 
		// Handling invalid initial balance input with exception handling
		try {
			Accountholder account = new Accountholder(initialBalance);
			// Step 2: Deposit Method
			System.out.print("Enter deposit amount: "); // Print a request to enter deposit amount
			double depositAmount = scanner.nextDouble();
			account.deposit(depositAmount);

			// Step 3: withdrawal Method
			System.out.print("Enter withdrawal amount: ");
			double withdrawalAmount = scanner.nextDouble();
			account.withdrawal(withdrawalAmount);

			// Step 4: Add monthly interest and display the balance
			account.monthlyInterest();
			System.out.println("Ending balance after interest: $" + account.getBalance());

			account.displayTransactionHistory();
			account.displayInterestReport();			
			scanner.close();
		
		} catch (IllegalArgumentException e) {
			System.out.println("Initial balance cannot be negative.");

		}
	}
}
