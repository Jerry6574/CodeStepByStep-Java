/* Contains.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/contains

Write a method named contains that accepts two arrays of integers a1 and a2 as 
parameters and that returns a boolean value indicating whether or not a2's 
sequence of elements appears in a1 (true for yes, false for no). 
The sequence of elements in a2 may appear anywhere in a1 but must appear 
consecutively and in the same order. For example, if variables called a1 and a2 store the following values:

int[] a1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
int[] a2 = {1, 2, 1};

Then the call of contains(a1, a2) should return true because a2's sequence of values 
{1, 2, 1} is contained in a1 starting at index 5. If a2 had stored the values {2, 1, 2}, 
the call of contains(a1, a2) would return false because a1 does not contain 
that sequence of values. Any two arrays with identical elements are considered 
to contain each other, so a call such as contains(a1, a1) should return true.

You may assume that both arrays passed to your method will have lengths of at least 1. 
You may not use any Strings to help you solve this problem, 
nor methods that produce Strings such as Arrays.toString.

 */
import acm.program.*;

public class Contains extends ConsoleProgram {
    
    public void run() {
    	int[] a1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
    	int[] a2 = {1, 2, 1};
    	
    	println(contains(a1, a2));
    }
    
    public boolean contains(int[] a1, int[] a2) {
    	int nEqualValues = 0;
    	
    	for(int i = 0; i < a1.length - a2.length + 1; i++) {
    		
    		for(int j = 0; j < a2.length; j++) {
    			if(a1[i + j] == a2[j]) {
    				nEqualValues++;
    			} else {
    				nEqualValues = 0;
    				break;
    			}
    		}
    		
    		if(nEqualValues == a2.length) {
    			return true;
    		}
    	}
    	
		return false;

    }
    
}
