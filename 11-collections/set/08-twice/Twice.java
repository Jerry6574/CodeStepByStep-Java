/* Twice.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/set/twice

Write a method named twice that accepts as a parameter a list of integers 
and returns a set containing all the numbers in the list that appear exactly twice. 

For example, if a list variable v stores {1, 3, 1, 4, 3, 7, -2, 0, 7, -2, -2, 1}, 
the call of twice(v) should return the set {3, 7}.

If you want an extra challenge: Use only TreeSets as auxiliary storage.

 */
import java.util.*;


import acm.program.*;

public class Twice extends ConsoleProgram {
    
    public void run() {
    	ArrayList<Integer> v = new ArrayList<>(Arrays.asList(1, 3, 1, 4, 3, 7, -2, 0, 7, -2, -2, 1));
    	println(twice(v));
    }
    
    public TreeSet<Integer> twice(ArrayList<Integer> v) {
    	TreeMap<Integer, Integer> freq = new TreeMap<>();
    	TreeSet<Integer> set = new TreeSet<>();
    	
    	for(int n: v) {
    		if(freq.containsKey(n)) {
    			freq.put(n, freq.get(n) + 1);
    		} else {
    			freq.put(n, 1);
    		}
    	}
    	
    	for(Map.Entry<Integer, Integer> entry: freq.entrySet()) {
    		if(entry.getValue() == 2) {
    			set.add(entry.getKey());
    		}
    	}
    	
    	return set;
    }
}
