/* HasMirrorTwice.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/hasMirrorTwice

Write a method named hasMirrorTwice that accepts two arrays of integers a1 and a2 as 
parameters and returns true if a1 contains all the elements of a2 in reverse order 
at least twice (and false otherwise). For example, if a2 stores the elements {1, 2, 3} 
and a1 stores the elements {6, 3, 2, 1, 4, 1, 3, 2, 1, 5}, your method would return true.

Assume that both arrays passed to your method will have a length of at least 1. 
This means that the shortest possible mirror will be of length 1, 
representing a single element (which is its own mirror). 

A sequence that is a palindrome (the same forwards as backwards) is 
considered its own mirror and should be included in your computations. 

For example, if a1 is {6, 1, 2, 1, 4, 1, 2, 1, 5} and a2 is {1, 2, 1}, 
your method should return true. The two occurrences of the mirror might overlap, 
as shown in the fourth sample call below.

The following table shows some calls to your method and their expected results:

Arrays														Returned Value
int[] a1 = {6, 1, 2, 1, 3, 1, 3, 2, 1, 5};
int[] a2 = {1, 2};											hasMirrorTwice(a1, a2) returns true

int[] a3 = {5, 8, 4, 18, 5, 42, 4, 8, 5, 5};
int[] a4 = {4, 8, 5};										hasMirrorTwice(a3, a4) returns false

int[] a5 = {6, 3, 42, 18, 12, 5, 3, 42, 3, 42};
int[] a6 = {42, 3};											hasMirrorTwice(a5, a6) returns true

int[] a7 = {6, 1, 2, 4, 2, 1, 2, 4, 2, 1, 5};
int[] a8 = {1, 2, 4, 2, 1};									hasMirrorTwice(a7, a8) returns true

int[] a9 = {0, 0};
int[] aa = {0};												hasMirrorTwice(a9, aa) returns true

int[] ab = {8, 9, 2, 1};
int[] ac = {5, 7, 1, 2, 9, 8};								hasMirrorTwice(ab, ac) returns false


Do not modify the contents of the arrays passed to your method as parameters.
 */


import acm.program.*;

public class HasMirrorTwice extends ConsoleProgram {
    
    public void run() {
    	int[] a1 = {6, 1, 2, 1, 3, 1, 3, 2, 1, 5};
    	int[] a2 = {1, 2};	
    	
    	println(hasMirrorTwice(a1, a2));
    }
    
    public boolean hasMirrorTwice(int[] a1, int[] a2) {
    	int nMirrors = 0;
    	boolean hasMirror = false;
    	
    	for(int i = 0; i < a1.length - a2.length + 1; i++) {
    		for (int j = 0; j < a2.length; j++) {
    			// iterate a1 backwards in chunks of a2.length
    			// iterate 12 forward
    			// 1 inequality means entire a2.length chunk is not a mirro
				if(a1[i + a2.length - j - 1] != a2[j]) {
					hasMirror = false;
					break;
				}
				hasMirror = true;
			}
    		if(hasMirror) {
    			nMirrors++;
    		}
    	}
    	
    	if(nMirrors >= 2) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
