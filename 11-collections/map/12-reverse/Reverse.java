/* Reverse.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/reverse

Write a method named reverse that accepts a map from integers to strings as a 
parameter and returns a new map of strings to integers that is the original's "reverse". 
The reverse of a map is defined here to be a new map that uses the values from 
the original as its keys and the keys from the original as its values. 

Since a map's values need not be unique but its keys must be, 
it is acceptable to have any of the original keys as the value in the result. 
In other words, if the original map has pairs (k1, v) and (k2, v), 
the new map must contain either the pair (v, k1) or (v, k2).

For example, for the following map:

{42=Marty, 81=Sue, 17=Ed, 31=Dave, 56=Ed, 3=Marty, 29=Ed}
Your method could return the following new map (the order of the key/value pairs does not matter):

{Marty=3, Sue=81, Ed=29, Dave=31}
Do not modify the map passed in as the parameter.

 */
import java.util.*;

import acm.program.*;

public class Reverse extends ConsoleProgram {
    
    public void run() {
    	HashMap<Integer, String> map = new HashMap<>();
    	map.put(42, "Marty");
    	map.put(81, "Sue");
    	map.put(17, "Ed");
    	map.put(31, "Dave");
    	map.put(56, "Ed");
    	map.put(3, "Marty");
    	map.put(29, "Ed");
    	
    	println(reverse(map).toString());
    }
    
    public HashMap<String, Integer> reverse(HashMap<Integer, String> map) {
    	HashMap<String, Integer> reversedMap = new HashMap<>();
    	
    	for(Map.Entry<Integer, String> entry: map.entrySet()) {
    		reversedMap.put(entry.getValue(), entry.getKey());
    	}
    	
    	return reversedMap;
    }
    
}
