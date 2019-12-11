/* RemoveRange.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/set/removeRange

Write a method called removeRange that accepts three parameters: a Set of integers, 
a minimum value, and a maximum value. The method should remove any values from the set 
that are between that minimum and maximum value, inclusive. 

For example, if a Set named s contains [3, 17, -1, 4, 9, 2, 14], 
the call of removeRange(s, 1, 10); should modify s to store [17, -1, 14].

 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import acm.program.*;

public class RemoveRange extends ConsoleProgram {
    
    public void run() {
    	Set<Integer> s = new HashSet<>(Arrays.asList(3, 17, -1, 4, 9, 2, 14));
    	int min = 1;
    	int max = 10;
    	removeRange(s, min, max);
    	println(s.toString());
    }
    
    public void removeRange(Set<Integer> s, int min, int max) {
    	
    	for (Iterator<Integer> iterator = s.iterator(); iterator.hasNext();) {
    	    int n =  iterator.next();
    	    if (n >= min && n<= max) {
    	        iterator.remove();
    	    }       
    	}
    }
}
