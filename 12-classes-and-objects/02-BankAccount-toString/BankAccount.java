/* BankAccountToString.java

Solution to: https://www.codestepbystep.com/problem/view/java/classes/BankAccount-toString

 */


public class BankAccount {
	private String name;
	private double balance;
    
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public String toString() {
		String negativeSign = "";
		if(balance < 0) {
			negativeSign = "-";
		}
		
		String output = name + ", " + negativeSign + "$" + String.format("%.2f", Math.abs(balance));
		return output;
	}
	
	public static void main(String[] args) {
		String name = "Benson";
		double balance = -17.25;
		
		BankAccount account = new BankAccount(name, balance);
		
		System.out.println(account.toString());
	}
}
