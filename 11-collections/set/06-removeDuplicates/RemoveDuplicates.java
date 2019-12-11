/* RemoveDuplicates.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/set/removeDuplicates

Write a method named removeDuplicates that accepts as a parameter an ArrayList of integers, 
and modifies it by removing any duplicates. Note that the elements of the list are not in any particular order, 
so the duplicates might not occur consecutively. You should retain the original relative order of the elements. 
Use a TreeSet as auxiliary storage to help you solve this problem. 

For example, if a list named v stores {4, 0, 2, 9, 4, 7, 2, 0, 0, 9, 6, 6}, 
the call of removeDuplicates(v); should modify it to store {4, 0, 2, 9, 7, 6}.

 */

import java.util.*;

import acm.program.*;

public class RemoveDuplicates extends ConsoleProgram {
    
    public void run() {
    	ArrayList<Integer> v = new ArrayList<>(Arrays.asList(4, 0, 2, 9, 4, 7, 2, 0, 0, 9, 6, 6));
    	removeDuplicates(v);
    	println(v.toString());
    }
    
    public void removeDuplicates(ArrayList<Integer> v) {
    	TreeSet<Integer> set = new TreeSet<>();
    	
    	for(int i = 0; i < v.size(); i++) {
    		if(set.contains(v.get(i))) {
    			v.remove(i);
    			i--;
    		} else {
    			set.add(v.get(i));
    		}
    		
    	}

    }
}
