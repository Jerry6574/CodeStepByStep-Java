/*
Solution to: https://www.codestepbystep.com/problem/view/java/recursion/sumOfSquares

Write a recursive method named sumOfSquares that accepts an integer parameter n and returns the sum of squares from 1 to n. For example, the call of sumOfSquares(3) should return 12 + 22 + 32 = 14. If your method is passed 0, return 0. If passed a negative number, your method should throw an int as an exception.

Constraints: Your method must be recursive. Do not use loops or data structures.

 */

public class SumOfSquare {

	public static void main(String[] args) {
		System.out.println(sumOfSquares(3));
	}
	
	public static int sumOfSquares(int n) throws IllegalArgumentException{
		if(n < 0) {
			throw new IllegalArgumentException();
		} else if(n == 0) {
			return 0;
		} else {
			return n*n + sumOfSquares(n-1);
		}
	}
}
