/* CountDuplicates.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/countDuplicates

Write a method named countDuplicates that accepts an array of integers as a 
parameter and that returns the number of duplicate values in the array. 
A duplicate value is a value that also occurs earlier in the array. 

For example, if an array named a contains [1, 4, 2, 4, 7, 1, 1, 9, 2, 3, 4, 1], 
then the call of countDuplicates(a) should return 6 because there are three duplicates of the value 1, 
one duplicate of the value 2, and two duplicates of the value 4.

Constraints: The array could be empty or could contain only a single element; 
in such cases, your method should return 0. Do not modify the contents of the array.

 */


import acm.program.*;


public class CountDuplicates extends ConsoleProgram {
    
    public void run() {
    	int[] list = {1, 4, 2, 4, 7, 1, 1, 9, 2, 3, 4, 1};
    	println(countDuplicates(list));
    }
    
    public int countDuplicates(int[] list) {
    	int totalDuplicates = 0;
    	
    	for(int i = 0; i < list.length; i++) {

    		for (int j = i + 1; j < list.length; j++) {
    			// count 1 duplicate at a time to avoid repeated counting
				if(list[i] == list[j]) {
					totalDuplicates++;
					break;
				}

			}
    	}
    	
    	return totalDuplicates;
    }
    
}
