/*

Solution to: https://www.codestepbystep.com/problem/view/java/recursion/stutterStack

Write a recursive method named stutterStack that accepts a Stack of integers as a parameter and replaces every value in the stack with two occurrences of that value. For example, suppose a stack named s stores these values, from bottom => top:

{13, 27, 1, -4, 0, 9}
Then the call of stutterstack(s); should change the stack to store the following values:

{13, 13, 27, 27, 1, 1, -4, -4, 0, 0, 9, 9}
Notice that you must preserve the original order. In the original stack the 9 was at the top and would have been popped first. In the new stack the two 9s would be the first values popped from the stack. If the original stack is empty, the result should be empty as well.

Constraints: Your solution must be recursive. Do not use any loops. Do not use any auxiliary collections or data structures to solve this problem.

 */

import java.util.Stack;

public class StutterStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		stutterStack(s);
		
		System.out.println(s.toString());
	}
	
	public static void stutterStack(Stack<Integer> s) {
		if(s.size() == 0) {
			return;
		} else {
			int top = s.pop();
			stutterStack(s);
			s.push(top);
			s.push(top);
		}
	}
}
