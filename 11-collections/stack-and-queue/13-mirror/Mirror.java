/* Mirror.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/stackqueue/mirror

Write a method named mirror that accepts a queue of strings as a parameter and appends 
the queue's contents to itself in reverse order. 
For example, if a queue named q stores {"a", "b", "c"}, the call of mirror(q); 
should change it to store {"a", "b", "c", "c", "b", "a"}.

Constraints: You may declare a single stack or queue as auxiliary storage.

 */

import java.util.*;

import acm.program.*;

public class Mirror extends ConsoleProgram {
    
    public void run() {
    	Queue<String> queue = new LinkedList<>();
    	queue.add("a");
    	queue.add("b");
    	queue.add("c");
    	
    	mirror(queue);
    	println(queue.toString());
    }
    
    public void mirror(Queue<String> queue) {
    	Stack<String> stack = new Stack<>();
    	
    	// reverse queue
    	for(int i = 0; i < queue.size(); i++) {
    		String s = queue.poll();
    		stack.push(s);
    		queue.add(s);
    	}
    	
    	// reverse queue again to restore initial sequence
    	for(int i = 0; i < queue.size(); i++) {
    		String s = queue.poll();
    		queue.add(s);
    	}
    	
    	// add a reversed queue sequence from stack
    	while(!stack.isEmpty()) {
    		queue.add(stack.pop());
    	}
    }
}
