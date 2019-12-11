/* Mirror.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/mirror

Write a method named mirror that accepts an ArrayList of strings as a parameter 
and produces a mirrored copy of the list as output, with the original values 
followed by those same values in the opposite order. 

For example, if an ArrayList variable named list contains the values ["a", "b", "c"], 
after a call of mirror(list); it should contain ["a", "b", "c", "c", "b", "a"].

You may assume that the list is not null and that no element of the array is null.

 */
import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class Mirror extends ConsoleProgram {
    
    public void run() {
    	ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c"));
    	mirror(list);
    	println(list.toString());
    }
    
    public void mirror(ArrayList<String> list) {
    	int initSize = list.size();
    	
    	for(int i = initSize - 1; i >= 0; i--) {
    		list.add(list.get(i));
    	}
    }
}
