/* GetLastDigit.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/getLastDigit

Write a method named getLastDigit that returns the last digit of an integer. 
For example, the call of getLastDigit(3572) should return 2.

 */
import acm.program.*;

public class GetLastDigit extends ConsoleProgram {
    
    public void run() {
    	println(getLastDigit(3572));
    }
    
    public int getLastDigit(int num) {
    	return Math.abs(num % 10);
    }
    
}
