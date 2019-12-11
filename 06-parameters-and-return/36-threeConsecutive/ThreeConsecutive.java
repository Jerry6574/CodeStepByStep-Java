/* ThreeConsecutive.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/threeConsecutive

Write a method named threeConsecutive that accepts three integers as parameters 
and returns true if they are three consecutive numbers; that is, 
if the numbers can be arranged into an order such that their values differ by exactly 1.
 
For example, the call of threeConsecutive(3, 2, 4) would return true.

 */
import acm.program.*;

public class ThreeConsecutive extends ConsoleProgram {
    
    public void run() {
    	println(threeConsecutive(3, 2, 4));
    }
    
    public boolean threeConsecutive(int a, int b, int c) {
    	if(Math.abs(a - b) == 1) {
    		if(Math.abs(Math.max(a, b) - c) == 1) {
    			return true;
    		} else {
    			return false;
    		}
    	} else if(Math.abs(a - b) == 2) {
    		if(Math.abs(Math.min(a, b) - c) == 1) {
    			return true;
    		} else {
    			return false;
    		}
    	} else {
    		return false;
    	}
    }
    
}
