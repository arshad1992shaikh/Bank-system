package bankingSystem;
//This code defines a CheckingAccount class that extends the Account class in the bankingSystem package.
//The CheckingAccount class represents a checking account and has the following properties and methods:
public class CheckingAccount extends Account{
	
	
	private double overdraftLimit;//overdraftLimit: a double representing the overdraft limit of the checking account
	
	
    //The CheckingAccount constructor takes four parameters: accountNumber, holderName, balance, and overdraftLimit. 
   //It calls the Account constructor with the first three parameters and sets the accountType to "Checking". 
	//It also sets the overdraftLimit property.
	public CheckingAccount(int accountNumber, String holderName, double balance, double overdraftLimit) 
	{
		super(accountNumber, holderName, balance,"Checking");
		this.overdraftLimit = overdraftLimit;
	}
//deposit(double amount): an overridden method that deposits money into the account
	
	@Override
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	
		
	}
//withdraw(double amount): an overridden method that withdraws money from the account
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if (amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
		
	}
	//getAccountInfo(): an overridden method that returns a string containing information about the account
	@Override
	public String getAccountInfo() {
		return "Account Number: " + getAccountNumber() + ", Account Holder: " + getholderName() +
	               ", Balance: " + getBalance() + ", Account Type: " + getAccountType();
	}
	

}
