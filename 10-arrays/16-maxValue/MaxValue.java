/* MaxValue.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/maxValue

Write a method named maxValue that accepts an array of integers as a 
parameter and returns the maximum value in the array. 

For example, if an array named a passed stores {17, 7, -1, 26, 3, 9}, 
the call of maxValue(a) should return 26. You may assume that the array contains at least one element. 
Your method should not modify the elements of the array.

 */
import acm.program.*;

public class MaxValue extends ConsoleProgram {
    
    public void run() {
    	int[] a = {17, 7, -1, 26, 3, 9}; 
    	println(maxValue(a));
    }
    
    public int maxValue(int[] data) {
    	int max = data[0];
    	
    	for(int i = 1; i < data.length; i++) {
    		if(data[i] > max) {
    			max = data[i];
    		}
    	}
    	
    	return max;
    }
    
}
