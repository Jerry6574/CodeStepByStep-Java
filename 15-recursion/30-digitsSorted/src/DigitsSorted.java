/*
Solution to: https://www.codestepbystep.com/problem/view/java/recursion/digitsSorted

Write a recursive method named digitsSorted that takes an integer as a parameter and returns true if the digits of the integer are sorted and false otherwise. The digits must be sorted in non-decreasing order (i.e. increasing order with duplicate digits allowed) when read from left to right. An integer that consists of a single digit is sorted by definition. The method should be also able to handle negative numbers. Negative numbers are also considered sorted if their digits are in non-decreasing order.

The following table shows several calls to your method and their expected return values:

Call	                   Value Returned
digitsSorted(0)			   true
digitsSorted(2345)	       true
digitsSorted(-2345)	       true
digitsSorted(22334455)	   true
digitsSorted(-5)	       true
digitsSorted(4321)	       false
digitsSorted(24378)	       false
digitsSorted(21)	       false
digitsSorted(-33331)	   false

 */

public class DigitsSorted {

	public static void main(String[] args) {
		System.out.println(digitsSorted(2345));
		System.out.println(digitsSorted(-2345));
		System.out.println(digitsSorted(-2385));
	}
	
	public static boolean digitsSorted(int x) {
		if(x / 10 == 0) {
			return true;
			
		} else {
			int abs_x = Math.abs(x);

			if(abs_x / 10 % 10 > abs_x % 10) {
				return false;
			} else {
				return digitsSorted(abs_x / 10);
			}
		}
	}

}
