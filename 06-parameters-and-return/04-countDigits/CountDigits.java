/* CountDigits.java

Solution to https://www.codestepbystep.com/problem/view/java/parameters/countDigits

Write a method named countDigits that accepts an integer parameter and returns the number of digits in that integer. 
For example, countDigits(38015) returns 5. For negative numbers, 
return the same value as if the number were positive. For example, countDigits(-72) returns 2.

 */
import acm.program.*;

public class CountDigits extends ConsoleProgram {
    
    public void run() {
    	print(countDigits(-72));
    }
    
    public int countDigits(int n) {
    	int nCopy = n;
    	int nDigits = 0;
    	
    	while(true) {
    		nDigits += 1;
    		nCopy /= 10;
    		
    		if(nCopy == 0) {
    			break;
    		}
    	}
    	return nDigits;
    }
    
}
