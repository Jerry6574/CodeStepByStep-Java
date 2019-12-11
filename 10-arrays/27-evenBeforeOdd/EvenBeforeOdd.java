/* EvenBeforeOdd.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/evenBeforeOdd

Write a method named evenBeforeOdd that accepts an array of integers as 
a parameter and rearranges its elements so that all even values appear before all odds. 

For example, if the following array is passed to your method:
int[] numbers = {5, 2, 4, 9, 3, 6, 2, 1, 11, 1, 10, 4, 7, 3};

Then after the method has been called, one acceptable ordering of the elements would be:
                {4, 2, 4, 10, 2, 6, 3, 1, 11, 1, 9, 5, 7, 3}
                
The exact order of the elements does not matter, so long as all even values appear before all odd values. 
For example, the following would also be an acceptable ordering:
                {2, 2, 4, 4, 6, 10, 1, 1, 3, 3, 5, 7, 9, 11}
                
Do not make any assumptions about the length of the array or the range of values it might contain. 
For example, the array might contain no even elements or no odd elements.

You should not use any temporary arrays to help you solve this problem. 
(But you may declare as many simple variables as you like, such as ints.) 
You may not use any other data structures such as Strings or ArrayLists. 
You should not use Arrays.sort in your solution.

 */
import java.util.Arrays;

import acm.program.*;

public class EvenBeforeOdd extends ConsoleProgram {
    
    public void run() {
    	int[] array = {2, 5, 3, 4, 9, 2};
    	evenBeforeOdd(array);
    }
    
    public void evenBeforeOdd(int[] array) {
    	for(int i = 0; i < array.length; i++) {
    		for (int j = i + 1; j < array.length; j++) {
    			// odd number on the left of even number, swap their position
				if(array[i] % 2 != 0 && array[j] % 2 == 0) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
					// after swap break and advance to the next i
					break;
				}
			}
    	}
    	
    	println(Arrays.toString(array));
    }
    
}
