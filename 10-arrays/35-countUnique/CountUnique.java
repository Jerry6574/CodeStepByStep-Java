/* CountUnique.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/countUnique

Write a method named countUnique that accepts an array of integers as a 
parameter and returns a count of the number of unique values that occur in the array. 
If the array contains multiple occurrences of the same element value, 
only one of those occurrences should count toward your total. 

For example, if an array named numbers stores {7, 7, 2, 2, 1, 2, 2, 7}, 
the call of countUnique(numbers) should return 3 because there are 3 unique values: 7, 2, and 1.

Constraints: In solving this problem, do not create any other data structures 
such as arrays, strings, etc., though you may create as many simple variables 
(e.g. int, double) as you like. Do not modify the array passed to your method 
as the parameter, such as by sorting or rearranging its element values.

 */
import acm.program.*;

public class CountUnique extends ConsoleProgram {
    
    public void run() {
        while (true) {
            println("You said: " + readLine());
        }
    }
    
    public int countUnique(int[] array) {
    	int nUniques = 0;
    	for (int i = 0; i < array.length; i++) {
    		int j = 0;
    		
			for (j = 0; j < i; j++) {
				if(array[i] == array[j]) {
					break;
				}
			}
			
			// if i != j, duplicates exist at array[i] and array[j]
			if(i == j) {
				nUniques++;
			}
		}
    	
    	return nUniques;
    }
}
