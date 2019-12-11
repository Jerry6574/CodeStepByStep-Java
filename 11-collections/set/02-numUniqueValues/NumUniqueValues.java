/* NumUniqueValues.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/set/numUniqueValues

Write a method named numUniqueValues that accepts an ArrayList of integers as a 
parameter and returns the number of unique integer values in the list. 

For example, if a list named l contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15], 
the call of numUniqueValues(l) should return 5. If passed the empty list, 
you should return 0. Use a Set as auxiliary storage to help you solve this problem. 
Do not modify the list passed in.

 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import acm.program.*;

public class NumUniqueValues extends ConsoleProgram {
    
    public void run() {
    	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
    	println(numUniqueValues(list));
    }
    
    public int numUniqueValues(ArrayList<Integer> list) {
    	if(list.size() == 0) {
    		return 0;
    	}
    	
    	Set<Integer> s = new HashSet<>(); 
    	for(int n: list) {
    		s.add(n);
    	}
    	
    	return s.size();
    }
}
