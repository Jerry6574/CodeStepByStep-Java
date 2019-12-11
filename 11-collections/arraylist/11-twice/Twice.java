/* Twice.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/twice

Write a method named twice that accepts an ArrayList of strings as a 
parameter and that appends a second occurrence of the entire list to itself. 

For example, if an ArrayList named list stores the values {"how", "are", "you?"}, the call of twice(list); 
should modify the list to store {"how", "are", "you?", "how", "are", "you?"}.

 */

import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class Twice extends ConsoleProgram {
    
    public void run() {
    	ArrayList<String> list = new ArrayList<String>(Arrays.asList("how", "are", "you?"));
    	twice(list);
    	println(list.toString());
    }
    
    public void twice(ArrayList<String> list) {
    	int initSize = list.size();
    	
    	for(int i = 0; i < initSize; i++) {
    		list.add(list.get(i));
    	}
    }
}
