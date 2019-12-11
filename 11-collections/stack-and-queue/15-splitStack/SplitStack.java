/* SplitStack.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/stackqueue/splitStack

Write a method named splitStack that accepts as a parameter a Stack of integers, 
and re-orders it so that all the non-negative numbers are at the top in the reverse 
of their original relative order, and all the negative numbers are at the bottom in the 
reverse of their original relative order. 

For example, if passed the stack {4, 0, -1, 5, -6, -3, 2, 7}, 
your method should modify the stack to store {-3, -6, -1, 7, 2, 5, 0, 4}.

Constraints: Do not declare any auxiliary data structures (e.g. arrays, Grids, ArrayLists, etc.) 
other than a single Queue of integers.

 */
import java.util.*;

import acm.program.*;

public class SplitStack extends ConsoleProgram {
    
    public void run() {
    	Stack<Integer> stack = new Stack<>();
    	
    	stack.push(4);
    	stack.push(0);
    	stack.push(-1);
    	stack.push(5);
    	stack.push(-6);
    	stack.push(-3);
    	stack.push(2);
    	stack.push(7);
    	
    	splitStack(stack);
    	
    	println(stack.toString());
    }
    
    public void splitStack(Stack<Integer> stack) {
    	Queue<Integer> queue = new LinkedList<>();
    	
    	while(!stack.isEmpty()) {
    		queue.add(stack.pop());
    	}
    	
    	int queueSize = queue.size();
    	
    	
    	for(int i = 0; i < queueSize; i++) {
    		int n = queue.poll();
    		
    		// push negative numbers to stack first
    		if(n < 0) {
    			stack.push(n);
    		
    		// add positive number back to tail of queue
    		} else {
				queue.add(n);
			}
    	}
    	
    	while(!queue.isEmpty()) {
    		stack.push(queue.poll());
    	}
    }
}
