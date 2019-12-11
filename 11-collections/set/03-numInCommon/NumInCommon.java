/* NumInCommon.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/set/numInCommon

Write a method named numInCommon that accepts two Lists of integers as parameters 
and returns the count of how many unique integers occur in both lists. 

For example, if two lists named l1 and l2 contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] 
and [-5, 15, 2, -1, 7, 15, 36] respectively, your method should return 4 because the 
elements -1, 2, 7, and 15 occur in both lists. 

Use one or more Sets as storage to help you solve this problem. 
Do not modify the lists passed in.

 */
import java.util.*;

import acm.program.*;

public class NumInCommon extends ConsoleProgram {
    
    public void run() {
    	ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
    	ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(-5, 15, 2, -1, 7, 15, 36));
    	println(numInCommon(list1, list2));
    }
    
    public int numInCommon(List<Integer> list1, List<Integer> list2) {
    	Set<Integer> s = new HashSet<>();
    	
    	for(int n: list1) {
    		if(list2.contains(n)) {
    			s.add(n);
    		}
    		
    	}
    	
    	return s.size();
    }
}
