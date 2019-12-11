/*
Solution to: https://www.codestepbystep.com/problem/view/java/recursion/printStars

Write a recursive method named printStars that accepts an integer parameter n and prints n occurrences of the "*" character to the console. For example, the call of printStars(5); should print ***** . Do not use loops or auxiliary data structures; solve the problem recursively. 
You may assume that the value passed is non-negative.
 */

public class PrintStars {

	public static void main(String[] args) {
		printStars(5);
	}
	
	public static void printStars(int n) {
		if(n > 0) {
			System.out.print("*");
			printStars(n - 1);
		}
	}
}
