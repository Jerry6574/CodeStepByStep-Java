/* Rarest.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/rarest

Write a method named rarest that accepts a TreeMap from strings to strings as a parameter 
and returns the value that occurs least frequently in the map. If there is a tie, 
return the value that comes earlier in ABC order. For example, if a variable called map 
containing the following elements:

{"Alyssa":"Harding", "Char":"Smith", "Dan":"Smith", "Jeff":"Jones", "Kasey":"Jones",
 "Kim":"Smith", "Morgan":"Jones", "Ryan":"Smith", "Stef":"Harding"}
 
Then a call of rarest(map) would return "Harding" because that value occurs 2 times, fewer than any other. 
Note that we are examining the values in the map, not the keys. 
If the map passed is empty, throw an IllegalArgumentException.

Constraints: Obey the following restrictions in your solution.

	You may create one additional data structure (stack, queue, set, map, etc.) as auxiliary storage. 
	(You can have as many simple variables as you like.)
	
	You should not modify the contents of the map passed to your method.
	Declare your method in such a way that any caller can be sure that this will not happen.
	
	Your solution should run in no worse than O(N log N) time, where N is the number of pairs in the map.

 */
import java.util.*;

import acm.program.*;

public class Rarest extends ConsoleProgram {
    
    public void run() {
        while (true) {
            println("You said: " + readLine());
        }
    }
    
    public String rarest(TreeMap<String, String> map) throws IllegalArgumentException{
    	if(map.size() == 0) {
    		throw new IllegalArgumentException("Empty map is not allowed");
    	}
    	
    	TreeMap<String, Integer> valueFreqMap = new TreeMap<>();
    	
    	for(String value: map.values()) {
    		if(valueFreqMap.containsKey(value)) {
    			int count = valueFreqMap.get(value);
    			valueFreqMap.put(value, count + 1);
    		} else {
    			valueFreqMap.put(value, 1);
    		}
    	}
    	
    	Map.Entry<String, Integer> minEntry = null;

    	for (Map.Entry<String, Integer> entry : valueFreqMap.entrySet())
    	{
    	    if (minEntry == null || entry.getValue().compareTo(minEntry.getValue()) < 0)
    	    {
    	        minEntry = entry;
    	    }
    	}
    	
    	return minEntry.getKey();
    }
}
