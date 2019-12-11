/* Collapse.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/collapse

Write a method named collapse that accepts an array of integers as a parameter 
and returns a new array where each pair of integers from the original array 
has been replaced by the sum of that pair. 

For example, if an array called a stores {7, 2, 8, 9, 4, 13, 7, 1, 9, 10}, 
then the call of collapse(a) should return a new array containing {9, 17, 17, 8, 19}. 
The first pair from the original list is collapsed into 9 (7 + 2), 
the second pair is collapsed into 17 (8 + 9), and so on.

If the list stores an odd number of elements, the final element is not collapsed. 
For example, if the array had been {1, 2, 3, 4, 5}, then the call would return {3, 7, 5}. 
Your method should not change the array that is passed as a parameter.

 */
import acm.program.*;

public class Collapse extends ConsoleProgram {
    
    public void run() {
        while (true) {
            println("You said: " + readLine());
        }
    }
    
    public int[] collapse(int[] list) {
    	int[] collapsedArray = new int[list.length % 2 + list.length / 2];
    	int i = 0;
    	
    	for (i = 0; i < list.length / 2; i++) {
			collapsedArray[i] = list[2*i] + list[2*i+1];
		} 
    	
    	if(list.length % 2 == 1) {
    		collapsedArray[i] = list[2*i];
    	}
    	
    	return collapsedArray; 
    }
}
