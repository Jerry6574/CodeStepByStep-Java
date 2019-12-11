/* SwitchPairs.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/switchPairs

Write a method named switchPairs that accepts an ArrayList of strings as a parameter 
and switches the order of pairs of values in the array. 
Your method should swap the order of the first two values, 
then switch the order of the next two, and so on. 

For example, if the array stores {"a", "bb", "c", "ddd", "ee", "f", "g"}, 
then the call of switchPairs(a); should switch the first pair ("a", "bb"), 
the second pair ("c", "ddd") and the third pair ("ee", "f"), to yield this list:

{"bb", "a", "ddd", "c", "ee", "f", "g"}

If there are an odd number of values, the final element is not moved. 
You may assume that the list is not null and that no element of the array is null.

 */

import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class SwitchPairs extends ConsoleProgram {
    
    public void run() {
    	ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "bb", "c", "ddd", "ee", "f", "g"));
    	switchPairs(list);
    	println(list.toString());
    }
    
    public void switchPairs(ArrayList<String> list) {
    	for(int i = 0; i < list.size() - list.size() % 2; i += 2) {
    		String temp = list.get(i);
    		list.set(i, list.get(i+1));
    		list.set(i+1, temp);
    	}
    }
    
}
