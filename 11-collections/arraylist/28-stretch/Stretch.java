/* Stretch.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/stretch

Write a method named stretch that accepts as a parameter an ArrayList of integers, 
and modifies it to be twice as large, replacing every integer with a pair of integers, 
each half the original. If a number in the original list is odd, 
then the first number in the new pair should be one higher than the second so that the sum equals the original number. 

For example, if a variable named v refers to a list storing the values {18, 7, 4, 24, 11}, the call of stretch(v); 
should change v to contain {9, 9, 4, 3, 2, 2, 12, 12, 6, 5}. (The number 18 is stretched into the pair 9, 9, 
the number 7 is stretched into 4, 3, the number 4 is stretched into 2, 2, 
the number 24 is stretched into 12, 12, and 11 is stretched into 6, 5.)

 */
import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class Stretch extends ConsoleProgram {
    
    public void run() {
    	ArrayList<Integer> v = new ArrayList<Integer>(Arrays.asList(18, 7, 4, 24, 11));
    	stretch(v);
    	println(v.toString());
    }
    
    public void stretch(ArrayList<Integer> v) {
    	for(int i = 0; i < v.size(); i += 2) {
    		int right = v.get(i) / 2;
    		int left = v.get(i) - right;
    		
    		v.set(i, left);
    		v.add(i+1, right);
    	}
    }
}
