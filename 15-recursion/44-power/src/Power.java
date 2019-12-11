/* 
Solution to: https://www.codestepbystep.com/problem/view/java/recursion/power
Write a recursive method named power that accepts two integers representing a base and an exponent and returns the base raised to that exponent. For example, the call of power(3, 4) should return 34 or 81 . If the exponent passed is negative, throw an IllegalArgumentException.

Do not use loops or auxiliary data structures; solve the problem recursively. Also do not use the provided Java pow method in your solution.
 */

public class Power {

	public static void main(String[] args) {
		System.out.println(power(2, 3));
	}
	
	public static int power(int base, int exp) throws IllegalArgumentException{
		if(exp < 0) {
			throw new IllegalArgumentException();
		} else if(exp == 0) {
			return 1;
		} else {
			return base * power(base, exp - 1);
		}
	}

}
