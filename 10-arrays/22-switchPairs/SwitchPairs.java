/* SwitchPairs.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/switchPairs

Write a method named switchPairs that accepts an array of strings as a parameter 
and switches the order of pairs of values in the array. 

Your method should swap the order of the first two values, 
then switch the order of the next two, and so on. For example, if the array stores:

String[] a = {"a", "bb", "c", "ddd", "ee", "f", "g"};
switchPairs(a);
Your method should switch the first pair ("a", "bb"), 
the second pair ("c", "ddd") and the third pair ("ee", "f"), to yield this array:

{"bb", "a", "ddd", "c", "ee", "f", "g"}
If there are an odd number of values, the final element is not moved.

You may assume that the array is not null and that no element of the array is null.

 */


import java.util.Arrays;

import acm.program.*;

public class SwitchPairs extends ConsoleProgram {
    
    public void run() {
    	String[] array = {"a", "bb", "c", "ddd", "ee", "f", "g"};
    	switchPairs(array);
    	println(Arrays.toString(array));
    }
    
    public void switchPairs(String[] array) {
    	for(int i = 0; i < array.length - array.length % 2; i = i + 2) {
    		String temp = array[i];
    		array[i] = array[i+1];
    		array[i+1] = temp;
    	}
    }
}
