/*
Solution to: https://www.codestepbystep.com/problem/view/java/recursion/printBinary

Write a recursive method named printBinary that accepts an integer and prints that number's representation in binary (base 2). For example, the call of printBinary(43); should print 101011 .

If the integer is negative, print the binary representation preceded by a minus sign. For example, the call of printBinary(-6); should print -110 .

 */

public class PrintBinary {

	public static void main(String[] args) {
		printBinary(43);
	}
	
	public static void printBinary(int n) {	
		if(n > 1) {
			printBinary(n / 2);
			System.out.print(n % 2);
			return;
		} else if(n < 0){
			System.out.print("-");
			printBinary(Math.abs(n) / 2);
			System.out.print(Math.abs(n) % 2);
		} else {
			System.out.print(n);
		}
	}

}
