/* SumOfRange.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/sumOfRange

Write a method named sumOfRange method that accepts two integer parameters min and max 
and returns the sum of the integers from min through max inclusive. 
For example, the call of sumOfRange(3, 7) returns 3 + 4 + 5 + 6 + 7 or 25. 
If min is greater than max, return 0.

 */
import acm.program.*;

public class SumOfRange extends ConsoleProgram {
    
    public void run() {
    	println(sumOfRange(3, 7));
    }
    
    public int sumOfRange(int min, int max) {
    	int sum = 0;
    	
    	if(min > max) {
    		return 0;
    	} else if(min == max) {
    		return min;
    	} else {
    		int dif = max - min;
    		for(int i = 0; i < dif + 1; i++) {
    			sum = sum + min + i;
    		}
    		return sum;
    	}
    }
    
}
