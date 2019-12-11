/* MatrixSum.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/2d/matrixSum

Write a method named matrixSum that accepts as parameters two 2D arrays of integers, 
treats the arrays as 2D matrices and adds them, returning the result. 
The sum of two matrices A and B is a matrix C where for every row i and column j, Cij = Aij + Bij. 

For example, if A is {{1, 2, 3}, {4, 4, 4}} and B is {{5, 5, 6}, {0, -1, 2}}, 
the call of matrixSum(a, b) should return {{6, 7, 9}, {4, 3, 6}}. 
You may assume that the arrays passed as parameters have the same dimensions.

 */
import java.util.Arrays;

import acm.program.*;

public class MatrixSum extends ConsoleProgram {
    
    public void run() {
    	int[][] a = {{1, 2, 3}, {4, 4, 4}};
    	int[][] b = {{5, 5, 6}, {0, -1, 2}};
    	
    	int[][] sum = matrixSum(a, b);
    	for(int i = 0; i < sum.length; i++) {
    		println(Arrays.toString(sum[i]));
    	}
    }
    
    public int[][] matrixSum(int[][] a, int[][] b) {
    	if(a.length == 0) {
    		return new int[0][0];
    	}
    	
    	int[][] sum = new int[a.length][a[0].length];
    	
    	for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[0].length; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
    	
    	return sum;
    }
    
}
