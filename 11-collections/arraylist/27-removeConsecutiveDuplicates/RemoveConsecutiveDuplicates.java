/* RemoveConsecutiveDuplicates.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/removeConsecutiveDuplicates

Write a method named removeConsecutiveDuplicates that accepts as a parameter an ArrayList of integers, 
and modifies it by removing any consecutive duplicates. 

For example, if a list named v stores {1, 2, 2, 3, 2, 2, 3}, the call of removeConsecutiveDuplicates(v); 
should modify it to store {1, 2, 3, 2, 3}.

 */
import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class RemoveConsecutiveDuplicates extends ConsoleProgram {
    
    public void run() {
    	ArrayList<Integer> v = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 2, 2, 3));
    	removeConsecutiveDuplicates(v);
    	println(v.toString());
    }
    
    public void removeConsecutiveDuplicates(ArrayList<Integer> v) {
    	for(int i = 1; i < v.size(); i++) {
    		if(v.get(i-1) == v.get(i)) {
    			v.remove(i-1);
    			i--;
    		}
    	}
    }
}
