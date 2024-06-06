package bankingSystem;

import java.util.Scanner;

public class Main {
   
	
	public static void main(String[] args) {
        Bank bank = new Bank();//
        Scanner scanner = new Scanner(System.in);//A new Scanner object is created, which will be used to read user input from the console.
        //The program uses a Scanner object to read user input from the console.
        //The user's choice is stored in the choice variable.
        ///The program uses a switch statement to process the user's choice.
        
        while (true) {//The program displays a menu with 6 options:
        	
            System.out.println("Welcome to the Banking System");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Display Accounts");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
               
            case 1://The user is prompted to enter the account number, holder name, initial balance, and interest rate.
            	//A SavingsAccount object is created with the provided information.
            	//The addAccount method of the Bank class is called to add the new account to the bank's list of accounts.
            	//A success message is displayed.
                    System.out.print("Enter account number: ");
                    int savingsAccountNumber = scanner.nextInt();
                    System.out.print("Enter holder name: ");
                    String savingsholderName = scanner.next();
                    System.out.print("Enter initial balance: ");
                    double savingsBalance = scanner.nextDouble();
                    System.out.print("Enter interest rate: ");
                    double interestRate = scanner.nextDouble();
                    SavingsAccount savingsAccount = new SavingsAccount(savingsAccountNumber, savingsholderName, savingsBalance, interestRate);
                    bank.addAccount(savingsAccount);
                    System.out.println("Savings account created successfully.");
                    break;

                
            case 2://The user is prompted to enter the account number, holder name, initial balance, and overdraft limit.
            	    //A CheckingAccount object is created with the provided information.
            	   //The addAccount method of the Bank class is called to add the new account to the bank's list of accounts.
                    System.out.print("Enter account number: ");
                    int checkingAccountNumber = scanner.nextInt();
                    System.out.print("Enter holder name: ");
                    String checkingHolderName = scanner.next();
                    System.out.print("Enter initial balance: ");
                    double checkingBalance = scanner.nextDouble();
                    System.out.print("Enter overdraft limit: ");
                    double overdraftLimit = scanner.nextDouble();
                    CheckingAccount checkingAccount = new CheckingAccount(checkingAccountNumber, checkingHolderName, checkingBalance, overdraftLimit);
                    bank.addAccount(checkingAccount);
                    System.out.println("Checking account created successfully.");
                    break;

                
            case 3://The user is prompted to enter the account number and amount to deposit.
            	//The getAccount method of the Bank class is called to retrieve the account object associated with the entered account number.
            	//If the account is found, the deposit method of the account object is called to deposit the amount.
                   System.out.print("Enter account number: ");
                    int depositAccountNumber = scanner.nextInt();
                    Account depositAccount = bank.getAccount(depositAccountNumber);
                    if (depositAccount != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        depositAccount.deposit(depositAmount);
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                
            case 4:/*The user is prompted to enter the account number and amount to withdraw.
                     the getAccount method of the Bank class is called to retrieve the account object associated with the entered account number.
                     If the account is found, the withdraw method of the account object is called to withdraw the amount.*/
                    System.out.print("Enter account number: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    Account withdrawAccount = bank.getAccount(withdrawAccountNumber);
                    if (withdrawAccount != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdrawAccount.withdraw(withdrawAmount);
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

               
            case 5:
                    System.out.println("Displaying all accounts:");
                    bank.displayAccounts();
                    break;

                
            case 6://A farewell message is displayed.
            	   //The Scanner object is closed.
            	   //The program exits using System.exit(0)
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                
            default://If the user enters an invalid option, an error message is displayed.
                    System.out.println("Invalid option. Please try again.");
            }
            System.out.println();//The program runs in an infinite loop, allowing the user to repeatedly interact with the banking system until they choose to exit
        }
    }
}
