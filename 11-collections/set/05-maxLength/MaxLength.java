/* MaxLength.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/set/maxLength

Write a method maxLength that accepts as a parameter a TreeSet of strings, 
and that returns the length of the longest string in the set. 
If your method is passed an empty set, it should return 0.

 */

import java.util.Arrays;
import java.util.TreeSet;

import acm.program.*;

public class MaxLength extends ConsoleProgram {
    
    public void run() {
    	TreeSet<String> set = new TreeSet<>(Arrays.asList("I", "Love", "You"));
    	println(maxLength(set));
    }
    
    public int maxLength(TreeSet<String> set) {
    	if(set.size() == 0) {
    		return 0;
    	}
    	
    	int max = 0;
    	for(String s: set) {
    		if(s.length() > max) {
    			max = s.length();
    		}
    	}
    	
    	return max;
    }  
}
