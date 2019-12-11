/* RandomWalk.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/randomWalk

Write a method named randomWalk that simulates a 1-dimensional "random walk" algorithm. 
A random walk is where an integer value is repeatedly increased or decreased 
by 1 randomly many times until it hits some threshold. 

Your method should accept the integer threshold as a parameter, 
then start an integer at 0 and adjust it by +1 or -1 repeatedly until 
its value reaches positive or negative threshold. 
For example, if the call of randomWalk(3); is made, your method would randomly walk until it hits 3 or -3. 

Each time the value is adjusted, it is printed in the format shown. 
When you have reached the threshold, report the number of steps that were taken from the starting point of 0, 
as well as the maximum position that was reached during the walk. 
(If the walk ever reaches positive threshold, that is the maximum position.)

The log below shows the output from an example call of randomWalk(3); . 
You should match the output format below exactly, though the numbers are randomly generated. 
Use a RandomGenerator object and give an equal chance of moving by +1 and -1 on each step. 
If the threshold parameter passed to your method is not greater than 0, your method should produce no output.

Position = 0
Position = 1
Position = 0
Position = -1
Position = -2
Position = -1
Position = -2
Position = -3
Finished after 7 step(s)
Max position = 1

(Because this problem uses random numbers, it is hard for our system to perfectly verify your code. Make sure to match our output format exactly.)

 */


import acm.program.*;
import acm.util.RandomGenerator;

public class RandomWalk extends ConsoleProgram {
    
    public void run() {
    	randomWalk(5);
    }
    
    public void randomWalk(int steps) {
    	
    	if(steps < 1) {
    		return;
    	}
    	
    	int currentPosition = 0;
    	int maxPosition = 0;
    	int nSteps = 0;
    	
    	RandomGenerator rgen = new RandomGenerator();
    	
    	while(true) {
    		boolean nextPositiveStep = rgen.nextBoolean();
    		
    		if(nextPositiveStep) {
    			currentPosition++;
    			if(currentPosition > maxPosition) {
    				maxPosition = currentPosition;
    			}
    		} else {
    			currentPosition--;
    		}
    		
    		println("Position = " + currentPosition);
    		nSteps++;
    		
    		if(Math.abs(currentPosition) == steps) {
    			println("Finished after " + nSteps + " step(s)");
    			println("Max position = " + maxPosition);
    			return;
    		}
    		
    	}
    }
}
