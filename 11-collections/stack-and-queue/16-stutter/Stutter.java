/* Stutter.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/stackqueue/stutter

Write a method named stutter that accepts a queue of integers as a 
parameter and replaces every element with two copies of itself. 
For example, if a queue named q stores {1, 2, 3}, the call of stutter(q); 
should change it to store {1, 1, 2, 2, 3, 3}.

Constraints: Do not use any auxiliary collections as storage.

 */

import java.util.LinkedList;
import java.util.Queue;

import acm.program.*;

public class Stutter extends ConsoleProgram {
    
    public void run() {
    	Queue<Integer> q = new LinkedList<>();
    	q.add(1);
    	q.add(2);
    	q.add(3);
    	stutter(q);
    	
    	println(q.toString());
    }
    
    public void stutter(Queue<Integer> q) {
    	
    	int qOriginalSize = q.size();
    	
    	for(int i = 0; i < qOriginalSize; i++) {
    		int n = q.poll();
    		q.add(n);
    		q.add(n);
    	}
    }
}
