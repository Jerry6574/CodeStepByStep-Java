/* CountInRange.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/countInRange

Write a method named countInRange that accepts three parameters: an ArrayList of integers, 
a minimum and maximum integer, and returns the number of elements in the list within that range inclusive. 

For example, if the list v contains {28, 1, 17, 4, 41, 9, 59, 8, 31, 30, 25}, 
the call of countInRange(v, 10, 30) should return 4. 
If the list is empty, return 0. Do not modify the list that is passed in.

 */
import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class CountInRange extends ConsoleProgram {
    
    public void run() {
    	ArrayList<Integer> v = new ArrayList<Integer>(Arrays.asList(28, 1, 17, 4, 41, 9, 59, 8, 31, 30, 25));
    	int min = 10;
    	int max = 30;
    	
    	println(countInRange(v, min, max));
    }
    
    public int countInRange(ArrayList<Integer> v, int min, int max) {
    	if(v.size() == 0) {
    		return 0;
    	}
    	
    	int count = 0;
    	
    	for(int i = 0; i < v.size(); i++) {
    		if(v.get(i) >= min && v.get(i) <= max) {
    			count++;
    		}
    	}
    	
    	return count;
    }
    
}
