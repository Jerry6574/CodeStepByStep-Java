/* MyProgram.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/stackqueue/reorder

Write a method named reorder that accepts as a parameter a queue of integers that 
are already sorted by absolute value, and modifies it so that the integers are sorted normally. 

For example, if a queue variable named q stores the following elements:
front {1, -2, 4, 5, -7, -9, -12, 28, -34} back

Then the call of reorder(q); should modify it to store the following values:
front {-34, -12, -9, -7, -2, 1, 4, 5, 28} back

Constraints: You may use a single stack as auxiliary storage.

 */
import java.util.*;

import acm.program.*;

public class Reorder extends ConsoleProgram {
    
    public void run() {
    	Queue<Integer> queue = new LinkedList<>();
    	queue.add(-10);
    	queue.add(30);
    	queue.add(15);
    	
    	reorder(queue);
    	println(queue);
    }
    
    public void reorder(Queue<Integer> queue){
    	Stack<Integer> stack = new Stack<>();
    	

    	while(!queue.isEmpty()) {
    		int max = Collections.max(queue);
    		int n = queue.poll();
    		
    		if(n == max) {
    			stack.push(n);
    		} else {
    			queue.add(n);
    		}
    	}
    	
    	while(!stack.isEmpty()) {
    		queue.add(stack.pop());
    	}
    }
}
