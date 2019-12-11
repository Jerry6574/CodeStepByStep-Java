/* MyProgram.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/removeRange

Write a method named removeRange that accepts an ArrayList of integers and two integer 
values min and max as parameters and removes all elements values in the range min through max (inclusive). 

For example, if an ArrayList named list stores [7, 9, 4, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7], 
the call of removeRange(list, 5, 7); should change the list to store [9, 4, 2, 3, 1, 8].

 */

import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class RemoveRange extends ConsoleProgram {
    
    public void run() {
    	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(7, 9, 4, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7));
    	int min = 5;
    	int max = 7;
    	removeRange(list, min, max);
    	println(list.toString());
    }
    
    public void removeRange(ArrayList<Integer> list, int min, int max) {
    	for(int i = 0; i < list.size(); i++) {
    		if(list.get(i) >= min && list.get(i) <= max) {
    			list.remove(i);
    			i--;
    		}
    	}
    }
    
}
