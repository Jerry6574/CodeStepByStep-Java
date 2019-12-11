/*

Solution to: https://www.codestepbystep.com/problem/view/java/recursion/hanoi

The Towers of Hanoi is a game where you have three pegs (#1, #2, and #3) and some circular disks of different sizes that slide onto the pegs. They all start on one peg, largest to smallest (largest on the bottom). The goal is to move all the disks to another peg by following these rules: you may only move one disk at a time from peg to peg; no disk may be placed on top of a smaller disk.

Write a recursive method named hanoi that prints a solution to the classic Towers of Hanoi puzzle. Your method should accept three integer parameters representing the number of disks, the starting peg number, and ending peg number. Your method should print the solution to the game to move from the given start peg to the given end peg. For example, the call of hanoi(3, 1, 3); should print the following output to move the three pegs from peg #1 to peg #3:

move disk 1 from peg 1 to peg 3
move disk 2 from peg 1 to peg 2
move disk 1 from peg 3 to peg 2
move disk 3 from peg 1 to peg 3
move disk 1 from peg 2 to peg 1
move disk 2 from peg 2 to peg 3
move disk 1 from peg 1 to peg 3

Constraints: Your solution should be recursive and should not use any loops or data structures.

 */

public class Hanoi {

	public static void main(String[] args) {
		hanoi(2, 1, 3);
	}
	
	public static void hanoi(int disks, int from, int to) {
		if(disks == 1) {
			System.out.println("move disk " + disks + " from peg " + from + " to peg " + to);
		} else {
			int temp = 0;
			if((from == 1 && to == 2) || (from == 2 && to == 1)) {
				temp = 3;
			} else if((from == 1 && to == 3) || (from == 3 && to == 1)){
				temp = 2;
			} else if((from == 2 && to == 3) || (from == 3 && to == 2)) {
				temp = 1;
			}
			
			hanoi(disks - 1, from, temp);
			System.out.println("move disk " + disks + " from peg " + from + " to peg " + to);
			hanoi(disks - 1, temp, to);
		}
	}
	
}
