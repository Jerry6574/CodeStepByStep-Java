/*
Solution to: https://www.codestepbystep.com/problem/view/java/recursion/zigzag

Write a recursive method zigzag that accepts an integer parameter n and that prints out n characters as follows. The middle character of the output should always be an asterisk ("*"). If you are asked to write out an even number of characters, then there will be two asterisks in the middle ("**"). Before the asterisk(s) you should write out less-than characters ("<"). After the asterisk(s) you should write out greater-than characters (">").

 */

public class ZigZag {

	public static void main(String[] args) {
		zigzag(8);
	}
	
	public static void zigzag(int n) throws IllegalArgumentException{
		if(n < 1) {
			throw new IllegalArgumentException();
		} else if(n == 1) {
			System.out.print("*");
		} else if(n == 2) {
			System.out.print("**");
		} else {
			System.out.print("<");
			zigzag(n-2);
			System.out.print(">");
		}
	}
}
