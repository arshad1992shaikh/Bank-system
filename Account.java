//This code defines an abstract class named Account in a package named bankingSystem.
//The Account class represents a bank account and has the following properties:
package bankingSystem;

abstract class Account{
	private int accountNumber;//accountNumber: an integer representing the account number
	private String holderName;
	private double balance;
	private String accountType;
	
	
	public Account(int accountNumber, String holderName, double balance, String accountType) {
		//super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
		this.accountType = accountType;
	}
	
	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public int getAccountNumber() {
		return accountNumber;
	}



	public String getholderName() {
		return holderName;
	}



	public String getAccountType() {
		return accountType;
	}
    //deposit(double amount): an abstract method that represents the action of depositing money into the account
	public abstract void deposit(double amount);
    //withdraw(double amount): an abstract method that represents the action of withdrawing money from the account
	public abstract void withdraw(double amount);
    //an abstract method that returns a string containing information about the account
	public abstract String getAccountInfo();
	
}//Since the Account class is abstract, it cannot be instantiated on its own. Instead, 
//it must be extended by other classes that provide concrete implementations of the abstract methods. 
//This allows for the creation of different types of bank accounts (e.g., checking accounts, savings accounts) that share common properties and methods.