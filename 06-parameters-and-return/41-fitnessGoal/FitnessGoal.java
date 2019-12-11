/* FitnessGoal.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/fitnessGoal

Write a method named fitnessGoal that accepts an integer parameter named goal, 
and prompts the user for how many minutes he/she exercises each day 
until they increase their minutes for goal consecutive days in a row.

For example, the call of fitnessGoal(3); must prompt the user until they increase their minutes for 3 days straight. 
If the user exercises for 5 minutes the first day and 10 minutes the second day, 
the user increased their minutes of exercise. 

But if the user exercises for only 8 minutes on the third day (or any amount less than 10), 
he/she did not increase, so the counting starts over. 
On the fourth day, the user would now need to exceed 8 to be increasing.

After prompting for minutes of exercise each day, 
print "Great job!" if their minutes are increasing or "Start over." 
if the minutes did not increase. We will implicitly assume that the user did not exercise on 
the day before the method begins running, so no matter how many minutes they exercise on day 1, 
they did a great job and have been increasing for 1 day.

The following log represents the console output from an example call of fitnessGoal(3); 
Your method should exactly match the behavior and output structure shown. 
(Console user input is shown like this for clarity.)

Train until you increase for 3 days.
Minutes? 5
Great job!
Minutes? 10
Great job!
Minutes? 8
Start over.
Minutes? 9
Great job!
Minutes? 11
Great job!
Minutes? 2
Start over.
Minutes? 10
Great job!
Minutes? 15
Great job!
Minutes? 20
Great job!
Reached your goal in 9 total days!

Notice that the method terminates when the user has increased for 3 straight days. 
In this case, it is the increase from 2 minutes to 10, then from 10 to 15, 
then from 15 to 20. If the call had instead been fitnessGoal(5);, 
we would re-prompt the user until their minutes had been increasing for 5 straight days.

Assumptions: You may assume that the parameter value passed will be a positive integer, 
and you may assume that the user will type a positive integer for the number of minutes each day. 
You don't need to worry about pluralizing words in the output such as "day" vs "days."

Constraints: You should not use data structures such as arrays or strings to help you solve this problem. 
You may declare as many simple variables (such as ints or doubles) as you like.

 */
import acm.program.*;

public class FitnessGoal extends ConsoleProgram {
    
    public void run() {
    	fitnessGoal(3);
    }
    
    public void fitnessGoal(int goal) {
    	println("Train until you increase for " + goal + " days.");
    	
    	int nIncreases = 0;
    	int nDays = 0;
    	int previousMinute = 0;
    	
    	while(true) {
    		if(nIncreases == goal) {
    			println("Reached your goal in " + nDays + " total days!");
    			break;
    		}
    		
    		int minute = readInt("Minutes? ");
    		
    		if(minute > previousMinute) {
    			
    			println("Great job!");
    			nIncreases++;
    		} else {
    			println("Start over.");
    			nIncreases = 0;
    		}
    		previousMinute = minute;
    		
    		nDays++;
    	}
    }
    
}
