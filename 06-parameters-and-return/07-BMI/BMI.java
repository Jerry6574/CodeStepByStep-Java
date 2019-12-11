/* BMI.java

Solution to https://www.codestepbystep.com/problem/view/java/parameters/BMI

Write a console program in a class named BMI that prompts for user input and 
calculates 2 people's body mass index (BMI), using the following formula:

BMI = weight / height^2 * 703
The BMI rating groups each person into one of the following four categories:

BMI				Category
below 18.5		class 1
18.5 - 24.9		class 2
25.0 - 29.9		class 3
30.0 and up		class 4

Match the following example output:

This program reads data for two people
and computes their body mass index (BMI).

Person 1's information:
height (in inches)? 70.0
weight (in pounds)? 194.25
BMI = 27.9
class 3

Person 2's information:
height (in inches)? 62.5
weight (in pounds)? 130.5
BMI = 23.5
class 2

Have a nice day!

 */
import acm.program.*;

public class BMI extends ConsoleProgram {
    
    public void run() {
    	println("This program reads data for two people");
    	println("and computes their body mass index (BMI)." + "\n");
    	
    	for(int i = 1; i <= 2; i++) {
    		calculateBMI(i);
    	}
    	
    	println("Have a nice day!");
    }
    
    public void calculateBMI(int person) {
    	println(String.format("Person %d's information: ", person));
    	
    	double height = readDouble("height (in inches)? ");
    	double weight = readDouble("weight (in pounds)? ");
    	
    	double bmi = weight / Math.pow(height, 2) * 703;
    	println(String.format("BMI = %.1f", bmi));
    	
    	String category = categorize(bmi);
    	println(category + "\n");
    }
    
    public String categorize(double bmi) {
    	String category;
    	if(bmi > 0 && bmi <= 18.5) {
    		category = "class 1";
    	} else if(bmi > 18.5 && bmi <= 24.9) {
    		category = "class 2";
    	} else if(bmi > 24.9 && bmi <= 29.9) {
    		category = "class 3";
    	} else {
    		category = "class 4";
    	}
    	return category;
    }
    
}
