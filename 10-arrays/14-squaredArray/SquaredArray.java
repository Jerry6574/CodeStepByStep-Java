/* SquaredArray.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/squaredArray

Write a variable declaration and for loop necessary to create and initialize an 
integer array named squares that contains the following values:

0 1 4 9 16 25 36 49 64 81 100

 */

import java.util.Arrays;

import acm.program.*;

public class SquaredArray extends ConsoleProgram {
    
    public void run() {
    	int[] squares = new int[11];
    	for(int i = 0; i < 11; i++) {
    		squares[i] = i*i;
    	}
    	println(Arrays.toString(squares));
    }
    
}
