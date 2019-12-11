/* Cumulative.java
 * 
Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/cumulative

Write a method named cumulative that accepts as a parameter an ArrayList of integers, 
and modifies it so that each element contains the cumulative sum of the elements up through that index. 
For example, if the list passed contains {1, 1, 2, 3, 5}, your method should modify it to store {1, 2, 4, 7, 12}.

 */

import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class Cumulative extends ConsoleProgram {
    
    public void run() {
    	ArrayList<Integer> v = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 5));
    	cumulative(v);
    	println(v.toString());
    }
    
    public void cumulative(ArrayList<Integer> v) {
    	for(int i = 1; i < v.size(); i++) {
    		v.set(i, v.get(i-1) + v.get(i));
    	}
    }
}
