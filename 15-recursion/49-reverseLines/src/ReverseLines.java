/*
Solution to: https://www.codestepbystep.com/problem/view/java/recursion/reverseLines

Write a recursive method named reverseLines that accepts a file Scanner as its parameter and prints the lines of that file in reverse order. For example, if an input file named poem.txt contains the following text:

Roses are red,
Violets are blue.
All my base
Are belong to you.

Then the call of reverseLines(new Scanner(new File("poem.txt"))); should produce the following console output:

Are belong to you.
All my base
Violets are blue.
Roses are red,

You may assume that the input file exists and is readable.

Constraints: Your solution should read the file only once, not make multiple passes over the file data. Your method must be recursive.

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReverseLines {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(new File("poem.txt"));
			reverseLines(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	public static void reverseLines(Scanner input) {
		if(!input.hasNextLine()) {
			return;
		} else {
			String line = input.nextLine();
			reverseLines(input);
			System.out.println(line);
		}
	}
}
