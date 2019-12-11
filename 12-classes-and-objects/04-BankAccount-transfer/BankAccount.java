/* 

Solution to: https://www.codestepbystep.com/problem/view/java/classes/BankAccount-transfer

 */


public class BankAccount{
	private String id;
    private double balance;
    private int transactions;
    
    // Constructs a BankAccount object with the given id, and
    // 0 balance and transactions.
    public BankAccount(String id) {
    	this.id = id;
    }
    
    // returns the field values
    public double getBalance() {
    	return balance;
    }
    
    public String getID() {
    	return id;
    }
    
    public String getTransactions() {
    	return transactions + "";
    }
    
    
    // Adds the amount to the balance if it is between 0-500.
    // Also counts as 1 transaction.
    public void deposit(double amount) {
    	balance += amount;
    }
    
    // Subtracts the amount from the balance if the user has enough money.
    // Also counts as 1 transaction.
    public void withdraw(double amount) {
    	if(balance >= amount) {
    		balance -= amount;
    	}
    }
    
    // your method goes here
    public void transfer(BankAccount anotherAccount, double amount) {
    	double fee = 5.0;
    	
    	if(balance < fee || amount <= 0) {
    		return;
    	}
    	
    	balance -= fee;
    	
    	if(balance >= amount) {
    		anotherAccount.deposit(amount);
    		withdraw(amount);
    	} else {
    		anotherAccount.deposit(balance);
    		withdraw(balance);
    	}
    }

    
}
