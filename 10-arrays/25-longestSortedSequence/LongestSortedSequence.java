/* LongestSortedSequence.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/longestSortedSequence

Write a method named longestSortedSequence that accepts an array of integers as 
a parameter and that returns the length of the longest sorted (nondecreasing) 
sequence of integers in the array. For example, if a variable named array stores the following values:

int[] array = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
then the call of longestSortedSequence(array) should return 4 
because the longest sorted sequence in the array has four 
values in it (the sequence -3, 0, 14, 207). Notice that sorted means nondecreasing, 
which means that the sequence could contain duplicates. 

For example, if the array stores the following values:
int[] array2 = {17, 42, 3, 5, 5, 5, 8, 2, 4, 6, 1, 19}

Then the method would return 5 for the length of the longest sequence 
(the sequence 3, 5, 5, 5, 8). Your method should return 0 if passed an empty array. 
Your method should return 1 if passed an array that is entirely in decreasing order or contains only one element.

Constraints: You may not use any auxiliary data structures (arrays, lists, strings, etc.) to solve this problem. 
Your method should not modify the array that is passed in.

 */

import acm.program.*;

public class LongestSortedSequence extends ConsoleProgram {
    
    public void run() {
    	int[] array = {1, 2, 3};
    	println(longestSortedSequence(array));
    }
    
    public int longestSortedSequence(int[] array) {
    	if(array.length <= 1) {
    		return array.length;
    	}
    	
    	int maxSortedLength = 1;
    	int currentSortedLength = 1;
    	
    	for(int i = 0; i < array.length - 1; i++) {
    		
    		if(array[i+1] >= array[i]) {
    			currentSortedLength++;
    		} else {
    			currentSortedLength = 1;
    		}
    		
			if(currentSortedLength > maxSortedLength) {
				maxSortedLength = currentSortedLength;
			}
    	}
    	
    	return maxSortedLength;
    }
}
