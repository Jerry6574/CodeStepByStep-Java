/* LeastCommon.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/leastCommon

Write a method leastCommon that accepts a HashMap whose keys are strings and 
whose values are integers as a parameter and returns the integer value that 
occurs the fewest times in the map. For example, if a map named m contains 
{Alyssa=22, Char=25, Dan=25, Jeff=20, Kasey=20, Kim=20, Mogran=25, Ryan=25, Stef=22}, 
the call of leastCommon(m) returns 22. 

If there is a tie, return the smaller integer value. 
If the map is empty, throw an IllegalArgumentException.

 */
import java.util.*;

import acm.program.*;


public class LeastCommon extends ConsoleProgram {
    
    public void run() {
        while (true) {
            println("You said: " + readLine());
        }
    }
    
    public int leastCommon(HashMap<String, Integer> m) throws IllegalArgumentException{
    	if(m.size() == 0) {
    		throw new IllegalArgumentException();
    	}
    	TreeMap<Integer, Integer> freq = new TreeMap<>();
    	
    	for(int n: m.values()) {
    		if(freq.containsKey(n)) {
    			int count = freq.get(n);
    			freq.put(n, count + 1);
    		} else {
    			freq.put(n, 1);
    		}
    	}
    	
    	Map.Entry<Integer, Integer> minEntry = null;

    	for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
    		
    	    if (minEntry == null || entry.getValue().compareTo(minEntry.getValue()) < 0){
    	        minEntry = entry;
    	        
    	    } else if(entry.getValue().compareTo(minEntry.getValue()) == 0) {
    	    	if(entry.getKey() < minEntry.getKey()) {
    	    		minEntry = entry;
    	    	}
    	    }
    	}
    	
    	return minEntry.getKey();
    }
}
