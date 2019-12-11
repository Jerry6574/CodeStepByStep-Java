/* Factorial.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/factorial

Write a method named factorial that accepts an integer n as a parameter and returns the factorial of n, or n!. 
A factorial of an integer is defined as the product of all integers from 1 through that integer inclusive. 
For example, the call of factorial(4) should return 1 * 2 * 3 * 4, or 24. 
The factorial of 0 and 1 are defined to be 1. 
You may assume that the value passed is non-negative and that its factorial can fit in the range of type int.

 */
import acm.program.*;

public class Factorial extends ConsoleProgram {
    
    public void run() {
    	println(factorial(1));
    }
    
    public int factorial(int n) {
    	int num = n;
    	int result = 1;
    	
    	while(true) {
    		if(num == 1 || num == 0) {
    			break;
    		}
    		result *= num;
    		num--;
    	}
    	return result;
    }
    
}
