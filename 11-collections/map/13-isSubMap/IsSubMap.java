/* IsSubMap.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/isSubMap

Write a method named isSubMap that accepts two hash maps from strings to strings as 
its parameters and returns true if every key in the first map is also contained in 
the second map and maps to the same value in the second map.

For example, given the maps below, map1 is a sub-map of map2, so the call of isSubMap(map1, map2) 
would return true. The order of the parameters does matter, so the call of isSubMap(map2, map1) would return false.

But map3 is not a sub-map of map2 because the key "Alisha" is not in map2 
and also because the key "Smith" does not map to the same value as it does in map2; 
therefore the call of isSubMap(map3, map2) would return false. The empty map is 
considered to be a sub-map of every map, so the call of isSubMap(map4, map1) would return true.

map1: {Smith=949-0504, Marty=206-9024}
map2: {Marty=206-9024, Hawking=123-4567, Smith=949-0504, Newton=123-4567}
map3: {Alisha=321-7654, Hawking=123-4567, Smith=888-8888}
map4: {}

Constraints: You may not declare any auxiliary data structures in solving this problem.

 */
import java.util.*;

import acm.program.*;

public class IsSubMap extends ConsoleProgram {
    
    public void run() {
    	HashMap<String, String> map1 = new HashMap<>();
    	map1.put("Smith", "949-0504");
    	map1.put("Marty", "206-9024");
    	
    	HashMap<String, String> map2 = new HashMap<>();
    	map2.put("Marty", "206-9024");
    	map2.put("Hawking", "123-4567");
    	map2.put("Smith", "949-0504");
    	map2.put("Newton", "123-4567");
    	
    	println(isSubMap(map1, map2));
    }
    
    public boolean isSubMap(HashMap<String, String> map1, HashMap<String, String> map2) {
    	if(map1.size() == 0) return true;
    	
    	for(Map.Entry<String, String> entry: map1.entrySet()) {
    		String key = entry.getKey();
    		String value = entry.getValue();
    		if(!(map2.containsKey(key) && map2.get(key) == value)) {
    			return false;
    		}
    	}
    	
    	return true;
    }
}
