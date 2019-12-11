/* IsPrimeNumber.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/isPrimeNumber

Write a method named isPrimeNumber that accepts an integer as a parameter and returns true if that integer is a prime number. 
A prime number is an integer that has no factors other than 1 and itself. 
The number 2 is defined as the smallest prime number.

*/


import acm.program.*;

public class IsPrimeNumber extends ConsoleProgram {
    
    public void run() {
    	println(isPrimeNumber(9));
    }
    
    
    public boolean isPrimeNumber(int n) {
    	if(n <= 1) return false;
    	if(n <= 3) return true;
    	
    	if(n % 2 == 0 || n % 3 == 0) {
    		return false;
    	}
    	
    	// every prime number greater than 3 can be expressed as 6k+1 or 6k-1 for k >= 1 in natural numbers
    	for(int i = 5; i < Math.sqrt(n); i = i + 6) {
    		// trial division test
    		if(n % i == 0 || n % (i+2) == 0) {
    			return false;
    		}
    	}
    	
    	return true;
    }
}
