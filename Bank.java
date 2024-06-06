package bankingSystem;
//ArrayList is a specific class in the java.util package that implements a resizable array, which is a type of data structure
import java.util.ArrayList;
//This line imports the List interface from the java.util package.
//List is an interface in the java.util package that defines a collection of elements that can be accessed by index
import java.util.List;

public class Bank {
    //accounts: a List<Account> that stores all the accounts in the bank. It's initialized with an empty ArrayList.
	private List<Account> accounts = new ArrayList<>();
	
	//addAccount(Account account): adds a new Account object to the accounts list.
	 public void addAccount(Account account) {
	        accounts.add(account);
	    }
     //removeAccount(int accountNumber): removes an Account object from the accounts list based on the provided accountNumber.
	 //It uses the removeIf() method with a lambda expression to filter out the account with the matching number.
	    public void removeAccount(int accountNumber) {
	        accounts.removeIf(account -> account.getAccountNumber() == accountNumber);
	    }
	    
	    //getAccount(int accountNumber): retrieves an Account object from the accounts list based on the provided accountNumber. 
	    //It iterates through the list and returns the first matching account, or null if no account is found.
	    public Account getAccount(int accountNumber) {
	        for (Account account : accounts) {
	            if (account.getAccountNumber() == accountNumber) {
	                return account;
	            }
	        }
	        return null;
	    }
	    //displayAccounts(): prints out the account information for all accounts in the accounts list.
	    //It uses a for loop to iterate through the list and calls the getAccountInfo() method on each account to retrieve its information.
	    public void displayAccounts() {
	        for (Account account : accounts) {
	            System.out.println(account.getAccountInfo());
	        }

}
	    }

