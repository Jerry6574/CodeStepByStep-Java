/* Mean.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/mean

Write a method named mean that accepts as a parameter an ArrayList of real numbers, 
and returns the arithmetic mean (average) of the integers in the list as a real number. 

For example, if the list passed contains {2.0, 4.5, 6.5, 1.0}, your method should return 3.5. 
If the list is empty, return 0.0. Do not modify the list that is passed in.

 */
import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class Mean extends ConsoleProgram {
    
    public void run() {
    	ArrayList<Double> data = new ArrayList<Double>(Arrays.asList(2.0, 4.5, 6.5, 1.0));
    	println(mean(data));
    }
    
    public double mean(ArrayList<Double> data) {
    	if(data.size() == 0) {
    		return 0.0;
    	}
    	
    	double sum = 0.0;
    	
    	for(int i = 0; i < data.size(); i++) {
    		sum += data.get(i);
    	}
    	
    	return sum / data.size();
    }
}
