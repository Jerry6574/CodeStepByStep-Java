/* RarestAge.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/rarestAge

Write a method named rarestAge that accepts as a parameter a HashMap from 
students' names (strings) to their ages (integers), and returns the least frequently occurring age. 
Consider a map variable named m containing the following key/value pairs:

{Char=45, Dan=45, Jerry=23, Kasey=10, Jeff=10, Elmer=45, Kim=10, Ryan=45, Mehran=23}

Three people are age 10 (Kasey, Jeff, and Kim), two people are age 23 (Jerry and Mehran), 
and four people are age 45 (Char, Dan, Elmer, and Ryan). 
So a call of rarestAge(m) returns 23 because only two people are that age.
If there is a tie (two or more rarest ages that occur the same number of times), 
return the youngest age among them. For example, if we added another pair of Steve=23 to the map above, 
there would now be a tie of three people of age 10 (Kasey, Jeff, Kim) and three people of age 23 
(Jerry, Mehran, Steve). So a call of rarestAge(m) would now return 10 because 10 is the smaller of the rarest values. This implies that if every person in the map has a unique age, your method would return the smallest of all the ages in the map.

If the map passed to your method is null or empty, your method should return 0. 
You may assume that no key or value stored in the map is null. 
Otherwise you should not make any assumptions about the number of key/value pairs in the map or 
the range of possible ages that could be in the map.

Constraints: You may create one collection of your choice as auxiliary storage to solve this problem. 
You can have as many simple variables as you like. 
You should not modify the contents of the map passed to your method.

 */
import java.util.*;

import acm.program.*;

public class RarestAge extends ConsoleProgram {
    
    public void run() {
    	
    	HashMap<String, Integer> m = new HashMap<>();
    	m.put("Alyssa", 21); 
    	m.put("Dan", 21); 
    	m.put("Lindsey", 21); 
    	m.put("Jerry", 20); 
    	
    	println(rarestAge(m));
    }
    
    public int rarestAge(HashMap<String, Integer> m) {
    	if(m.size() == 0) return 0;
    	
    	HashMap<Integer, Integer> ageFreq = new HashMap<>();
    	
    	for(int age: m.values()) {
    		if(ageFreq.containsKey(age)) {
    			int count = ageFreq.get(age);
    			ageFreq.put(age, count + 1);
    		} else {
    			ageFreq.put(age, 1);
			}
    	}
    	
    	Map.Entry<Integer, Integer> minAgeEntry = null;

    	for (Map.Entry<Integer, Integer> ageEntry : ageFreq.entrySet()){
    	    if (minAgeEntry == null || ageEntry.getValue().compareTo(minAgeEntry.getValue()) < 0){
    	    	minAgeEntry = ageEntry;
    	    
    	    	// pick the younger age if two ages have the same frequency
    	    } else if (ageEntry.getValue().compareTo(minAgeEntry.getValue()) == 0) {
				if(ageEntry.getKey() < minAgeEntry.getKey()) {
					minAgeEntry = ageEntry;
				}
			}
    	}
    	
    	return minAgeEntry.getKey();
    }
}
