/* PrintPay.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/printPay

Write a method named printPay that computes and prints the amount of money an employee should earn. 
Your method accepts two parameters: a real number for the employee's hourly salary, 
and an integer for the number of hours the employee worked. Every hour over 8 is paid at 1.5x the normal salary. 
For example, the call of printPay(10.00, 11); should print the following output:

Hours worked: 11
Pay earned: $125.00

You may assume that the value passed for the salary and hours are non-negative. 
Use the printf method to format real numbers properly.

 */
import acm.program.*;

public class PrintPay extends ConsoleProgram {
    
    public void run() {
    	printPay(10.00, 111);
    }
    
    public void printPay(double salary, int hours) {
    	double pay = 0;
    	if(hours <= 8) {
    		pay = salary * hours;
    	} else {
    		double basePay = salary * 8;
    		double overtimePay = (hours - 8) * salary * 1.5;
    		pay = basePay + overtimePay; 
    	}
    	
    	println("Hours worked: " + hours);
    	println(String.format("Pay earned: $%.2f", pay));
    }
}
