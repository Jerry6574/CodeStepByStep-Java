/* HasThree.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/hasThree

Write a method named hasThree that accepts a list of strings as a 
parameter and returns true if any string value occurs at least 3 times in the list. 

For example, in the list ["to", "be", "or", "be", "to", "be", "hamlet"], the word "be" occurs 3 times, 
so your method would return true if passed that list. 
Use a HashMap as auxiliary storage to help solve the problem. Do not modify the list that is passed in.

 */
import java.util.*;

import acm.program.*;

public class HasThree extends ConsoleProgram {
    
    public void run() {
    	ArrayList<String> list = new ArrayList<>(Arrays.asList("to", "be", "or", "be", "to", "be", "hamlet"));
    	println(hasThree(list));
    }
    
    public boolean hasThree(ArrayList<String> list) {
    	Map<String, Integer> map = new HashMap<>();
    	
    	for(String str: list) {
    		if(map.containsKey(str)) {
    			map.put(str, 1 + map.get(str));
    		} else {
    			map.put(str, 1);
    		}
    	}
    	
    	for(int count: map.values()) {
    		if(count >= 3) {
    			return true;
    		}
    	}
    	
    	return false;
    }
    
}
