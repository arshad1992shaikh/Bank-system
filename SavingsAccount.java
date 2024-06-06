package bankingSystem;
/*This code defines a SavingsAccount class that extends the Account class in the bankingSystem package. 
 * The SavingsAccount class represents a savings account and has the following properties and methods:*/

public class SavingsAccount extends Account {
	
	private double interestRate;//interestRate: a double representing the interest rate of the savings account
	
	//The SavingsAccount constructor takes four parameters: accountNumber, holderName, balance, and interestRate.
	//It calls the Account constructor with the first three parameters and sets the accountType to "Savings".
	//It also sets the interestRate property.
	public SavingsAccount(int accountNumber, String holderName, double balance,double interestRate) {
		super(accountNumber, holderName, balance, "Savimg");
		this.interestRate = interestRate;
		
	}
	//calculateInterest(): This method calculates the interest on the account balance by multiplying the balance by the interest rate and dividing by 100. 
	//The result is returned as a double value.
	public double calculateInterest() {
		return getBalance() * interestRate / 100;
	}
    //deposit(double amount): This method deposits money into the account by adding the amount to the current balance.
	//It uses the setBalance() method to update the balance.
	@Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }
//withdraw(double amount): This method withdraws money from the account if the amount is less than or equal to the current balance.
	//If the amount is greater than the balance, it prints an error message "Insufficient funds for withdrawal.".
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
//getAccountInfo(): This method returns a string containing information about the account, including the account number, holder name, balance, and account type.
    @Override
    public String getAccountInfo() {
        return "Account Number: " + getAccountNumber() + ", Account Holder: " + getholderName() +
               ", Balance: " + getBalance() + ", Account Type: " + getAccountType();
    }
}
