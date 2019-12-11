/* FlipHalf.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/stackqueue/flipHalf

Write a method named flipHalf that reverses the order of half of the elements of a Queue of 
integers passed as a parameter. Your method should reverse the order of all the elements in 
odd-numbered positions (position 1, 3, 5, etc.) assuming that the first value in the queue has position 0. 
For example, if the queue originally stores this sequence of numbers when the method is called:

index: 0  1  2  3  4  5   6   7
front {1, 8, 7, 2, 9, 18, 12, 0} back

Then it should store the following values after the method finishes executing:

index: 0  1  2  3   4  5  6   7
front {1, 0, 7, 18, 9, 2, 12, 8} back

Notice that numbers in even positions (positions 0, 2, 4, 6) have not moved. 
That sub-sequence of numbers is still: (1, 7, 9, 12). But notice that the numbers in odd positions 
(positions 1, 3, 5, 7) are now in reverse order relative to the original. 
In other words, the original sub-sequence: (8, 2, 18, 0) - has become: (0, 18, 2, 8).

Constraints: You may use a single stack as auxiliary storage.

 */
import java.util.*;

import acm.program.*;

public class FlipHalf extends ConsoleProgram {
    
    public void run() {
    	Queue<Integer> queue = new LinkedList<>();
    	queue.add(10);
    	queue.add(2);
    	queue.add(20);
    	queue.add(1);
    	queue.add(30);
    	
    	flipHalf(queue);
    	
    	println(queue.toString());
    }
    
    public void flipHalf(Queue<Integer> queue) {
    	Stack<Integer> stack = new Stack<>();
    	
    	int queueSize = queue.size();
    	
    	for(int i = 0; i < queueSize; i++) {
    		int n = queue.poll();
    		
    		if(i % 2 == 1) {
    			stack.push(n);
    		} else {
    			queue.add(n);
    		}
    	}
    	
    	while(!stack.isEmpty()) {
    		int n = queue.poll();
    		queue.add(n);
    		queue.add(stack.pop());
    	}
    	
    	// when queue size is odd, queue needs to deque and enque (queueSize / 2) + 1 times
        if(queueSize % 2 == 1){
            int n = queue.poll();
            queue.add(n);
        }
    }
}
