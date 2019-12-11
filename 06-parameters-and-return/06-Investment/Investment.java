/* Investment.java

Solution to https://www.codestepbystep.com/problem/view/java/parameters/Investment

Write a console program in a class named Investment that calculates money earned by two investors. 
Use the following compound interest formula:

PV * (1 + r)^n = FV
Also report the overall "quality" of the investment as from the table below:

Profit	  	Category
0 - 10%	   	weak
10 - 50%	medium
over 50%	strong

Match the following example output log (with user input shown like this):

Investor #1:
Initial amount? 100.00
Interest rate%? .03
Num. of months? 5
Final amount = $115.93
Profit = $15.93 (16%)
medium

Investor #2:
Initial amount? 5.25
Interest rate? .08
Num. of months? 24
Final amount = $33.29
Profit = $28.04 (534%)
strong

Have a nice day!

 */
import acm.program.*;

public class Investment extends ConsoleProgram {
    
    public void run() {
    	for(int i = 1; i <= 2; i++) {
    		calculateEarnings(i);
    	}
    	println("Have a nice day!");
    }
    
    public void calculateEarnings(int investor) {
    	println(String.format("Investor #%d: ", investor));
    	
    	double amount = readDouble("Initial amount? ");
    	double interestRate = readDouble("Interest rate%? ");
    	int nMonth = readInt("Num. of months? ");
    	
    	double finalAmount = amount * Math.pow((1 + interestRate), nMonth);		
    	println(String.format("Final amount = $%.2f", finalAmount));
    	
    	double profit = finalAmount - amount;
    	double profitPercent = profit / amount;
    	println(String.format("Profit = $%.2f (%d", profit, Math.round(profitPercent * 100)) + "%)");
    	
    	String category =categorize(profitPercent);
    	println(category + "\n");
    }
    
    public String categorize(double profitPercent) {
    	String category;
    	if(profitPercent > 0 && profitPercent <= 0.1) {
    		category = "weak";
    	} else if(profitPercent > 0.1 && profitPercent <= 0.5) {
    		category = "medium";
    	} else {
    		category = "strong";
    	}
    	return category;
    }
}
