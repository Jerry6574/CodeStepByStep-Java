/* Repeat.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/repeat

Write a method named repeat that accepts an ArrayList of Strings 
and an integer k as parameters and that replaces each element with k copies of that element. 

For example, if the list stores the values ["how", "are", "you?"] 
before the method is called and k is 4, it should store the values 
["how", "how", "how", "how", "are", "are", "are", "are", "you?", "you?", "you?", 
"you?"] after the method finishes executing. 

If k is 0 or negative, the list should be empty after the call.

 */

import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class Repeat extends ConsoleProgram {
    
    public void run() {
    	ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c"));
    	repeat(list, 2);
    	println(list.toString());
    }
    
    public void repeat(ArrayList<String> list, int k) {
    	int initSize = list.size();
    	
    	for(int i = 0; i < initSize; i++) {
    		for(int j = 0; j < k; j++) {
    			list.add(list.get(i));
    		}
    	}
    	
    	for(int i = 0; i < initSize; i++) {
    		list.remove(0);
    	}
    	
    }
}
