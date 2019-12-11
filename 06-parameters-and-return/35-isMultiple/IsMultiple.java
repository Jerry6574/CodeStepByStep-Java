/* IsMultiple.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/isMultiple

Write a method named isMultiple that accepts two non-negative int parameters a and b, 
and returns true if a is a multiple of b, and false otherwise. 

For example, the call of isMultiple(15, 5) would return true because 15 = 5 * 3. 
You may assume that a and b are non-negative integers and that b is not 0.

 */


import acm.program.*;

public class IsMultiple extends ConsoleProgram {
    
    public void run() {
    	println(isMultiple(15, 5));
    }
    
    public boolean isMultiple(int a, int b) {
    	if(a % b == 0) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
}
