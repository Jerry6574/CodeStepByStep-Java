/*

Solution to: https://www.codestepbystep.com/problem/view/java/recursion/digitSum

Write a recursive method named digitSum that accepts an integer as a parameter and returns the sum of its digits. For example, calling digitSum(1729) should return 1 + 7 + 2 + 9, which is 19. If the number is negative, return the negation of the value. For example, calling digitSum(-1729) should return -19.

Constraints: Do not declare any global variables. Do not use any loops; you must use recursion. Do not use any auxiliary data structures like ArrayList, TreeMap, TreeSet, array, etc. Also do not solve this problem using a string. You can declare as many primitive variables like ints as you like. You are allowed to define other "helper" methods if you like; they are subject to these same constraints.

 */

public class DigitSum {

	public static void main(String[] args) {
		System.out.println(digitSum(-1729));
		System.out.println(digitSum(1729));
	}
	
	public static int digitSum(int n) {
		if(n / 10 == 0) {
			return n;
		} else {
			int digit = n % 10;
			return digit + digitSum(n / 10);
		}
	}
}
