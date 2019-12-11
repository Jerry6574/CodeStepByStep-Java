/* SecondIndexOf.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/secondIndexOf

Write a method named secondIndexOf that returns the index of the second occurrence 
of a particular value in an array of integers. If the value does not appear in the 
array at least twice, you should return -1. For example, if an array called list stores the following values:

     // index  0  1   2   3  4   5   6  7   8  9  10
int[] list = {42, 7, -9, 14, 8, 39, 42, 8, 19, 0, 42};

Then the call secondIndexOf(list, 42) should return 6 because the index of the 
second occurrence of value 42 in the array is at index 6. 
The call secondIndexOf(list, 14) should return -1 because value 14 does not occur at least twice in the array.

 */

import acm.program.*;

public class SecondIndexOf extends ConsoleProgram {
    
    public void run() {
        while (true) {
            println("You said: " + readLine());
        }
    }
    
    public int secondIndexOf(int[] list, int target) {
    	int index = -1;
    	int occurences = 0;
    	
    	for(int i = 0; i < list.length; i++) {
    		if(list[i] == target) {
    			occurences++;
    		}
    		if(occurences == 2) {
    			return i;
    		}
    	}
    	
    	return index;
    }
}
