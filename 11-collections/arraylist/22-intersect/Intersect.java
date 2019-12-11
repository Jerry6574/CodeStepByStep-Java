/* Intersect.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/intersect

Write a method named intersect that accepts references to two sorted ArrayList of integers 
as parameters and returns a new list that contains only the elements that are found in both lists. 
For example, if list list1 and list2 store:

{1, 4, 8, 9, 11, 15, 17, 28, 41, 59}
{4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81}

Then the call of intersect(list1, list2) returns the list: {4, 11, 17, 28, 59} 
Note that you can assume that both lists passed store their elements in sorted order. 
Do not modify the two lists passed in as parameters.

 */
import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class Intersect extends ConsoleProgram {
    
    public void run() {
    	ArrayList<Integer> v1 = new ArrayList<Integer>(Arrays.asList(1, 4, 8, 9, 11, 15, 17, 28, 41, 59));
    	ArrayList<Integer> v2 = new ArrayList<Integer>(Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));
    	
    	println(intersect(v1, v2).toString());
    }
    
    public ArrayList<Integer> intersect(ArrayList<Integer> v1, ArrayList<Integer> v2) {
    	ArrayList<Integer> intersectNums = new ArrayList<>();
    	
    	for(int i = 0; i < v1.size(); i++) {
    		if(v2.contains(v1.get(i))) {
    			intersectNums.add(v1.get(i));
    		}
    	}
    	
    	return intersectNums;
    }
}
