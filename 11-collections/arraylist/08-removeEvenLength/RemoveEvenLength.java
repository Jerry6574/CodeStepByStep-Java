/* RemoveEvenLength.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/removeEvenLength

Write a method named removeEvenLength that accepts an ArrayList of strings as a 
parameter and that removes all of the strings of even length from the list. 

For example, if an ArrayList variable named list contains the values 
["hi", "there", "how", "is", "it", "going", "good", "sirs"], 
the call of removeEvenLength(list); would change it to store ["there", "how", "going"].

 */

import java.util.ArrayList;
import java.util.*;

import acm.program.*;

public class RemoveEvenLength extends ConsoleProgram {
    
    public void run() {
    	ArrayList<String> list = new ArrayList<String>(Arrays.asList("hi", "there", "how", "is", "it", "going", "good", "sirs"));
    	removeEvenLength(list);
    	println(list.toString());
    }
    
    public void removeEvenLength(ArrayList<String> list) {
    	int i = 0;
    	
    	while(i < list.size()) {
    		if(list.get(i).length() % 2 == 0) {
    			list.remove(i);
    			
    			// removing an element shifts arraylist to the left, i-- to offset
    			i--;
    		}
    		i++;
    	}
    }
    
}
