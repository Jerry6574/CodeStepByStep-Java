/* MaxOccurrences.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/maxOccurrences

Write a method named maxOccurrences that accepts a list of integers as a 
parameter and returns the number of times the most frequently occurring integer 
(the "mode") occurs in the list. Solve this problem using a map as auxiliary storage. 
If the list is empty, return 0. Do not modify the list passed in as a parameter.

 */
import java.util.*;

import acm.program.*;

public class MaxOccurrences extends ConsoleProgram {
    
    public void run() {
    	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 6, 5, 6, 5, 6));
    	println(maxOccurrences(list));
    }
    
    public int maxOccurrences(ArrayList<Integer> list) {
    	if(list.size() == 0) return 0;
    	
    	Map<Integer, Integer> numFrequencies = new HashMap<>();
    	
    	for(int n: list) {
    		if(numFrequencies.containsKey(n)) {
    			int freq = numFrequencies.get(n);
    			numFrequencies.put(n, freq + 1);
    		} else {
    			numFrequencies.put(n, 1);
    		}
    	}
    	
// 		alternative way to get the mode
//    	int mode = Collections.max(numFrequencies.values());
    	
    	Map.Entry<Integer, Integer> maxEntry = null;

    	for (Map.Entry<Integer, Integer> entry : numFrequencies.entrySet())
    	{
    	    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
    	    {
    	        maxEntry = entry;
    	    }
    	}
    	
    	int mode = maxEntry.getValue();

    	return mode;
    }
}
