/* 

Solution to: https://www.codestepbystep.com/problem/view/java/classes/BankAccount-transactionFee

 */

public class BankAccount {
    
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
    
    public void setTransactions(int transactions) {
    	this.transactions = transactions;
    }
    
    // Adds the amount to the balance if it is between 0-500.
    // Also counts as 1 transaction.
    public void deposit(double amount) {
    	balance += amount;
    }
    
    // Subtracts the amount from the balance if the user has enough money.
    // Also counts as 1 transaction.
    public void withdraw(double amount) {
    	balance -= amount;
    }
    
    public boolean transactionFee(double fee){
        if(transactions == 0){
            return false;
        }
        
        for(int i = 1; i <= transactions; i++){
            if(balance <= i * fee || balance == 0.0){
                balance = 0.0;
                return false;
            } else{
                balance -= i * fee;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
    	BankAccount savings = new BankAccount("Jimmy");
    	savings.deposit(10.00);
    	savings.deposit(50.00);
    	savings.deposit(10.00);
    	savings.deposit(70.00);
    	
    	savings.setTransactions(4);
    	
    	System.out.println(savings.transactionFee(5.0));
    	System.out.println(savings.balance);
    }
}
