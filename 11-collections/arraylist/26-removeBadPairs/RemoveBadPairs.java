/* RemoveBadPairs.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/removeBadPairs

Write a method named removeBadPairs that accepts as a parameter an ArrayList of integers, 
and removes any adjacent pair of integers in the list if the left element of the pair is 
larger than the right element of the pair. Every pair's left element is an even-numbered 
index in the list, and every pair's right element is an odd index in the list. 
For example, suppose a variable named vec stores the following element values:

{3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1}

We can think of this list as a sequence of pairs:
{3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1}

The pairs 9-2, 8-5, 6-3, and 3-1 are "bad" because the left element is larger than the right one, 
so these pairs should be removed. So the call of removeBadPairs(vec); would change the list to store:
{3, 7, 5, 5, 4, 7}

If the list has an odd length, the last element is not part of a pair and is also considered "bad;" 
it should therefore be removed by your method.

If an empty list is passed in, the list should still be empty at the end of the call.

Constraints: Do not use any other arrays, lists, or other data structures to help solve this problem, 
though you can create as many simple variables as you like.

 */

import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class RemoveBadPairs extends ConsoleProgram {
    
    public void run() {
    	ArrayList<Integer> v = new ArrayList<Integer>(Arrays.asList(3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1));
    	removeBadPairs(v);
    	println(v.toString());
    }
    
    public void removeBadPairs(ArrayList<Integer> v) {
    	if(v.size() == 0) {
    		return;
    	}
    	int remainder = v.size() % 2; 
    	
    	for(int i = 0; i < v.size() - remainder; i += 2) {
    		if(v.get(i) > v.get(i+1)) {
    			v.remove(i);
    			v.remove(i);
    			i -= 2;
    		}
    	}
    	
    	
    	if(remainder == 1) {
    		v.remove(v.size() - 1);
    	}
    }
}
