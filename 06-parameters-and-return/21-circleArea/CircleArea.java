/* CircleArea.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/circleArea

Write a method named circleArea that accepts the radius of a circle as a parameter (as a real number) 
and returns the area of a circle with that radius. 

For example, the call of area(2.0) should return 12.566370614359172. 
You may assume that the radius passed is a non-negative number.

 */
import acm.program.*;

public class CircleArea extends ConsoleProgram {
    
    public void run() {
    	double radius = 10.0;
    	println(circleArea(radius));
    	
    }
    
    public double circleArea(double r) {
    	return Math.PI * Math.pow(r, 2);
    }
    
}
