/* GetPercentEven.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/getPercentEven

Write a method named getPercentEven that accepts an array of integers as a parameter 
and returns the percentage of the integers in the array that are even numbers. 

For example, if an array a stores {6, 4, 9, 11, 5}, 
then your method should return 40.0 representing 40% even numbers. 
If the array contains no even elements or is empty, return 0.0. Do not modify the array passed in.

 */
import acm.program.*;

public class GetPercentEven extends ConsoleProgram {
    
    public void run() {
    	int[] a = {6, 4, 9, 11, 5};
    	println(getPercentEven(a));
    }
    
    public double getPercentEven(int[] a) {
    	if(a.length == 0) return 0.0;
    	
    	double nEven = 0.0;
    	
    	for(int i = 0; i < a.length; i++) {
    		if(a[i] % 2 == 0) {
    			nEven++;
    		}
    	}
    	
    	double percentEven = nEven / a.length * 100;
    	return percentEven;
    }
    
}
