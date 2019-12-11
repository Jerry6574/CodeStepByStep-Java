/*
Solution to: https://www.codestepbystep.com/problem/view/java/recursion/sequence

Write a recursive method named sequence that accepts an integer k as its parameter and prints out the numbers 1 through k inclusive in a particular pattern separated by plus signs and wrapped in parentheses. The order of the numbers should begin with all of the evens in downward order, followed by all of the odds upward from 1. Each time a number is added to the pattern, a new set of parentheses and a plus sign are added to the pattern. If the value for k is 0 or negative, throw an IllegalArgumentException.

Call	Output
sequence(1);	1
sequence(2);	(2 + 1)
sequence(3);	((2 + 1) + 3)
sequence(4);	(4 + ((2 + 1) + 3))
sequence(5);	((4 + ((2 + 1) + 3)) + 5)
sequence(6);	(6 + ((4 + ((2 + 1) + 3)) + 5))
sequence(7);	((6 + ((4 + ((2 + 1) + 3)) + 5)) + 7)
sequence(8);	(8 + ((6 + ((4 + ((2 + 1) + 3)) + 5)) + 7))
sequence(9);	((8 + ((6 + ((4 + ((2 + 1) + 3)) + 5)) + 7)) + 9)
sequence(10);	(10 + ((8 + ((6 + ((4 + ((2 + 1) + 3)) + 5)) + 7)) + 9))


*/

public class Sequence {

	public static void main(String[] args) {
		sequence(10);
	}
	
	public static void sequence(int k) throws IllegalArgumentException{
		if(k < 1) {
			throw new IllegalArgumentException();
		} else if(k == 1) {
			System.out.print(k);
		} else {
			if(k % 2 == 0) {
				System.out.print("(" + k + " + ");
				sequence(k - 1);
				System.out.print(")");
			} else {
				System.out.print("(");
				sequence(k - 1);
				System.out.print(" + " + k + ")");
			}
		}
	}
}
