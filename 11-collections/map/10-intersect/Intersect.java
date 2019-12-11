/* Intersect.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/intersect

Write a method named intersect that accepts two HashMaps of strings to integers as 
parameters and that returns a new map whose contents are the intersection of the two. 
The intersection of two maps is defined here as the set of keys and values that exist in both maps. 
So if some value K maps to value V in both the first and second map, include it in your result. 
If K does not exist as a key in both maps, or if K does not map to the same value V in both maps, 
exclude that pair from your result. For example, consider the following two maps:

{Janet=87, Logan=62, Whitaker=46, Alyssa=100, Stefanie=80, Jeff=88, Kim=52, Sylvia=95}
{Logan=62, Kim=52, Whitaker=52, Jeff=88, Stefanie=80, Brian=60, Lisa=83, Sylvia=87}
Calling your method on the preceding maps would return the following new map:

{Logan=62, Stefanie=80, Jeff=88, Kim=52}
Do not modify the maps passed in as parameters.

 */
import java.util.*;

import acm.program.*;

public class Intersect extends ConsoleProgram {
    
    public void run() {
    	HashMap<String, Integer> map1 = new HashMap<>();
    	HashMap<String, Integer> map2 = new HashMap<>();
    	
    	map1.put("a", 1);
    	map1.put("b", 2);
    	map1.put("c", 3);
    	
    	map2.put("b", 2);
    	map2.put("c", 3);
    	map2.put("d", 4);
    	
    	println(intersect(map1, map2).toString());
    }
    
    public HashMap<String, Integer> intersect(HashMap<String, Integer> map1, HashMap<String, Integer> map2) {
    	HashMap<String, Integer> intersectMap = new HashMap<>();
    	
    	for(String str: map1.keySet()) {
    		if(map2.containsKey(str) && map1.get(str) == map2.get(str)) {
    			intersectMap.put(str, map1.get(str));
    		}
    	}
    	
    	return intersectMap;
    }
}
