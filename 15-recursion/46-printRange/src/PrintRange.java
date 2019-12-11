/*
Solution to: https://www.codestepbystep.com/problem/view/java/recursion/printRange

Write a recursive method named printRange that accepts integer parameters x and y and prints the sequential integers between x and y inclusive in a particular format. The first half should be printed with the greater-than character (">") separating consecutive values. The second half should be printed with the less-than character ("<") separating consecutive values. When there are two values in the middle of the range, those two values should be separated by a pair of dashes ("--"), as shown in the second example output below. The following table shows several calls and their expected output:

Call	            Output
printRange(1, 9);	1 > 2 > 3 > 4 > 5 < 6 < 7 < 8 < 9
printRange(1, 10);	1 > 2 > 3 > 4 > 5 -- 6 < 7 < 8 < 9 < 10
printRange(23, 29);	23 > 24 > 25 > 26 < 27 < 28 < 29
printRange(13, 14);	13 -- 14
printRange(-8, -8);	-8
Notice that in the first output, 5 is in the middle with the numbers before it separated by greater-than and the numbers after it separated by less-than. In the second output, 26 is in the middle with numbers before it separated by greater-than and numbers after it separated by less-than. The last output has no separators because that range includes one number.

Your method should throw an IllegalArgumentException if x is greater than y.

 */

public class PrintRange {

	public static void main(String[] args) {
		printRange(1, 9);
	}
	
	public static void printRange(int x, int y) throws IllegalArgumentException{
		if(x > y) {
			throw new IllegalArgumentException();
		} else if(x == y) {
			System.out.print(x);
		} else if(x + 1 == y) {
			System.out.print(x + " -- " + y);
		} else {
			System.out.print(x + " > ");
			printRange(x+1, y-1);
			System.out.print(" < " + y);
		}
	}
}
