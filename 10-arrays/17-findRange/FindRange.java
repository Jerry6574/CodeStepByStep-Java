/* FindRange.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/findRange

Write a method named findRange that accepts an array of integers as a parameter 
and returns the range of values contained in the array, 
which is equal to one more than the difference between its largest and smallest element. 

For example, if the largest element is 17 and the smallest is 6, the range is 12. 
If the largest and smallest values are the same, the range is 1.

Constraints: You may assume that the array contains at least one element (that its length is at least 1). 
You should not modify the contents of the array.

 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
    
    public void run() {
    	int[] array = {8, 3, 5, 7, 2, 4}; 
    	println(findRange(array));
    }
    
    public int findRange(int[] array) {
    	int max = array[0];
    	int min = array[0];
    	
    	for(int i = 1; i < array.length; i++) {
    		if(array[i] > max) {
    			max = array[i];
    		}
    		if(array[i] < min) {
    			min = array[i];
    		}
    	}
    	int range = max - min + 1;
    	return range;
    }
}
