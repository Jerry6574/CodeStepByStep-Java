/* SumOfDigits.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/sumOfDigits

Write a method named sumOfDigits that accepts an integer parameter and computes 
and returns the sum of all the digits of that number. 
For example, sumOfDigits(38015) returns 3+8+1+0+5 or 17. 
For negative numbers, return the same value as if the number were positive. 
For example, sumOfDigits(-72) returns 7+2 or 9.

 */
import acm.program.*;

public class SumOfDigits extends ConsoleProgram {
    
    public void run() {
    	println(sumOfDigits(-72));
    }
    
    public int sumOfDigits(int n) {
    	int num = Math.abs(n);
    	int sum = 0;
    	
    	while(true) {
    		if(num / 10 == 0) {
    			sum += num;
    			return sum;
    		}
    		
    		int digit = num % 10;
    		sum += digit;
    		num /= 10;
    	}

    }
}
