/* IsKeithNumber.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/isKeithNumber

Write a method named isKeithNumber that accepts an integer and returns true if that number is a "Keith number". 
A "Keith number" is defined as any n-digit integer that appears in the sequence that starts off 
with the number's n digits and then continues such that each subsequent number is the sum of the preceding n. 
(This is not unlike the classic Fibonacci sequence.) 

All one-digit numbers are trivially Keith numbers. The number 7385 is also a Keith number, 
because the following sequence ends up back at 7385:

7, 3, 8, 5, 23, 39, 75, 142, 279, 535, 1031, 1987, 3832, 7385

The sequence starts out 7, 3, 8, 5, because those are the digits making up 7385. 
Each number after that is the sum of the four numbers that precede it (four, because 7385 has four digits). 
So the fifth number is the sum of 7+3+8+5, or 23. The sixth number is 3+8+5+23, or 39. 
And so on, until we eventually get back to 7385, which makes 7385 a Keith number.

You may use a single ArrayList or LinkedList as auxiliary storage. 
Your method should not loop infinitely; if you become sure that the number is not a Keith number, 
stop searching and immediately return false.

 */

import java.util.*;

import acm.program.*;

public class IsKeithNumber extends ConsoleProgram {
    
    public void run() {
    	println(isKeithNumber(7385));
    }
    
    public boolean isKeithNumber(int n) {
    	// single digit numbers are trival Keith numbers
    	if(n / 10 == 0) return true;
    	
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
    		
    		if(sum == n) {
    			return true;
    		
    		// once sum > n, it's not possible for it to be a Keith number
    		} else if(sum > n) {
    			break;
    		}
    		
    		nums.add(sum);
    	}
    	
    	return false;
    }
}
