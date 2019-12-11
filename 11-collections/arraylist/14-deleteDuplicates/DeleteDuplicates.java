/* DeleteDuplicates.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/deleteDuplicates 

Write a method named deleteDuplicates that accepts as a parameter a sorted ArrayList 
of Strings and that removes any duplicate values from the list. 

For example, suppose that an ArrayList named list contains the values 
{"be", "be", "is", "not", "or", "question", "that", "the", "to", "to"} 

After calling deleteDuplicates(list); the list should store the following values: 
{"be", "is", "not", "or", "question", "that", "the", "to"} 

You should assume that the values in the list are sorted, 
and that therefore all of the duplicates will be grouped together.

 */
import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class DeleteDuplicates extends ConsoleProgram {
    
    public void run() {
    	ArrayList<String> list = new ArrayList<String>(Arrays.asList("be", "be", "is", "not", "or", "question", "that", "the", "to", "to"));
    	deleteDuplicates(list);
    	println(list.toString());
    }
    
    public void deleteDuplicates(ArrayList<String> list) {
    	for(int i = 0; i < list.size()-1; i++) {
    		if(list.get(i) == list.get(i+1)) {
    			list.remove(i);
    			i--;
    		}
    	}
    }
}
