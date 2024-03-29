/* IndexOf.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/indexOf

Write a method named indexOf that returns the index of a particular value in an array of integers. 
The method should return the index of the first occurrence of the target value in the array. 
If the value is not in the array, it should return -1. For example, if an array called list stores the following values:

int[] list = {42, 7, -9, 14, 8, 39, 42, 8, 19, 0};
Then the call indexOf(list, 8) should return 4 because the index of the first 
occurrence of value 8 in the array is at index 4. The call indexOf(list, 2) 
should return -1 because value 2 is not in the array.

 */
import acm.program.*;

public class IndexOf extends ConsoleProgram {
    
    public void run() {
    	int[] list = {42, 7, -9, 14, 8, 39, 42, 8, 19, 0};
    	int target = 8;
    	println(indexOf(list, target));
    }
    
    public int indexOf(int[] list, int target) {
    	int index = -1;
    	
    	for(int i = 0; i < list.length; i++) {
    		if(list[i] == target) {
    			return i;
    		}
    	}
    	
    	return index;
    }
}
