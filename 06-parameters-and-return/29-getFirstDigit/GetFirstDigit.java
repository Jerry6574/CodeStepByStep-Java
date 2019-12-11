/* MyProgram.java

Solution: https://www.codestepbystep.com/problem/view/java/parameters/getFirstDigit

Write a method named getFirstDigit that returns the first digit of an integer. 
For example, getFirstDigit(3572) should return 3

 */
import acm.program.*;

public class GetFirstDigit extends ConsoleProgram {
    
    public void run() {
    	println(getFirstDigit(3572));
    }
    
    public int getFirstDigit(int n) {
    	int num = n;
    	
    	while(true) {
    		if(num / 10 == 0) {
    			return Math.abs(num);
    		}
    		num /= 10;
    	}
    	
    }
    
}
