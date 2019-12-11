/* FindKeithNumbers.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/findKeithNumbers

Write a method named findKeithNumbers that accepts minimum and maximum integers as 
parameters and prints all of the "Keith numbers in that range (inclusive) in the 
format shown below. See previous program isKeithNumber to learn the definition of a 
"Keith number." If the given range contains no Keith numbers, print no output. 
For example, the call of findKeithNumbers(47, 742); would print the following output:

47: [4, 7, 11, 18, 29, 47]
61: [6, 1, 7, 8, 15, 23, 38, 61]
75: [7, 5, 12, 17, 29, 46, 75]
197: [1, 9, 7, 17, 33, 57, 107, 197]
742: [7, 4, 2, 13, 19, 34, 66, 119, 219, 404, 742]

 */

import java.util.ArrayList;
import java.util.Collections;

import acm.program.*;

public class FindKeithNumbers extends ConsoleProgram {
    
    public void run() {
    	int min = 47;
    	int max = 742;
    	findKeithNumbers(min, max);
    }
    
    public void findKeithNumbers(int min, int max) {
    	for(int i = min; i <= max; i++) {
    		printKeithNumber(i);
    	}
    }
    
    public void printKeithNumber(int n) {
    	// single digit numbers are trival Keith numbers
    	if(n / 10 == 0) {
    		println(n + ": [" + n + "]");
    		return;
    	}
    	
    	int num = n;
    	ArrayList<Integer> nums = new ArrayList<>();
    	int nDigits = 0;
    	
    	// add each digit of n to arraylist nums
    	while(true) {
    		nums.add(num % 10);
    		num /= 10;
    		nDigits++;
    		
    		if(num == 0) {
    			break;
    		}
    	}
    	
    	// reverse nums for better aesthetics and easy to add subsequent sums
    	Collections.reverse(nums);
    	
    	for(int i = 0; i < nums.size(); i++) {
    		int sum = 0;
    		for(int j = 0; j < nDigits; j++) {
    			sum += nums.get(i+j);
    		}
    		
    		nums.add(sum);
    		
    		if(sum == n) {
    			println(n + ": " + nums.toString());
    		
    		// once sum > n, it's not possible for it to be a Keith number
    		} else if(sum > n) {
    			return;
    		}
    		
    	}
    	
    }
}
