/*
Solution to: https://www.codestepbystep.com/problem/view/java/recursion/evenDigits

Write a recursive method named evenDigits that accepts an integer parameter n and returns a new integer containing only the even digits from n, in the same order. If n does not contain any even digits, return 0.

For example, the call of evenDigits(8342116) should return 8426 and the call of evenDigits(35179) should return 0.

 */

public class EvenDigits {

	public static void main(String[] args) {
		System.out.println(evenDigits(8342116));
	}
	
	public static int evenDigits(int n) {
		if(n == 0) {
			return 0;
		} else {
			int last = n % 10;
			
			if(last % 2 == 0) {
				return 10 * evenDigits(n / 10) + last;
			} else {
				return evenDigits(n / 10);
			}
		}
	}
}
