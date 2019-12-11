/* Sorted.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/sorted

Write a method named sorted that accepts an array of doubles as a parameter 
and returns true if the list is in sorted order and false if not. 

For example, if an array named list stores {1.5, 4.3, 7.0, 19.5, 25.1, 46.2} 
respectively, the call of sorted(list2) should return true. 
You may assume the array has at least one element. 
A one-element array is considered to be sorted. Do not modify the array passed in.

 */

import acm.program.*;

public class Sorted extends ConsoleProgram {
    
    public void run() {
    	double[] list = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
    	println(sorted(list));
    }
    
    public boolean sorted(double[] list) {
    	if(list.length == 1) return true;
    	
    	for(int i = 0; i < list.length - 1; i++) {
    		if(list[i] > list[i+1]) {
    			return false;
    		}
    	}
    	
    	return true;
    }
    
}
