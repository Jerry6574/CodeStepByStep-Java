/*

Solution to: https://www.codestepbystep.com/problem/view/java/recursion/starString

Write a recursive method named starString that accepts an integer parameter n and returns a string of stars (asterisks) 2n long (i.e., 2 to the nth power). For example:

 */

public class StarString {

	public static void main(String[] args) {
		System.out.println(starString(2));
	}
	
	public static String starString(int n) {
		String stars = "";
		if(n < 0) {
			throw new IllegalArgumentException("k must > 0");
		} else if(n == 0) {
			return "*";
		} else {
			stars = repeatString("*", (int) Math.pow(2, n-1));
			return stars + starString(n - 1);
		}
	}
	
	public static String repeatString(String s, int n) throws IllegalArgumentException{
		if(n < 0) {
			throw new IllegalArgumentException("n must be > 1");
		} else if(n == 0) {
			return "";
		} else {
			return s + repeatString(s, n-1);
		}
	}

}
