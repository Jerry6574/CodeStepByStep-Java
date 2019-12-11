/* HasDuplicateValue.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/hasDuplicateValue

Write a method named hasDuplicateValue that accepts a Map from strings to strings 
as a parameter and returns true if any two keys map to the same value. 

For example, if a map named m stores 
{Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Meghan=Miller, Hal=Perkins}, 
the call of hasDuplicateValue(m) would return true because both "Jessica" and "Meghan" map to the value "Miller". 
Return false if passed an empty or one-element map. Do not modify the map passed in.

 */
import java.util.*;

import acm.program.*;

public class HasDuplicateValue extends ConsoleProgram {
    
    public void run() {
    	Map<String, String> map = new HashMap<>();
    	map.put("Marty", "Stepp");
    	map.put("Stuart", "Reges");
    	map.put("Jessica", "Miller");
    	map.put("Amanda", "Camp");
    	map.put("Meghan", "Miller");
    	map.put("Hal", "Perkins");
    	
    	println(hasDuplicateValue(map));
    }
    
    public boolean hasDuplicateValue(Map<String, String> map) {
    	Set<String> valueSet = new HashSet<>();
    	valueSet.addAll(map.values());
    	
    	if(map.values().size() > valueSet.size()) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
